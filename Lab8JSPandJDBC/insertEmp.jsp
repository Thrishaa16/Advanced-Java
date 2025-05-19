<%@ page import="java.sql.*" %>
<%
String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String salary = request.getParameter("salary");

Connection conn = null;
PreparedStatement stmt = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

    String sql = "INSERT INTO Emp (EmpNo, EmpName, BasicSalary) VALUES (?, ?, ?)";
    stmt = conn.prepareStatement(sql);
    stmt.setInt(1, Integer.parseInt(empno));
    stmt.setString(2, empname);
    stmt.setInt(3, Integer.parseInt(salary));

    stmt.executeUpdate();

    out.println("<h3>Employee inserted successfully!</h3>");
} catch (SQLIntegrityConstraintViolationException e) {
    out.println("<h3 style='color:red;'>Error: Employee number already exists!</h3>");
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (stmt != null) stmt.close();
    if (conn != null) conn.close();
}
%>
