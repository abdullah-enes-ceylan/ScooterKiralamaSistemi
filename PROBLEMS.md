\# Başlangıç Kodunun Sorunları



\## Tespit Edilen Sorunlar



1\. \*\*Merkezi nesne yaratma yok\*\*  

&#x20;  Tüm ScooterFactory nesne üretimi Main içinde dağınık haldeydi. Yeni araç tipi eklemek için birden fazla yerde değişiklik gerekiyordu.



2\. \*\*Veritabanı bağlantısı tekrar tekrar açılıyordu\*\*  

&#x20;  Her işlemde yeni bir bağlantı oluşturuluyordu. Bu hem performans kaybına hem de bellek sorununa yol açıyordu.



3\. \*\*Kiralama mantığı tek sınıfa doluydu\*\*  

&#x20;  KiralamaSistemi sınıfı hem iş mantığını hem veri erişimini hem de hata yönetimini yapıyordu. Tek Sorumluluk Prensibi ihlali.



4\. \*\*Yeni scooter tipi eklemek mevcut kodu kırıyordu\*\*  

&#x20;  if-else zincirleri vardı, yeni tip eklemek için bunları değiştirmek gerekiyordu.



5\. \*\*Bildirim/uyarı mekanizması yoktu\*\*  

&#x20;  Şarj düşüklüğü veya kiralama olaylarında sistemi dinleyen hiçbir yapı yoktu.



\## AI Karşılaştırması



AI aynı sorunları tespit etti ve ek olarak Observer pattern eksikliğini, Strategy pattern ile fiyatlandırmanın ayrılması gerektiğini önerdi.

