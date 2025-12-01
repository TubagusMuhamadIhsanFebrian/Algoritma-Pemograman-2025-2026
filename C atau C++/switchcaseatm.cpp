#include <iostream>
#include <string>
using namespace std;

int main() {
    string nama, cek;
    do {
        cout << "Masukkan nama: ";
        getline(cin, nama);
        cout << "Apakah nama sudah benar? (TRUE/FALSE): ";
        getline(cin, cek);
    } while (cek != "TRUE");

    string nim;
    cout << "Masukkan NIM (angka saja): ";
    getline(cin, nim);
    long long saldo = stoll(nim);
    cout << "Halo " << nama << ", saldo awal kamu: Rp " << saldo << "\n";

    while (true) {
        cout << "\n===== MENU ATM =====\n1. Cek Saldo\n2. Tarik Tunai\n3. Setor Tunai\n4. Transfer\n5. Keluar\n";
        cout << "Pilih menu: ";
        string pilih; getline(cin, pilih);
        switch (pilih[0]) {
            case '1': cout << "Saldo: Rp " << saldo << "\n"; break;
            case '2': { "Nominal tarik"; long long t; cin >> t; saldo -= t; cout << "Saldo: Rp " << saldo << "\n"; cin.ignore(); break; }
            case '3': { "Nominal setor"; long long s; cin >> s; saldo += s; cout << "Saldo: Rp " << saldo << "\n"; cin.ignore(); break; }
            case '4': { "Nominal tranfer"; long long tf; cin >> tf; saldo -= tf; cout << "Saldo: Rp " << saldo << "\n"; cin.ignore(); break; }
            case '5': cout << "Terima kasih " << nama << "\n"; return 0;
        }
    }
}