import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean type = true;



        for(int i = 0; i <5; i++) {
            int n = sc.nextInt();
            if (n%3 == 0) {

            }
           else {
               type = false;
            }
        } if(type == false)
            System.out.println(0);
        else
            System.out.println(1);

        }

    }