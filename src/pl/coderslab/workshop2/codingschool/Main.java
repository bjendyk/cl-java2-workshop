package pl.coderslab.workshop2.codingschool;

import pl.coderslab.workshop2.codingschool.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String username = "root";
        String password = "coderslab";
        String database = "coding_school";

        try (Connection conn = ConnectionFactory.getConnection(username, password, database)) {
            ArrayList<User> allUsers = User.getAllUsers(conn);
            for (User user: allUsers) {
                System.out.println(user);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
