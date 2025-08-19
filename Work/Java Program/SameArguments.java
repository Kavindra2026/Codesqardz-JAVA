class SameArguments{
static void show(int x, long f)
{
System.out.println("int long  arguments ");
}
static void show(long x,int z)
{
System.out.println("long int argument");
}

public static void main(String... s){
	//show(10,10L);
	//show(10L,10);
	show(10,10);
}

}