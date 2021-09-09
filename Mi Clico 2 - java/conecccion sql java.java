public static void main(String[] args) throws SQLException, ClassNotFoundException {
    // Load the JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver loaded");
    // Connect to a database
    //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "misiontic", "misionTIC2021");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/universidad", "misiontic", "misionTIC2021");
    System.out.println("Database connected");
    // Create a statement
    Statement statement = connection.createStatement();
    // Execute a statement
    ResultSet resultSet = statement.executeQuery("SELECT * FROM actor");
    // Iterate through the result and print the student names
    while (resultSet.next()) {
        System.out.println(resultSet.getString(1) + "\t"
                + resultSet.getString(2) + "\t" + resultSet.getString(3));
    }
    // Close the coneccion
    connection.close();
}
