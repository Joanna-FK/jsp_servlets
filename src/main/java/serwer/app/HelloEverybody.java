package serwer.app;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloEverybody")

public class HelloEverybody extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("head");
        out.println("<title>Hello Everybody!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello Everybody@@@@@@@@@@@@!!!!!!!!!!!!!!!!!</h1");
        out.println("</body>");
        out.println("</html>");
    }
}
