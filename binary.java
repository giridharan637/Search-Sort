import java.util.Scanner;
public class binary
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
        int l = 0,r = n-1,index = -1;
        while(l<=r)
        {
            int mid = (l+r) /2;
            if(a[mid]==T)
            {
                index = mid;
                break;
            }
            else if(a[mid]<T)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        if(index == -1)
        {
            System.out.println("Element is Not found.");
        }
        else
        {
            System.out.println("Element found at index: "+index);
        }
    }
}
