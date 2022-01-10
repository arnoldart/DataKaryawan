package database2;

import java.sql.*;

public class connection {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datakaryawan2", username, password);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `tempat_lahir`, `tgl_lahir`, `alamat`, `pendidikan`, `status`) VALUES (NULL, 'Jedidta', 'Jogjakarta', '2003-09-12', 'Gamping', 'S1', 'tetap')");
        } catch ( SQLException e ) {
            System.out.println("koneksi gagal");
        }
    }
}
