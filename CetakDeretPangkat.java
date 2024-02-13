public class CetakDeretPangkat {
    public static void main(String[] args) {
        cetakDeret(2, 5);
        System.out.println(" = " + pangkatRekursif(2, 5));
    }
    public static int pangkatRekursif(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkatRekursif(x, y - 1);
        }
    }
    public static void cetakDeret(int x, int y) {
        if (y == 0) {
            System.out.print("1");
        } else {
            System.out.print(x + "x");
            cetakDeret(x, y - 1);
        }
    }
}
