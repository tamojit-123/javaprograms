class FunRec
{

static int fun(int n)
{
if(n==1)
 return 1; 
else 
{
System.out.println("now calling fun"+n);
return 1+fun(n-1);
}
}
public static void main(String[] ar)
{
int n=3;
System.out.println(fun(n));
}
}
