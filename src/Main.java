
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KiralamaSistemi sistem = new KiralamaSistemi();



        int secenek = 0;

        while (secenek != 5){
            System.out.println("""
                1 - Tüm araçları listele
                2 - Araç ekle
                3 - Müsaitlik sorgulama
                4 - Araç kirala
                5 - Çıkış
                """);
            System.out.print("Seçeneğiniz : ");
            secenek = scanner.nextInt();
            scanner.nextLine();

            switch (secenek){
                case 1 ->{
                    sistem.tumAraclariListele();
                }
                case 2 ->{
                    String id;
                    System.out.println("--- Araç Ekleme ---");



                    System.out.println("""
                        --- Eklemek istediğiniz Scooter Türü ---
                        1 - Standart Scooter
                        2 - Pro Scooter
                        """);
                    int tur = scanner.nextInt();
                    if(tur == 1){
                        scanner.nextLine();
                        System.out.print("Arac ID : ");
                        id = scanner.nextLine();
                        if (sistem.idKontrol(id)){break;};
                        sistem.aracEkle(new StandartScooter(id,100,"Merkez",false));
                        System.out.println("Araç başarıyla eklendi");
                    }
                    else if (tur == 2) {
                        scanner.nextLine();
                        System.out.print("Arac ID : ");
                        id = scanner.nextLine();
                        if (sistem.idKontrol(id)){break;};
                        sistem.aracEkle(new ProScooter(id,100,"Merkez",false));
                        System.out.println("Araç başarıyla eklendi");
                    }
                    else{
                        System.out.println("Hatalı seçenek");
                    }
                }

                case 3 ->{
                    System.out.println("Sorgulamak istediğiniz aracın ID si");
                    System.out.print("ID : ");
                    String id = scanner.nextLine();
                    sistem.musaitlikSorgulama(id);
                }

                case 4 ->{
                    System.out.println("--- Araç Kiralama ---");
                    System.out.print("Kiralamak istediğiniz aracın ID : ");
                    String id = scanner.nextLine();
                    if (!sistem.musaitlikSorgulama(id)) break;
                    System.out.print("Kaç dakika sürmek istiyorsunuz : ");
                    int sure = scanner.nextInt();
                    scanner.nextLine();
                    sistem.aracKirala(id,sure);

                }




            }
        }


    }
}