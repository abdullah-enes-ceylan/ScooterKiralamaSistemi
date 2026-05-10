# Faz 1 - AI Kullanım Günlüğü

## Kullandığım Prompt
"Bu kodda hangi tasarım sorunlarını görüyorsun?
Hangi tasarım örüntüleri bu sorunları çözebilir?"

## AI'ın Yanıtı (Özet)
- Nesne yaratmanın Main'e dağılmış olduğunu tespit etti
- Factory Method pattern önerdi
- Singleton için VeriTabaniYoneticisi sınıfını önerdi
- Dependency Injection için IVeriKaynagi interface'i önerdi

## Benim Uyguladığım ve Neden
Factory pattern için ScooterFactory sınıfını oluşturdum.
AI'ın önerisini anladıktan sonra kendi projeme göre uyarladım.
Singleton'ı VeriTabaniYoneticisi'nde uyguladım çünkü
veritabanı bağlantısının tek instance olması performans açısından kritikti.

## AI'ın Eksik veya Yanlış Önerdiği
AI başlangıçta Abstract Factory önerdi ancak projemde
tek bir ürün ailesi olduğu için Factory Method daha uygundu.