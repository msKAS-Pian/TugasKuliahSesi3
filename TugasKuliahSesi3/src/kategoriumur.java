import java.util.Scanner;

public class kategoriumur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan umur anda: ");
        int umur = input.nextInt();

        if (umur < 0) {
            System.out.println ("Umur tidak Valid. ");
        } else if (umur <= 5) {
            System.out.println ("Balita" );
        } else if (umur <= 12) {
            System.out.println ("Anak-anak" );
        } else if (umur <= 17) {
            System.out.println ("Remaja" );
        } else if (umur <= 59) {
            System.out.println ("Dewasa" );
        } else {
            System.out.println ("Lansia" );
        }
        
        input.close();
            
        }
    }