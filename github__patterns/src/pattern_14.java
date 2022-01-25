import java.util.Scanner;
public class pattern_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = scanner.nextInt();
        int sp=1;
        int pr=rows;
        for (int i = rows; i > 0; i--)
        {
            for (int j = 1; j < sp; j++)
            {
                System.out.print(" ");
            }
            sp=sp+1;
            for (int k = 1; k <= pr; k++)
            {
                System.out.print(pr + " ");
            }
            pr=pr-1;
            System.out.println();
        }
    }
}
