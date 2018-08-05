import java.util.Scanner;
public class MinimumDays
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter how many problems Asha solves per day: ");
int a = sc.nextInt();

System.out.println("Enter how many problems Kelly solves per day: ");
int k = sc.nextInt();

System.out.println("Enter how many problems Asha is ahead of Kelly: ");
int p = sc.nextInt();

int minDays = minNum(a,k,p);
if(minDays!=-1)
System.out.println("The minimum number of days required is "+minDays);
else
System.out.println("It is impossible to Kelly to cross Asha");
}
public static int minNum(int a,int k,int p)
{
int days = 1,temp1=a,temp2=k;

// if Asha solves greater or equal problems with Kelly
// It is impossible to Kelly to cross Asha
if(a>=k)
{
return -1;
}
// loop to get the minimum days
while((a+p)>=k)
{
a = a + temp1;
k = k + temp2;
days++;
}
return days;
}
}