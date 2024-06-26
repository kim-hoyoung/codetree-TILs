import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int classCount = 0;
        int corridorCount = 0;
        int toiletCount = 0;

        int count = 0;

        int n = sc.nextInt();

        for ( int i = 1; i < n; i++) {
            count++;

            if (count%12 == 0 ) {
                toiletCount++;
            } else if (count%3 == 0 ) {
                corridorCount++;
            } else  if (count%2 == 0 ) {
                classCount++;
            }
        }
        System.out.print(classCount + " " + corridorCount + " " + toiletCount );
    }
}