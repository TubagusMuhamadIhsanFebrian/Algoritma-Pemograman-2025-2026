public class prosedurswap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Swap adalah Tempat Penyimpanan Memori Sementara ");
        System.out.println("Sebelum Swapping, a = " + a + ", b = " + b);
        ProsedurSwap(a, b);
    }
    
    public static void ProsedurSwap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Setelah Swapping, a = " + a + ", b = " + b);
    }
}
