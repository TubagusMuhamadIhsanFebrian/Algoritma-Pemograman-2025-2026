<?php
echo "Masukkan nama: ";
$nama = trim(fgets(STDIN));
echo "Apakah nama sudah benar? (TRUE/FALSE): ";
$cek = trim(fgets(STDIN));
while (strtoupper($cek) != "TRUE") {
    echo "Masukkan nama lagi: ";
    $nama = trim(fgets(STDIN));
    echo "Apakah nama sudah benar? (TRUE/FALSE): ";
    $cek = trim(fgets(STDIN));
}

echo "Masukkan NIM (angka saja): ";
$nim = trim(fgets(STDIN));
$saldo = (int)$nim;
echo "Halo $nama, saldo awal kamu: Rp $saldo\n";

while (true) {
    echo "\n===== MENU ATM =====\n";
    echo "1. Cek Saldo\n2. Tarik Tunai\n3. Setor Tunai\n4. Transfer\n5. Keluar\n";
    echo "Pilih menu: ";
    $pil = trim(fgets(STDIN));

    switch ($pil) {
        case "1": echo "Saldo: Rp $saldo\n"; break;
        case "2": echo "Nominal tarik: "; $tarik = (int)trim(fgets(STDIN)); $saldo -= $tarik; echo "Saldo: Rp $saldo\n"; break;
        case "3": echo "Nominal setor: "; $setor = (int)trim(fgets(STDIN)); $saldo += $setor; echo "Saldo: Rp $saldo\n"; break;
        case "4": echo "Nominal transfer: "; $tf = (int)trim(fgets(STDIN)); $saldo -= $tf; echo "Saldo: Rp $saldo\n"; break;
        case "5": echo "Terima kasih $nama!\n"; exit;
        default: echo "Pilihan tidak valid!\n";
    }
}