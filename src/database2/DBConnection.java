package database2;

import java.sql.*;

public class DBConnection {

    private static Connection connection;

    public static Connection getConn() {
        if(connection == null) {

            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                String username = "root";
                String password = "";
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datakaryawan2", username, password);
//                Statement stmt = connection.createStatement();

                /*UPDATE*/
    //            stmt.executeUpdate("UPDATE karyawan SET nama_karyawan='Jedidta Adoni Saputra'");

                /*SELECT*/
    //            ResultSet result = stmt.executeQuery("SELECT * FROM karyawan");
    //            while (result.next()) {
    //                String Nama = result.getString("nama_karyawan");
    //                String TempatLahir = result.getString("tempat_lahir");
    //                String tglLahir = result.getString("tgl_Lahir");
    //                String Alamat = result.getString("alamat");
    //                String Pendidikan = result.getString("pendidikan");
    //                String Status = result.getString("status");
    //
    //                System.out.println("Nama Karyawan " + Nama);
    //                System.out.println("Tempat Lahir " + TempatLahir);
    //                System.out.println("Tanggal Lahir " + tglLahir);
    //                System.out.println("Alamat " + Alamat);
    //                System.out.println("Pendidikan " + Pendidikan);
    //                System.out.println("Status " + Status);
    //            }

                /*INSERT*/
                // stmt.executeUpdate("INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `tempat_lahir`, `tgl_lahir`, `alamat`, `pendidikan`, `status`) VALUES (NULL, 'Jedidta', 'Jogjakarta', '2003-09-12', 'Gamping', 'S1', 'tetap')");


                /*DELETE*/
    //            stmt.executeUpdate("DELETE FROM karyawan WHERE id_karyawan=3");

            } catch ( SQLException e ) {
                System.out.println("koneksi gagal");
            }
        }

        return connection;
    }
}
