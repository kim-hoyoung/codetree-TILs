public class Main {
    public static void main(String[] args) {
        int cnt = 1; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}