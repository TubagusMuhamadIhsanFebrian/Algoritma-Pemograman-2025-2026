public class metodepoint {
    public static void main(String[] args) {
        MetodePoint(255.7);
    }

    public static void MetodePoint(double poin) {
        if (poin >= 202.5) {
            System.out.println("--Poin Yang Keluar--");
            System.out.println("Poin : Pertama");
        } else if (poin >= 122.4) {
            System.out.println("Poin : Kedua");
        } else {
            System.out.println("Poin : Ketiga");
        }    
    }
}
