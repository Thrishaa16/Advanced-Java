<%@ page import="java.sql.*" %>
<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
int totalSalary = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
    stmt = conn.createStatement();
    rs = stmt.executeQuery("SELECT * FROM Emp");

    out.println("<h2>Salary Report</h2>");
    out.println("<pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");
    while (rs.next()) {
        int eno = rs.getInt("EmpNo");
        String ename = rs.getString("EmpName");
        int basic = rs.getInt("BasicSalary");

        out.println("<pre>Emp_No     : " + eno + "</pre>");
        out.println("<pre>Emp_Name   : " + ename + "</pre>");
        out.println("<pre>Basic      : " + basic + "</pre>");
        out.println("<pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");

        totalSalary += basic;
    }
    out.println("<pre>Grand Salary   : " + totalSalary + "</pre>");
    out.println("<pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (rs != null) rs.close();
    if (stmt != null) stmt.close();
    if (conn != null) conn.close();
}
%>
