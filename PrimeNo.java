import java.util.Scanner;
public class PrimeNo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter starting range");
        int a = s.nextInt();
        System.out.println("Enter end range");
        int b = s.nextInt();
        
        for (int i = a; i <= b; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && i > 1) {
                System.out.println(i);
            }
        }
    }
}
