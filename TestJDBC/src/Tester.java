import java.sql.*;

class Tester {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/om"; // table details
            String username = "root"; // MySQL credentials
            String password = "";
            String query = "select * from Student"; // query to be run

            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query); // Execute query

            // Print all data from the Student table
            while (rs.next()) {
                int std_id = rs.getInt("std_id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String address = rs.getString("Address");
                Date dob = rs.getDate("DOB");
                int facultyid = rs.getInt("facultyid");

                System.out.println("ID: " + std_id + ", First Name: " + fname + ", Last Name: " + lname + ", Address: " + address + ", DOB: " + dob + ", Faculty ID: " + facultyid);
            }

            st.close(); // close statement
            con.close(); // close connection
            System.out.println("Connection Closed....");

        } catch (Exception e) {
            e.printStackTrace(); // Print exception details
        }
    }
}
