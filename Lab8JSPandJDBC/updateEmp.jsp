<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Update and Display Emp</title></head>
<body>
<%
    String empnoStr = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String salaryStr = request.getParameter("basicsalary");

    boolean updated = false;
    int grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

        if (empnoStr != null && empname != null && salaryStr != null) {
            int empno = Integer.parseInt(empnoStr);
            int basicsalary = Integer.parseInt(salaryStr);

            PreparedStatement updateStmt = conn.prepareStatement(
                "UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_NO=?");
            updateStmt.setString(1, empname);
            updateStmt.setInt(2, basicsalary);
            updateStmt.setInt(3, empno);

            int rows = updateStmt.executeUpdate();
            if (rows > 0) updated = true;

            updateStmt.close();
        }

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Employee Salary Report</h2>");
        while (rs.next()) {
            int id = rs.getInt("Emp_NO");
            String name = rs.getString("Emp_Name");
            int salary = rs.getInt("Basicsalary");
            grandTotal += salary;
%>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No     : <%= id %>
Emp_Name   : <%= name %>
Basic      : <%= salary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<%
        }

        out.println("<pre>Grand Salary   : " + grandTotal + "</pre>");

        rs.close();
        stmt.close();
        conn.close();

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }

    if (updated) {
        out.println("<p style='color:green;'>Record updated successfully!</p>");
    }
%>
</body>
</html>
