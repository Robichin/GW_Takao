package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecoundServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		//送信されてくるパラメータのエンコーディングの指定
		req.setCharacterEncoding("UTF-8");

		//送信したパラメータの取得(文字列)
		String param =req.getParameter("param");

		//以下、HTML形式で出力されるためのコード
		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<hrml>");
		out.print("<head>");
		out.print("<body>");
		out.print("<h1>" + param + "</h1>");
		out.print("</body>");
		out.print("</head>");
		out.print("</html>");
		out.close();
	}
}
