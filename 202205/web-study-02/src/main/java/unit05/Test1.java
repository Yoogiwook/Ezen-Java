package unit05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset= utf-8");
		String name = request.getParameter("name");
		int A = Integer.parseInt(request.getParameter("a"));
		int B = Integer.parseInt(request.getParameter("b"));
		
		PrintWriter out = response.getWriter();
		out.println("이름 = " + name);
		out.println("<br>");
		out.println("A = " + A);
		out.println("<br>");
		out.println("B = " + B);
		out.println("<br>");
		out.println("A + B = " + (A + B));
		out.println("<br>");
		out.println("A * B = " + (A * B));
		out.println("<br>");
		out.println("A - B = " + (A - B));
		out.println("<br>");
		out.println("A / B = " + (A / B));
		out.println("<br>");
	}

}
