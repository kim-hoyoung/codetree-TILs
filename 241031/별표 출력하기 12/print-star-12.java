import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변수 선언 및 입력
        int starCount = sc.nextInt();

        for(int i = 0; i < starCount; i++) {
            for(int j = 0; j < starCount; j++) {
                if(j % 2 ==0 ) {
                    if(i == 0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else {
                    if (i <= j)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}