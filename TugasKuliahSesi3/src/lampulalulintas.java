import java.util.Scanner;

public class lampulalulintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Warna lampu lalu lintas");
        String warna = input.nextLine().trim().toLowerCase();

        switch (warna) {
            case "merah":
                System.out.println("Berhenti");
                break;
            case "kuning":
                System.out.println("Bersiap");
                break;
            case "hijau":
                System.out.println("Jalan");
                break;
            default:
                System.out.println("Tidak valid");
        }
        input.close();
    }
}