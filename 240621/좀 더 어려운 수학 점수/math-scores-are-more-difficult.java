import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Amath = sc.nextInt();
        int AEnglish = sc.nextInt();
        int Bmath = sc.nextInt();
        int BEnglish = sc.nextInt();

        if( Amath > Bmath && Amath != Bmath) {
            System.out.println("A");
        }
         else if (Amath < Bmath && Amath != Bmath) {
            System.out.println("B");
            
        } 

        if ( Amath == Bmath && AEnglish > BEnglish) {
            System.out.println("A");
        } else if(Amath == Bmath && AEnglish < BEnglish) {
            System.out.println("B");
        }
        
        
    }
}