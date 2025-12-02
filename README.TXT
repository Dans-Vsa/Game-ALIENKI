------------------------------------------------------------------------
PROJECT TITLE: AlienIKI - Alien Shooter Game
------------------------------------------------------------------------

PURPOSE OF PROJECT:
Game sederhana berbasis Greenfoot (Java) di mana pemain mengendalikan
Hero untuk menembak alien musuh dan bertahan hidup selama mungkin.
Proyek ini dibuat untuk pembelajaran pemrograman berorientasi objek
menggunakan framework Greenfoot.

VERSION or DATE:
Version 1.0 - December 2, 2025

HOW TO START THIS PROJECT:
1. Pastikan Greenfoot sudah terinstall di komputer Anda
2. Buka Greenfoot IDE
3. Pilih menu "Project" > "Open Project"
4. Navigasi ke folder AlienIKI dan pilih file "project.greenfoot"
5. Klik tombol "Run" atau "Act" untuk memulai permainan
6. Gunakan keyboard untuk mengontrol Hero:
   - Tombol panah: Gerakkan Hero
   - Spasi/Enter: Tembak peluru (cek kode Hero.java untuk kontrol pasti)

AUTHORS:
- [Nama Anda]
- Dibuat dengan Greenfoot Framework

USER INSTRUCTIONS:
GAMEPLAY:
- Tujuan: Tembak sebanyak mungkin alien dan bertahan hidup
- Hero Anda akan menghadapi berbagai jenis alien (Alien1, Alien2, Alien3)
- Setiap alien yang ditembak akan memberikan poin
- Hindari tabrakan dengan alien atau game over
- Perhatikan counter nyawa dan skor di layar

KONTROL:
- Panah Kiri/Kanan: Gerakkan Hero ke kiri/kanan
- Panah Atas/Bawah: Gerakkan Hero ke atas/bawah
- Spasi/Enter: Tembakkan peluru (konfirmasi di kode Hero.java)

FITUR GAME:
- Multiple alien types dengan behavior berbeda
- Sistem scoring dan lives counter
- Sound effects untuk aksi game
- Explosion effects saat alien terkena tembakan
- Game over screen

STRUKTUR PROJECT:
- AlienIKI/Hero.java - Karakter pemain yang dapat dikendalikan
- AlienIKI/Alien.java - Class dasar untuk alien musuh
- AlienIKI/Alien1.java, Alien2.java, Alien3.java - Variasi alien
- AlienIKI/Bullet.java - Proyektil yang ditembakkan Hero
- AlienIKI/Blast.java - Efek ledakan
- AlienIKI/Counter.java - Display untuk skor dan nyawa
- AlienIKI/GameOver.java - Layar game over
- AlienIKI/MyWorld.java - World/stage utama permainan
- images/ - Sprite dan grafik game
- sounds/ - Sound effects dan musik

PENGEMBANGAN LEBIH LANJUT:
- Modifikasi perilaku alien di file Alien*.java
- Tambah level baru di MyWorld.java
- Ganti sprite di folder images/
- Tambah sound effects di folder sounds/
- Implementasi power-ups atau weapon upgrades

TROUBLESHOOTING:
- Jika game tidak berjalan, pastikan semua file .java terkompilasi
- Periksa folder images/ dan sounds/ memiliki semua aset yang diperlukan
- Cek console di Greenfoot untuk error messages

------------------------------------------------------------------------
