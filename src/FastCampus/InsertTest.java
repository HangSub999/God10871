package FastCampus;

/*import org.h2.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement stmt = null;


        try {
            DriverManager.registerDriver(new Driver());

            // 2 단계 :  H2와 커넥션 (고속도로) 연결
            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test");

            // 3 단계 : 스테이트먼트(고속버스) 생성
            String sql = "insert into student values(?,?,?,?)";
            stmt = conn.prepareStatement(sql);

            // SQL 파라미터(?)에 값 설정
            stmt.setString(1, "STD-000009");
            stmt.setString(2, "조항섭");
            stmt.setInt(3, 98);
            stmt.setString(4, "컴퓨터공학");

            // 4 단계 : SQL 전송
            int count = stmt.executeUpdate();
            System.out.println(count + "건의 데이터가 처리되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("프로그램 종료");
        }


    }
}
*/