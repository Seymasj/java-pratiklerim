import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        
        final double ACILIS_UCRETI = 30.0;
        final double KM_UCRETI = 20.0;
        final double GECE_TARIFESI_ORANI = 1.5;

        double km = klavye.nextDouble();
        int saat = klavye.nextInt();

       
        double ucret = ACILIS_UCRETI + (KM_UCRETI * km);

        
        if (saat >= 0) {
            if (saat <= 5) {
                ucret = ucret * GECE_TARIFESI_ORANI;
            }
        }

        
        System.out.printf("Ucret: %.2f\n", ucret);

       
    }
}
