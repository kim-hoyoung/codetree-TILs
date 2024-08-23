public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++) {
            if (i%2 !=0) {
                for(int j=0; j <i+1; j++) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}