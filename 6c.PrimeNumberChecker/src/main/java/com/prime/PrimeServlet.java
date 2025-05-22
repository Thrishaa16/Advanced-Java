/*6c. Build a servlet program to check the given number is prime number or not using HTML with step
 by step procedure.*/

package com.prime;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/checkPrime")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Prime Number Checker</h2>");
            out.println("<p>The number <strong>" + number + "</strong> is "
                    + (isPrime ? "<span style='color:green;'>a Prime</span>" : "<span style='color:red;'>not a Prime</span>")
                    + " number.</p>");
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body><p style='color:red;'>Invalid input. Please enter a valid integer.</p>");
            out.println("<a href='index.html'>Back</a></body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
