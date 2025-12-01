import java.util.Scanner;
public class switchcaseatm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        do {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Apakah nama sudah benar? (TRUE/FALSE): ");
        } while (!sc.nextLine().equalsIgnoreCase("TRUE"));

        System.out.print("Masukkan NIM (angka saja): ");
        long saldo = Long.parseLong(sc.nextLine());
        System.out.println("Halo " + nama + ", saldo awal kamu: Rp " + saldo);

        while (true) {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo\n2. Tarik Tunai\n3. Setor Tunai\n4. Transfer\n5. Keluar");
            System.out.print("Pilih menu: ");
            String pilih = sc.nextLine();

            switch (pilih) {
                case "1": System.out.println("Saldo: Rp " + saldo); break;
                case "2": System.out.print("Nominal tarik: "); saldo -= Long.parseLong(sc.nextLine()); System.out.println("Saldo: Rp " + saldo); break;
                case "3": System.out.print("Nominal setor: "); saldo += Long.parseLong(sc.nextLine()); System.out.println("Saldo: Rp " + saldo); break;
                case "4": System.out.print("Nominal transfer: "); saldo -= Long.parseLong(sc.nextLine()); System.out.println("Saldo: Rp " + saldo); break;
                case "5": System.out.println("Terima kasih " + nama); return;
                default: System.out.println("Pilihan tidak valid!");
            }
        }
    }
}