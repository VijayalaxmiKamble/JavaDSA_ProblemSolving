package PatternProgramming;

public class Pattern2 {

	public static void main(String[] args) {
		int i = 1,j = 1;
		while(j<=5)
		{
			i = 1;
			while(i<=5)
			{
				System.out.print("* ");
				i++;
			}
			System.out.println();
			j++;
		}
	}

}
