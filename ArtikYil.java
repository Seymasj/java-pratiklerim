import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        
        int yil = klavye.nextInt();
        
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " artik yil");
                } else {
                    System.out.println(yil + " artik yil degil");
                }
            } else {
                System.out.println(yil + " artik yil");
            }
        } else {
            System.out.println(yil + " artik yil degil");
        }
        
       
    }
}
