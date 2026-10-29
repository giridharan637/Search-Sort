import java.util.Scanner;
public class binaryres
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
        int res = Binary(a,0,n-1,T);
        if(res == -1)
        {
            System.out.println("Element is Not found.");
        }
        else
        {
            System.out.println("Element found at index:"+res);
        }
    }
    public static int Binary(int a[],int l,int r,int T)
    {
        if(l<=r)
        {
            int mid = (l+r) / 2;
            if(a[mid]==T)
            {
                return mid;
            }
            else if(a[mid]<T)
            {
                return Binary(a, mid+1, r, T);
            }
            else
            {
                return Binary(a, l, mid - 1, T);
            }
        }
        return -1;
    }
}
