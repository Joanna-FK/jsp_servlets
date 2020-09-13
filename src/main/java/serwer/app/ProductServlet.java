package serwer.app;


import serwer.app.model.ProductDetails;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDetails one = new ProductDetails("butter", 2.5, 1);

        request.setAttribute("product", one );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product.jsp");
        requestDispatcher.forward(request, response);

    }
}
