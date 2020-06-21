/**
 *      Nama    : St. Hatijah H. Ilyas
 *      Stambuk : 13020180061
 *      Tanggal : 17 Juni 2020
 *      Waktu   : 14.25 WITA
 */


import java.sql.*;
import java.util.*;

public class ImplNilaiMhs implements InterfaceNilaiMhs {

    @Override
    public mahasiswa insert(mahasiswa siswa) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("insert into mhs values(?,?,?,?)");
        st.setString(1, siswa.getNama());
        st.setInt(2, siswa.getTgsM());
        st.setInt(3, siswa.getTgsP());
        st.setInt(4, siswa.getUts());
        st.setInt(5, siswa.getUas());
        st.setInt(6, siswa.getKehadiran());
        st.executeUpdate();

        return siswa;
    }

    @Override
    public void update(mahasiswa siswa) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("update mhs set `Tugas Mandiri/Kuis`=?,`Tugas Proyek`=?,UTS=?, UAS=?,Kehadiran=? where `Nama Mahasiwa`=?");

        st.setString(1, siswa.getNama());
        st.setInt(2, siswa.getTgsM());
        st.setInt(3, siswa.getTgsP());
        st.setInt(4, siswa.getUts());
        st.setInt(5, siswa.getUas());
        st.setInt(6, siswa.getKehadiran());
        st.executeUpdate();

    }

    @Override
    public void delete(String nama) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("delete from mhs  where `Nama Mahasiwa`=?");
        st.setString(1, nama);
        st.executeUpdate();
    }

    @Override
    public List getAll() throws SQLException {
        Statement st = KoneksiDb.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from mhs");
        List list = new ArrayList();
        while (rs.next()) {
            mahasiswa p = new mahasiswa();
            p.setNama(rs.getString("nama"));
            p.setTgsM(rs.getInt("tgsM"));
            p.setTgsP(rs.getInt("tgsP"));
            p.setUts(rs.getInt("uts"));
            p.setUas(rs.getInt("uas"));
            p.setKehadiran(rs.getInt("kehadiran"));
            list.add(p);
        }
        return list;
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}