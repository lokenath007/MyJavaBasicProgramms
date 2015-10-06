
public class FibonaciSeries {
	//this program prints first 10 fibonaci series
	
	public static void main(String args[])
	{
		int i=0;
		int j=1;
		int l;
		int k;
		System.out.println("The first 10 fibonacci number are");
		System.out.println(i);
		System.out.println(j);
		for(l=2;l<10;l++)
		{
			k=i+j;
			
			i=j;
			j=k;
			System.out.println(k);
		}
	}

}
