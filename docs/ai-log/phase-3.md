# Faz 3 - AI Kullanım Günlüğü

## Kullandığım Prompt
"Scooter kiralama sistemime hangi Behavioral tasarım örüntülerini ekleyebilirim?"

## AI'ın Yanıtı (Özet)
- Observer pattern önerdi: kiralama olaylarında gözlemcileri haberdar etmek için
- Strategy pattern önerdi: fiyatlandırma algoritmasını ayrı sınıflara taşımak için

## Benim Uyguladığım ve Neden
Observer için KiralamaGozlemcisi interface'i oluşturdum.
SarjUyariGozlemcisi ve KiralamaLogGozlemcisi bunu implement ediyor.
Strategy için FiyatlandirmaStrategisi interface'i oluşturdum,
StandartFiyatlandirma ve ProFiyatlandirma bunu implement ediyor.

## AI'ın Eksik veya Yanlış Önerdiği
AI Command pattern de önerdi ancak kiralama sistemi
geri alma (undo) gerektirmediği için Observ<er daha uygun oldu.