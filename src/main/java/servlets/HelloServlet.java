package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Credit;
import service.Calculator;
import service.ValidatorService;


@WebServlet("/kredyt")
public class HelloServlet extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		double kwotaKredytu = Double.parseDouble(request.getParameter("kwotaKredytu"));
		int iloscRat = Integer.parseInt(request.getParameter("iloscRat"));
		double oproc = Double.parseDouble(request.getParameter("oproc"));
		double oplataStala = Double.parseDouble(request.getParameter("oplataStala"));
		String rodzaj = request.getParameter("rodzaj");
		
		Credit credit = new Credit(kwotaKredytu, iloscRat, oproc, oplataStala, rodzaj);
		ValidatorService validator = new ValidatorService(credit);
		Calculator calculator = new Calculator(credit);
		calculator.calculate();
		request.setAttribute("raport", calculator.getRaport());
		
		// response.sendRedirect("rozliczenie.jsp");
		request.getRequestDispatcher("rozliczenie.jsp").forward(request, response);
	}
}