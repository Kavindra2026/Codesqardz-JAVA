 class ReturnType
{
    static void show(char x)
{
	System.out.println("No Return type");
}
    static int show( int z)
{
	System.out.println("With Return Type");
	return z;
}
public static void main(String... show)
{
	show('a');
    int a =show(10);
    System.out.println(a);
}
}