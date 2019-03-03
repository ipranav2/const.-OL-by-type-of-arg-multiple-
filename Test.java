class Test
{
	Test(float ft,char ch)
	{
		System.out.println("First constructor");
	}
	Test(int x, float ft)
	{
		System.out.println("Second constructor");
	}
	public static void main(String S[])
	{
		new Test(5.5f,'A');	//first
		new Test(55,5.5f);	//second
		//new Test(5.5f,5.5f);	//error
		new Test(55,55);	//second
		//new Test('A','A');	//ambiguity error
	}
}
		



 