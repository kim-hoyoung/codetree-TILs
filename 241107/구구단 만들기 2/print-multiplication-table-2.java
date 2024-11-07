import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int min = sc.nextInt();
        int max = sc.nextInt();
        
        for(int i = 1; i < 10; i = i+1) {
            for(int j = max; j >= min; j--) {
                if(i % 2 == 0) {
                    System.out.print(j + " * " + i + " = " + (i * j));
                    if (j != min)
                        System.out.print(" / ");
                }
            }
            if (i % 2 == 0) {
                System.out.println();
            }
        }
    }
}