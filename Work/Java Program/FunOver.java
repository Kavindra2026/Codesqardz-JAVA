class FunOver{
    static void show()
{
    System.out.println("Zero argument");
}
    static  void show(int x)
{
	System.out.println("One argument");
}
    static void show(int x, int y)
{
	System.out.println("Two argument");
}
	
	static void show(int x, int y, int z)
{
	System.out.println("Three argument");
	
}
	
public static void main(String... s)
{
	show();
	show(10);
	show(20,30);
	show(10,20,30);
}
}