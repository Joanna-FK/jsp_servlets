package serwer.app;

import serwer.app.model.ProductStorage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/product_list")
public class ProductListServlet extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        request.setAttribute("product", ProductStorage.productList.get(Integer.parseInt(id)));

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product_list.jsp");
        requestDispatcher.forward(request, response);
    }
}
