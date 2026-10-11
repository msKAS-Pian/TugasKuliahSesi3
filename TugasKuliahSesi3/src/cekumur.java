import java.util.Scanner;

public class cekumur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan umur anda:");
        int umur = input.nextInt();

        if (umur >=17 ) {
            System.out.println("Boleh memiliki KTP");
        } else {
            System.out.println("Belum boleh memiliki KTP");
        }
        input.close();
    }
}