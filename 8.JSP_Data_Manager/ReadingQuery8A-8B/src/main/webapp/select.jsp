<%---8a. Read all the existing records from the table coffee which is from the database test and insert a
 new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and 
JSP to get the fields and display the results respectively--%>

<%@ page import="java.sql.*, java.util.Properties" %>

<html>

<head>

    <title>Coffee Table Data</title>

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

            out.println("<h2>Successfully connected to MySQL database 'test'</h2>");

        }



        // Step 1: Display all existing coffee records

        String query = "SELECT * FROM coffee";

        st = dbConnection.createStatement();

        rs = st.executeQuery(query);



        out.println("<h3>Existing Coffee Records:</h3>");

        out.println("<table border='1'><tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        while (rs.next()) {

            int id = rs.getInt("id");

            String coffee_name = rs.getString("coffee_name");

            int price = rs.getInt("priced");

            out.println("<tr><td>" + id + "</td><td>" + coffee_name + "</td><td>" + price + "</td></tr>");

        }

        out.println("</table>");



        // Step 2: Insert new record

        String insertQuery = "INSERT INTO coffee (coffee_name, priced) VALUES (?, ?)";

        PreparedStatement pstmt = dbConnection.prepareStatement(insertQuery);

        pstmt.setString(1, "Tajmahal");

        pstmt.setInt(2, 950);



        int rowsInserted = pstmt.executeUpdate();

        if (rowsInserted > 0) {

            out.println("<p style='color:green;'>New coffee record inserted successfully!</p>");

        }



        pstmt.close();

        rs.close();

        st.close();

        dbConnection.close();



    } catch (Exception e) {

        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");

           }

%>

</body>

</html>
