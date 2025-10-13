import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = scanner.nextDouble();

        double luas = PI * r * r;
        System.out.println("Luas lingkaran: " + luas);
    }
}