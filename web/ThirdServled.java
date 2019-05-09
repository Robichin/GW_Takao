package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServled extends HttpServlet{


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		//送信されてくるパラメータのエンコーディングの指定
		req.setCharacterEncoding("UTF-8");

		//送信したパラメータの取得(文字列)
		String param =req.getParameter("param");
		String sele =req.getParameter("sele");
		String a =req.getParameter("a");
		String hito =req.getParameter("hito");
		String tye =req.getParameter("1");
		String tyo =req.getParameter("2");
		String tya =req.getParameter("3");

		//以下、HTML形式で出力されるためのコード
		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<hrml>");
		out.print("<head>");
		out.print("<body>");
		out.print("<h1>" + "お名前：" + param + "<br>" + "年齢：" + sele + "<br>" + "性別：" + a + "<br>" +"</h1>");
		out.print("<h1>" + "興味のある言語：" + tye + "・" + tyo + "・" + tya + "<br>" + "</h1>");
		out.print("<h1>" + "なにか一言：" + hito + "<br>" + "</h1>");
		out.print("</body>");
		out.print("</head>");
		out.print("</html>");
		out.close();
	}
}
