package servlets;

import models.Factorization;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Сервлет для отображения главной страницы.
 */
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setStatus(200);

        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");

        Enumeration en = request.getParameterNames();
        while (en.hasMoreElements()) {

            String name = (String) en.nextElement();

            String value = request.getParameter(name);

            String[] values = request.getParameterValues(name);

            for (int i = 0; i < values.length; i++) {
                out.println(" " + values[i] + " = ");
                int number = Integer.parseInt(values[i]);
                String result = Factorization.Factor(number);
                out.print(result);
            }

        }
        out.close();


    }
}
