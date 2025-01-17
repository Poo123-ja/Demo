import java.util.Scanner;

public class small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<b) {
            System.out.println("a is smallest");
        }
        else if (a>b) {
            System.out.println("b is smallest");

        }
        else {
            System.out.println("both are equal");
        }
    }
}
