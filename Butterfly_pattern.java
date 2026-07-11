import java.util.Scanner;

public class Butterfly_pattern
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        int r,c;
        for (r=1;r<=n;r++)
        {    if (r<(n/2)) {
            for (c = 1; c <= n; c++) {
                if (c <= r || c >= n - (r - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
        else {
            for (c = 1; c <= n; c++) {
                if (c >= r || c <= n - (r - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
        }
    }
}
