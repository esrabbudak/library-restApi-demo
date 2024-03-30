CREATE DATABASE IF NOT EXISTS kitaplar;

USE kitaplar;

CREATE TABLE IF NOT EXISTS kitap (
  id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  kitap_adi VARCHAR(255) DEFAULT NULL,
  yazar_adi VARCHAR(255) DEFAULT NULL
);

INSERT INTO kitap (kitap_adi, yazar_adi) VALUES
('Huzursuzluk', 'Zülfü Livaneli'),
('Kardeşimin Hikayesi', 'Zülfü Livaneli'),
('Suç ve Ceza', 'Fyodor Dostoevsky'),
('1984', 'George Orwell'),
('Beyaz Diş', 'Jack London'),
('İçimizdeki Şeytan', 'Sabahattin Ali');
