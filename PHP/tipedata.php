<?php
$nim = 'A';
$nama = 'Tubagus Muhamad Ihsan Febrian';
$umur = 18;
$nilai = 82.25;
$status = TRUE;

echo "---Belajar Tipe Data---\n";
echo "Tipe Data Char : " . $nim . "\n";
echo "Tipe Data String : " . $nama . "\n";
echo "Tipe Data Int : " . $umur . "\n";
print"\n";
printf("Tipe Data Float : %.5f \n", $nilai);
echo "Tipe Data Boolean : \n";
if ($status)
    echo "Status : Aktif \n";
else
    echo "Status : Tidak Aktif \n";
?>