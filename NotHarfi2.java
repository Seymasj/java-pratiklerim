import java.util.Scanner;

public class NotHarfi2 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        
        int puan = klavye.nextInt();
        
        if (puan < 0) {
            System.out.println("Gecersiz puan");
        } else if (puan > 100) {
            System.out.println("Gecersiz puan");
        } else if (puan >= 90) {
            System.out.println("Harf: A");
        } else if (puan >= 80) {
            System.out.println("Harf: B");
        } else if (puan >= 70) {
            System.out.println("Harf: C");
        } else if (puan >= 60) {
            System.out.println("Harf: D");
        } else {
            System.out.println("Harf: F");
        }
        
        
    }
}
