import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class VeriTabaniYoneticisi {
    private static final String URL = "jdbc:sqlite:scooters.db";

    public static Connection baglan(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL);
        }
        catch (SQLException e){
            System.err.println("Bağlantı hatası : " + e.getMessage());
        }
        return connection;
    }


    public static void tabloOLustur(){
        String sql = """
                CREATE TABLE IF NOT EXISTS araclar (
                arac_id TEXT PRIMARY KEY,
                tip TEXT NOT NULL,
                sarj_yuzdesi INTEGER NOT NULL,
                konum TEXT NOT NULL,
                durum TEXT NOT NULL
                );""";

        try (Connection connection = baglan();
            Statement statement = connection.createStatement()){

            statement.execute(sql);

        }
        catch (SQLException e){
            System.err.println("Tablo oluşturma hatası : " + e.getMessage());
        }
    }

    public static List<Arac> verileriYukle(){
        List<Arac> dbAraclar = new ArrayList<>();
        String sql = "SELECT * FROM araclar";

        try (Connection connection = baglan();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()) {
                String id = rs.getString("arac_id");
                String tip = rs.getString("tip");
                int sarj = rs.getInt("sarj_yuzdesi");
                String konum = rs.getString("konum");

                String durumStr = rs.getString("durum");
                AracDurumu durumEnum = AracDurumu.valueOf(durumStr);

                if (tip.equals("Pro")) {
                    dbAraclar.add(new ProScooter(id, sarj, konum, durumEnum));
                } else {
                    dbAraclar.add(new StandartScooter(id, sarj, konum, durumEnum));
                }
            }
            System.out.println("Veritabanı kayıtları başarıyla okundu!");

        }
        catch (SQLException e){
            System.err.println("Database yüklenirken hata oluştur: " + e.getMessage());
        }



        return dbAraclar;
    }



    public static void durumGuncelle(String id,AracDurumu yeniDurum){
        String sql = "UPDATE araclar SET durum = ? WHERE arac_id = ?";

        try (Connection connection = baglan();
             PreparedStatement pstmt = connection.prepareStatement(sql)){

            pstmt.setString(1, yeniDurum.name());
            pstmt.setString(2,id);

            pstmt.executeUpdate();

        }
        catch (SQLException e){
            System.err.println("Güncelleme hatası: " + e.getMessage());
        }


    }



}



