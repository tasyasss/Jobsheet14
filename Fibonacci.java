public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        // System.out.println("Fibonacci Rekursif: " + fibonacciRekursif(n));
        // System.out.println("Fibonacci Iterative: " + fibonacciRekursif(10));
        
        System.out.print("Cetak deret rekursif: ");
        cetakDeret1(n);
        System.out.println();

        System.out.print("Cetak deret iterative: ");
        cetakDeret2(n);
        System.out.println();
    }
    public static int fibonacciRekursif(int n) {
        if (n <= 1) {
            return n;
        } else {
            // Fn=(Fn−1)+(Fn−2)
            return fibonacciRekursif(n - 1) + fibonacciRekursif(n - 2);
        }
    }
    public static void cetakDeret1(int n) {
        for (int i = 1; i <= n; i++) {
                System.out.print(fibonacciRekursif(i) + " ");
        }
    }

    public static int fibonacciIterative(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil + n;
        }
        return hasil;
    }
    
    public static void cetakDeret2(int n) {
        int now = 1;
        int prev = 1;
        for (int i = 1; i <= n; i++) {
                System.out.print(prev + " ");
                int jumlah = prev + now;
                prev = now;
                now = jumlah;
        }
    }
    
}
