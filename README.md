# Setup

## Setup leJOS ([link referensi](https://sourceforge.net/p/lejos/wiki/Windows%20Installation/))
1. Pasang JDK 7
2. Unduh [leJOS](https://sourceforge.net/projects/ev3.lejos.p/files/)
3. Persiapkan SD Card dan Card Reader
4. Format SD Card
5. Download [JRE Lego](https://www.oracle.com/java/technologies/javaseemeddedev3-downloads.html)
6. Buat Image/Firmware ke SD Card
7. Masukkan SD Card ke EV3 Brick
8. Boot ke SD Card

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
