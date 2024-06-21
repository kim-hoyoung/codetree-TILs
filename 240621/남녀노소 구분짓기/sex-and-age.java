import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int age = sc.nextInt();


        if (s == 0 && age >= 19) {
            System.out.println("MAN");
        } else if (age < 19) {
            System.out.println("BOY");
        }
          if (s == 1 && age >= 19) {
            System.out.println("WOMAN");
        } else if (age < 19) {
            System.out.println("GIRL");
        }
        
        // 여기에 코드를 작성해주세요.
    }
}