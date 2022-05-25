package unit05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset = utf-8");
		String id = request.getParameter("id");
//		String age = request.getParameter("age");
		int age = Integer.parseInt(request.getParameter("age"));
		// null값이 들어오면 integer 타입은 null값을 정수로 바꿀수없어서 에러남
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("당신이 입력한 정보입니다.<br>");
		out.println("id = " + id);
		out.println("<br> age = " + age);
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
	}

}
