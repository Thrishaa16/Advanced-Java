<%@ page import="java.sql.*, java.util.Properties" %>
<html>
<head>
    <title>Coffee Names Starting with 'D'</title>
</head>
<body>
<%
    Connection dbConnection = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        String url = "jdbc:mysql://localhost/test";
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "");

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(url, info);

        if (dbConnection != null) {
            out.println("<h2>Connected to MySQL database 'test'</h2>");
        }

        String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        st = dbConnection.createStatement();
        rs = st.executeQuery(query);

        out.println("<h3>Coffee Names Starting with 'D':</h3>");
        out.println("<table border='1'><tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");
        while (rs.next()) {
            int id = rs.getInt("id");
            String coffee_name = rs.getString("coffee_name");
            int price = rs.getInt("priced");
            out.println("<tr><td>" + id + "</td><td>" + coffee_name + "</td><td>" + price + "</td></tr>");
        }
        out.println("</table>");

        rs.close();
        st.close();
        dbConnection.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        e.printStackTrace(out);
    }
%>
</body>
</html>