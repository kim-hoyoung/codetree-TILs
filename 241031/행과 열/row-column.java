import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rowCount = sc.nextInt();
        int colCount = sc.nextInt();


        for (int i = 1; i < rowCount+1; i++) {
            for (int j = 1; j < colCount+1; j ++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}