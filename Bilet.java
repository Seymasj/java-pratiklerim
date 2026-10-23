import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        Scanner klavye= new Scanner(System.in);

        int yas = klavye.nextInt();
        String ogrenci = klavye.next();

        if (yas <= 6) {
            System.out.println("Bilet: 0 TL");
        } else if (yas <= 17) {
            System.out.println("Bilet: 80 TL");
        } else if (yas >= 65) {
            System.out.println("Bilet: 60 TL");
        } else {
            // Yaş grupları tutmadıysa (18 - 64 yaş arası): Son else içinde öğrenci sorgusu
            if (ogrenci.equals("e")) {
                System.out.println("Bilet: 80 TL");
            } else {
                System.out.println("Bilet: 150 TL");
            }
        }

    }
}
