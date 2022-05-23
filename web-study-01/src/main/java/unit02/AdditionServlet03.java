package unit02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdditionServlet03")
public class AdditionServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = 20;
		int n2 = 10;
		
		int add = n1 + n2;
		
		request.setAttribute("num1", n1);
		request.setAttribute("num2", n2);
		request.setAttribute("add", add); //  각 값을 저장
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("addition03.jsp"); // request로 저장
		dispatcher.forward(request, response); //response로 보내서 jsp에서 출력
	}

}
