import java.sql.SQLException;
import java.util.List;

/**
 *      Nama    : St. Hatijah H. Ilyas
 *      Stambuk : 13020180061
 *      Tanggal : 17 Juni 2020
 *      Waktu   : 14.19 WITA
 */

public interface InterfaceNilaiMhs {
    mahasiswa insert(mahasiswa siswa) throws SQLException;
    void update(mahasiswa siswa) throws SQLException;
    void delete(int id) throws SQLException;
    List getAll() throws SQLException;
}