# Uygulanan Tasarım Örüntüleri

## Faz 1 - Creational Örüntüler

### 1. Factory Method
- **Nerede:** `ScooterFactory.java`
- **Neden:** Yeni scooter tipi eklemek için Main'i değiştirmek gerekiyordu.
  Factory sayesinde sadece fabrikaya yeni tip tanıtmak yeterli.
- **Ne Kazandım:** Nesne yaratma sorumluluğu merkeze alındı,
  if-else zincirleri kaldırıldı.

### 2. Singleton
- **Nerede:** `VeriTabaniYoneticisi.java`
- **Neden:** Her işlemde yeni veritabanı bağlantısı açılıyordu,
  performans sorununa yol açıyordu.
- **Ne Kazandım:** Tek bir bağlantı instance'ı ile bellek dostu yapı kuruldu.

## Faz 2 - Structural Örüntüler

*(Faz 2 tamamlandığında güncellenecek)*

## Faz 3 - Behavioral Örüntüler

*(Faz 3 tamamlandığında güncellenecek)*