
import java.util.Scanner;

public class linearres
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
        int res  = linear(a,0,T,n);
        if(res == -1)
        {
            System.out.println("Element is Not found.");
        }
        else
        {
            System.out.println("Element found at index:"+res);
        }
    }
    public static int linear(int a[],int i,int T,int n)
    {
        if(i>n)
        {
            return -1;
        }
        if(a[i]==T)
        {
            return i;
        }
        return linear(a, i+1, T, n);
    }
}
