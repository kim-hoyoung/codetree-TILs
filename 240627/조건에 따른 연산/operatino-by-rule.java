import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(true) {
            if(n%2 ==0) {
                count++;
                n = (n*3)+1;
            }
            else if (n%2 ==1) {
                count++;
                n = (n*2)+2;
            }
            if (n >= 1000) {
                System.out.println(count);
                break;
            }
        }
    }
}