import java.util.Scanner;
public class floydTriangle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        int k=1;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.print("\n");
        }
    }
}
