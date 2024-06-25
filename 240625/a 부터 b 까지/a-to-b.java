import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        for ( int i = a; a <= b; i++) {
            if(i%2 != 0){
                System.out.print(a + " ");
                a = a*2;
            } else if (i%2 ==0) {
                System.out.print(a + " ");
                a = a+3;
                
            }
        }
    }
}