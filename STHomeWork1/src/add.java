import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class add {
    private String sql;
    private PreparedStatement pstmt;
    private Connection conn;
 
    public void Insert(StudentManager s) throws SQLException {
        Connection conn = DBC.getConnection();
        int i = 0;
        sql = "INSERT INTO `text2`.`student`(`name`, `sex`, `brithday`) VALUES (?,?,?)";
            pstmt =conn.prepareStatement(sql);
            pstmt.setString(1, s.getName());
            pstmt.setString(2, s.getSex());
            pstmt.setString(3, s.getBrithday());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
    }
 
    public void Update(int id,StudentManager s) throws SQLException {
        Connection conn = DBC.getConnection();
        int i = 0;
        sql ="UPDATE `text2`.`student` SET `name` = '"+s.getName()+"', `sex` = '"+s.getSex()+"', `brithday` = '"+s.getBrithday()+"' WHERE `id` = "+id;
            pstmt =conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
    }
 
 
    public void Delete(String name) throws SQLException {
        Connection conn = DBC.getConnection();
        int i = 0;
        sql ="DELETE FROM `text2`.`student` WHERE `name` = '"+name+"'";
            pstmt =conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
    }
 
   
    public void Select() throws SQLException {
        Connection conn = DBC.getConnection();
        sql = "SELECT * FROM student;";
        pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        StudentManager s = new StudentManager();
        while (rs.next()) {
            System.out.println(rs.getObject("id"));
            System.out.println(rs.getObject("name"));
            System.out.println(rs.getObject("sex"));
            System.out.println(rs.getObject("brithday"));
            System.out.println("---------------------------");
        }
        conn.close();
        pstmt.close();
        rs.close();
    }
}