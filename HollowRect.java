import java.util.Scanner;
public class HollowRect
{
    public static void main()
    {   Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of row:");
        int r =sc.nextInt();
        System.out.print("Enter no of column:");
        int c=sc.nextInt();

        for (int i = 1; i <= r; i++)
        {
            for (int j = 1; j <= c; j++)
            {   if(i ==1 || i == r || j ==1 || j == c)
                System.out.print("* ");
            else
                System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
