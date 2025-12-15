public class prosedurangka 
{
    public static void main(String[] args) { // Fungsi Utama
        System.out.println("Prosedur = Sub Program yang Tidak Mengembaliak nilai");
        perkalian(5, 10);
        perkalian(2, 3);
        perkalian(6, 8);

        pembagian(20, 2);
        pembagian(100, 5);
        pembagian(66, 11);
    }


    public static void perkalian(int a, int b) {
        System.out.println("Hasil Prosedur Perkalian = " + (a * b));
    }

    public static void pembagian(int a, int b) {
        System.out.println("\nHasil Prosedur Pembagian = " + (a / b));
    }
}