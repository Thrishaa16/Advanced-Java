/* 6a. Build a servlet program to find the factorial of a number using HTML with step by step 
procedure.*/


package com.factorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            int number = Integer.parseInt(request.getParameter("number"));
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative");
            }
            if (number > 20) {
                throw new IllegalArgumentException("Number too large, maximum allowed is 20");
            }

            long factorial = 1;
            StringBuilder calculation = new StringBuilder("Calculation steps:<br>");
            if (number <= 1) {
                factorial = 1;
                calculation.append(number).append("! = 1");
            } else {
                calculation.append(number).append("! = ").append(number);
                for (int i = number - 1; i >= 1; i--) {
                    factorial *= (i + 1);
                    calculation.append(" × ").append(i);
                }
                factorial *= 1;
                calculation.append(" = ").append(factorial);
            }

            out.println("<html><head><title>Factorial Result</title><style>"
                + ".container{margin:20px;padding:20px;width:500px;border:1px solid #ccc;"
                + "border-radius:5px;} .result{margin:10px 0;}</style></head><body>"
                + "<div class='container'><h2>Factorial Result</h2>"
                + "<div class='result'><p>Number: " + number + "</p>"
                + "<p>Factorial: " + factorial + "</p>"
                + "<p>" + calculation + "</p></div>"
                + "<a href='index.html'>Calculate Another Factorial</a>"
                + "</div></body></html>");
        } catch (NumberFormatException e) {
            displayError(out, "Please enter a valid number");
        } catch (IllegalArgumentException e) {
            displayError(out, e.getMessage());
        }
    }

    private void displayError(PrintWriter out, String message) {
        out.println("<html><head><title>Error</title></head><body>"
            + "<div style='margin:20px;color:red;'><h2>Error</h2>"
            + "<p>" + message + "</p>"
            + "<a href='index.html'>Try Again</a>"
            + "</div></body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
