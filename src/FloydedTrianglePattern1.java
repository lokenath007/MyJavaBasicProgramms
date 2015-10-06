import java.util.Scanner;

public class FloydedTrianglePattern1 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		in = new Scanner(System.in);
		String s1="1";
		
		int n= in.nextInt();
		
		System.out.println(s1);
		
		for(int i=2;i<=n;i++)
		{
			s1= Integer.toString(i) + ""+s1+""+ Integer.toString(i);
			System.out.println(s1);
		}
		
	}

}
