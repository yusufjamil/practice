package coding;

public class NumberPyramidTriangleReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println();
		}
	}

}
