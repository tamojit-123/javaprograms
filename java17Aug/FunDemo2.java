

class FunDemo2
{

static void fun1(int a)
{
static int result = a+a;
//System.out.println(result);
}

static void fun2(int a)
{
int result;
System.out.println(result);
}

public static void main(String[] ar)
{
int a=23;
fun1(a);
fun2(a);
}

}

//variables -> local , static , final, instance  
//local variable : is going to declared withinblock and within parameter of method/function , and local variable scope is limited to that block only
//we cannot access outside of the block the local variable.
