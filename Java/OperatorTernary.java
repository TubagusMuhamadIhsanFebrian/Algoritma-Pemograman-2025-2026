import java.util.Scanner;

class OperatorTernary {
    public static void main(String[] args) {
        double input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai = ");
        input = inputUser.nextDouble();

        x = (input == 10) ? (input * input) : (input / 2);

        System.out.println("Hasilnya = " + x);

        inputUser.close();
    }
}