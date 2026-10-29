
import java.util.Arrays;
import java.util.Scanner;

public class selectionsort
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
        System.out.println("Before Sort:"+Arrays.toString(a));
        for(int i = 0;i<n;i++)
        {
            int mid = i;
            for(int j = i+1;j<n;j++)
            {
                if(a[mid]>a[j])
                {
                    mid = j;
                }
            }
            int temp = a[mid];
            a[mid] = a[i];
            a[i] = temp;
        }
        System.out.println("After Sort:"+Arrays.toString(a));
    }
}
