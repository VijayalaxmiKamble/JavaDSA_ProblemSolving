package PatternProgramming;

public class Pattern3 {

	public static void main(String[] args) {
		int col = 1;
		int row = 1;
		while(col<=5)
		{
			int i=1;
			while(i<=row)
			{
				System.out.print("* ");
				i++;
			}
			row++;
			col++;
			System.out.println();
		}
		
		col = 5;
		row = 6;
		while(col<=10)
		{
			int i =1;
			while(i<=row)
			{
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row--;
			col++;
		}
	}

}
