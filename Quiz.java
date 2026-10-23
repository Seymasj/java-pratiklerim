import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        
        String cevap1 = klavye.next();
        String cevap2 = klavye.next();
        String cevap3 = klavye.next();

        int dogru = 0;

        
        if (cevap1.equals("B")) {
            dogru++;
        }
        if (cevap2.equals("D")) {
            dogru++;
        }
        if (cevap3.equals("A")) {
            dogru++;
        }
        System.out.println("Dogru: " + dogru + " / 3");

        klavye.close();
    }
}
