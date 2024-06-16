import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();


        if(a < 0) {
            System.out.print(a +  "\n" + "minus");
        } else
        System.out.print(a); 
    }
}