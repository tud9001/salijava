package testcon;
import sqlcon.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class create {

    public static void save(sala student) throws SQLException {
        String sql = "INSERT INTO testtt(id,nume) VALUES(?,?)";
        PreparedStatement preparedStatement = mysqlconnect.getConnection().prepareStatement(sql);
        //preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(2, student.getNume());
        //preparedStatement.setInt(3, student.getIdFacultate());
        preparedStatement.execute();
    }
    public static sala findByUsername(String username) throws SQLException {
        Statement statement = mysqlconnect.getConnection().createStatement();
        String sql = "SELECT * FROM testtt WHERE nume '" + username + "'";

        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            sala student = new sala(
                    resultSet.getString("nume")

            );
            return student;
        } else
            return null;
    }
}
