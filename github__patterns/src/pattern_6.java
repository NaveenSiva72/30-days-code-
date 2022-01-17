import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Taking rows value from the user

        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
