import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int yyyy, mm, dd;
        yyyy = sc.nextInt();
        mm = sc.nextInt();
        dd = sc.nextInt();
        
        
        System.out.print(mm +"-" + dd + "-" + yyyy);
        // 여기에 코드를 작성해주세요.
    }
}