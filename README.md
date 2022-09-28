# Setup

Di bawah ini akan disajikan langkah-langkah yang perlu dilakukan untuk setup development environment program Mindstorm EV3 berbasis leJOS.
> Setiap step yang ditunjukkan di bawah ini, diterapkan pada sistem operasi `Windows 11`.

## Setup leJOS ([link referensi](https://sourceforge.net/p/lejos/wiki/Windows%20Installation/))

1. Unduh dan Pasang [JDK 7](https://www.oracle.com/java/technologies/javase/javase7-archive-downloads.html)  

    Silakan klik link di atas untuk melakukan pengunduhan JDK 7 kemudian lakukan pemasangan pada device Anda.
    > Pada kasus saya menggunakan `Java SE Development Kit 7u80` yang `windows x64`.
    
    Jika sudah diunduh silahkan lakukan step pemasanagn secara normal (next-next saja). Jika sudah berhasil maka akan muncul folder seperti di bawah ini:

    <img src="./assets/jdk7-hasil.png" alt="Hasil JDK" width="640"/>

    > Muncul folder jdk1.7.0_80

2. Persiapkan SD Card dan Card Reader
    
    SD Card ini akan digunakan untuk memasang leJOS EV3 ke dalam EV3 Brick (Mindstorm). Setidaknya kapasitas yang harus tersedia adalah minimal 400 MB.

    <img src="./assets/sd-card.png" alt="SD Card dan Card Reader" width="320"/>

3. Format SD Card

    Pastikan format SD Card adalah FAT32.

    <img src="./assets/format.png" alt="Format SD Card" height="480"/>

4. Unduh [JRE Lego](https://www.oracle.com/java/technologies/javaseemeddedev3-downloads.html)

    Silakan klik link di atas untuk melakukan pengunduhan JRE dari Mindstorm EV3. File ini akan digunakan untuk setup runtime environment pada EV3Brick yang memuat image dari SD Card.

    > Pada kasus saya menggunakan `Oracle Java SE Embedded version 7 Update 60`. Hal ini disesuaikan dengan versi JDK yang digunakan ketika membuat image pada SD Card (lihat langkah selanjutnya).

5. Unduh [Installer leJOS](https://sourceforge.net/projects/ev3.lejos.p/files/)

    Silakan unduh installer di atas untuk setup image/firmware pada SD Card.

6. Buat Image/Firmware pada SD Card

    Sebagai catatan sebelum melanjutkan setup image/firmware ini pada SD Card, Anda telah menyiapkan dan menyelesaikan step-step diatas. Jika sudah, Anda bisa mengikuti langkah pada [tutorial utama](https://sourceforge.net/p/lejos/wiki/Windows%20Installation/) dengan poin-poin penting sebagai berikut:

    - Pastikan pemilihan versi JDK sesuai dengan versi JDK yang telah dipasang pada step diatas
    - Ceklis `Additional Sources` pada bagian `Select Components`
    - Ketika sudah selesai, biarkan secara default menjalankan `EV3SDCard Utility`
    - Pada saat window `EV3SDCard Utility`/`EV3 SD Card Creator` muncul silakan: 1. Pilih SD Card yang telah diformat pada step diatas; 2. Biarkan image leJOS EV3 yang sudah terpilih secara default; 3. Pilih file JRE yang telah diunduh sebelumnya; 4. Klik tombol create dan tunggu proses hingga selesai

7. Masukkan SD Card ke EV3 Brick

    Setelah proses setup image/firmware pada SD Card selesai, silakan eject SD Card dan memasangnya pada EV3 Brick.

8. Boot ke SD Card

    Lakukan booting ke SD Card pada EV3 Brick dengan menekan tombol tengah dan menahannya hingga muncul tulisan `Mindstorm starting ...`. Kemudian biarkan EV3 Brick menyelesaikan proses pembacaan image yang ada di SD Card. Biasanya proses berjalan selama 8 menit untuk pertama kali booting. 


## Setup IDE ([link referensi](https://sourceforge.net/p/lejos/wiki/Installing%20the%20Eclipse%20plugin/))
1. Pasang JDK 19 (terbaru)
2. Unduh [Eclipse Installer](https://www.eclipse.org/downloads/packages/installer)
3. Pasang Eclipse IDE for Java Developer
4. Pasang plugin Eclipse leJOS EV3 (melalui repository dengan link http://lejos.sourceforge.net/tools/eclipse/plugin/ev3)

## Koneksi ke EV3 Brick via USB ([link referensi](http://www.java-online.ch/lego/index.php?inhalt_links=home/nav_home.inc.php&inhalt_mitte=ev3install/usb_windows.inc.php&navUSB=ev3install/usb_windows.inc.php))
1. Sambungkan EV3 Brick dengan PC/Laptop melalui USB
2. Pasang [RNDIS Driver](http://www.java-online.ch/lego/ev3install/download/rndis.zip) di PC (jika belum terpasang)
3. Atur Alamat IP koneksi (default `10.0.1.1`) untuk RNDIS melalui Device Manager
4. Atur Alamat IP koneksi (default `10.0.1.1`) di plugin Eclipse leJOS EV3 melalui menu Preferences

# Referensi
- https://lejos.sourceforge.io/
- http://www.java-online.ch/lego/index.php?inhalt_links=home/nav_home.inc.php&inhalt_mitte=home/home.inc.php
