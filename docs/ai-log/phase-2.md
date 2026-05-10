# Faz 2 - AI Kullanım Günlüğü

## Kullandığım Prompt
"Scooter kiralama sistemime hangi Structural tasarım örüntülerini ekleyebilirim?"

## AI'ın Yanıtı (Özet)
- Decorator pattern önerdi: scooter'a sigorta veya hasar güvencesi eklemek için
- Facade pattern önerdi: Main içindeki karmaşık nesne oluşturma sürecini gizlemek için

## Benim Uyguladığım ve Neden
Decorator için ScooterDecorator soyut sınıfı oluşturdum,
SigortaliScooter ve HasarGuvenceliScooter bunu extend ediyor.
Facade için KiralamaFacade sınıfı oluşturdum,
KullaniciArayuzu artık doğrudan KiralamaSistemi'ne değil Facade'e bağlanıyor.

## AI'ın Eksik veya Yanlış Önerdiği
AI başlangıçta Adapter pattern önerdi ancak projemde
uyumsuz interface problemi olmadığı için Facade daha uygun oldu.