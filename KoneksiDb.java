
import java.sql.*;

/**
 *      Nama    : St. Hatijah H. Ilyas
 *      Stambuk : 13020180061
 *      Tanggal : 17 Juni 2020
 *      Waktu   : 14.05 WITA
 */
public class KoneksiDb {
    static Connection con = null;

    public static Connection getConnection() {
        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/nilai_mhs";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Terkoneksi");
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
        return con;
    }
}
