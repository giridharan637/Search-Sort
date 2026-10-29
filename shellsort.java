import java.util.Arrays;
import java.util.Scanner;
public class shellsort
{
    public static  void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = obj.nextInt();
        }
        System.out.println("Before Sort:"+Arrays.toString(a));
        for(int gap = n/2;gap>=1;gap/=2)
        {
            for(int i = gap;i<n;i++)
            {
                int key = a[i];
                int j = i;
                while(j>=gap && a[j-gap]>key)
                {
                    a[j]=a[j-gap];
                    j=j-gap;
                }
                a[j] = key;
            }
        }
        System.out.println("After Sort:"+Arrays.toString(a));
    }
}