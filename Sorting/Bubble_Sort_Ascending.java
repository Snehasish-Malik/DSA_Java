import java.util.Scanner;

public class Bubble_Sort_Ascending
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n,key=0,j=0;
    System.out.print("Enter the size: ");
    n=sc.nextInt();
    int ar[]=new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++)
      ar[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      boolean unchanged=true;
      for(j=0;j<n-1-i;j++)
      {
        if(ar[j]>ar[j+1])
        {
          int temp=ar[j];
          ar[j]=ar[j+1];
          ar[j+1]=temp;
          unchanged=false;
        }
      }
      if(unchanged)
        break;
    }
    System.out.println("The sorted array is");
    for(int i=0;i<n;i++)
      System.out.println(ar[i]);
  }
}
