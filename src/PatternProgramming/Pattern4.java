package PatternProgramming;

public class Pattern4 {

	public static void main(String[] args) {
		int row = 1;
		int star = 5;
		int i =1;
		while(row<=5)
		{
			i = 1;
			while(i<=star)
			{
				System.out.print("* ");
				star++;
			}
			star--;
			System.out.println();
		}row++;
	}

}
