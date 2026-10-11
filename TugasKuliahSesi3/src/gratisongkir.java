import java.util.Scanner;

public class gratisongkir {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukan total belanja:");
        int totalBelanja = input.nextInt();

        if (totalBelanja >= 100000) {
            System.out.println ("Gratis ongkir");
        } else {
            System.out.println ("Bayar ongkir");
        }
        input.close();
    }

}