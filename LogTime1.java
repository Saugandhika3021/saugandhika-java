class LogTime1
{
public static int fun(int n)
{
int c=0;
for(int i=0;i<=n;i++)
{
for(int j=1;j<=Math.log(n);j++)
{
c++;
}
}
return c;
}
public static void main(String args[])
{
int n=100;
System.out.println("N=100,no of instructions O(nlogn):"+fun(n));
}
}
