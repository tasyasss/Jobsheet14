public class Pangkat04 {
    public static int pangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkat(x, y - 1);
        }
    }

    public static int pangkatInterative(int x, int y) {
        int hasil = 1;
        for (int i = 1; i <= y; i++) {
            hasil = hasil * x;
        }
        return hasil; 
    }

    public static void main(String[] args) {
        System.out.println("Pangkat Rekursif: " + pangkat(6, 4));
        System.out.println("Pangkat Iteratif: " + pangkatInterative(6, 4));
    }
}
