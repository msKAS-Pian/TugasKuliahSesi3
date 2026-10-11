import java.util.Scanner;

public class validasipassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan password:");
        String password = input.nextLine();

        int panjang = password.length();

        if (panjang < 8) {
            System.out.println("Terlalu pendek");
        } else if (panjang < 12) {
            System.out.println("Cukup");
        } else {
            System.out.println("Kuat");
        }
        
        boolean adaAngka = false;
        for (int i = 0; i < panjang; i++) {
            if (Character .isDigit(password.charAt(i))) {
                adaAngka = true;
                break;
            }
        }

        if (adaAngka) {
            System.out.println("Password menggunakan angka");
        } else {
            System.out.println("Password tidak menggunakan angka");
        }

        input.close();
    }
}