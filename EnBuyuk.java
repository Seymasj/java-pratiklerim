import java.util.Scanner;

public class EnBuyuk {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        int sayi1 = klavye.nextInt();
        int sayi2 = klavye.nextInt();
        int sayi3 = klavye.nextInt();

        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }

        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }

        System.out.println("En buyuk: " + enBuyuk);

        
    }
}
