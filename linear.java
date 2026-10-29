import java.util.Scanner;

public class linear
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = obj.nextInt();
        }
        int T = obj.nextInt();
        int index = -1;
        for(int i = 0;i<n;i++)
        {
            if(T==a[i])
            {
                index = i;
                break;
            }
        }
        if(index != -1)
        {
            System.out.println("Element found at index:"+index);
        }
        else
        {
            System.out.println("Element is Not found");
        }
    }
}
