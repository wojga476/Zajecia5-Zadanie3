public class LiczbZeZmiana {

    public static void main(String[] args) {

        double liczba = 0;
        while (liczba < 3) {
            liczba += 0.1;
            System.out.printf("%.1f ",liczba);
        }
        do {
            System.out.printf("%.1f ",liczba);
            liczba += 0.1;
        } while (liczba < 3);
    }
}
