import java.sql.*;
import java.util.Scanner;

public class RegistrationSystem {
        public static void main(String[] args) {
        Connection con = DBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Course Registration System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Courses");
            System.out.println("3. Register Student for Course");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        addStudent(con, sc);
                        break;

                    case 2:
                        viewCourses(con);
                        break;

                    case 3:
                        registerStudent(con, sc);
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input Error: Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void addStudent(Connection con, Scanner sc) throws Exception {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        PreparedStatement ps = con.prepareStatement("INSERT INTO students(name,email) VALUES(?,?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.executeUpdate();

        System.out.println("Student Added Successfully!");
    }

    private static void viewCourses(Connection con) throws Exception {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM courses");

        System.out.println("\nAvailable Courses:");
        while (rs.next()) {
            System.out.println(rs.getInt("course_id") + ": " + rs.getString("course_name"));
        }
    }

    private static void registerStudent(Connection con, Scanner sc) throws Exception {
        System.out.print("Enter Student ID: ");
        int sid = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Course ID: ");
        int cid = Integer.parseInt(sc.nextLine());

        PreparedStatement ps = con.prepareStatement("INSERT INTO registrations(student_id, course_id) VALUES(?,?)");
        ps.setInt(1, sid);
        ps.setInt(2, cid);
        ps.executeUpdate();

        System.out.println("Student Registered Successfully!");
    }
}


