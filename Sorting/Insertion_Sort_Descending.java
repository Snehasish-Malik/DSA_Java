import java.util.Scanner;

public class Insertion_Sort_Descending
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
    for (int i=1;i<n;i++) \\ loop for pass
    {
      key=ar[i];
      j=i-1;
      System.out.println("J: "+j);
      while(j>=0 && ar[j]<key) \\ loop for comparison with the key element
      {
        ar[j+1]=ar[j];
        j--;
      }
      ar[j+1]=key;
    }
    System.out.println("The sorted aray is : ");
    for(int i=0;i<n;i++)
      System.out.println(ar[i]);
  }
}
