package bai1.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/shared")
public class SharedServlet extends HttpServlet {






    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("message", "Welcome to FPT Polytechnic!");
        req.setAttribute("now", new Date());

        req.getRequestDispatcher("/ba1_lab2/page.jsp").forward(req, resp);
    }
}
