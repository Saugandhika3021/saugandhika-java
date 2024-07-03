import java.util.*;
class Space
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,i,sum=0;
n=s.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
sum=sum+arr[i];
}
System.out.println(sum);
}
}