package Arrays;

public class TDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {
				     {100,200},
				     {300,400},
				     {500,600}
		             };
		
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}*/
		
		for(int r[]:a)
		{
			for(int c: r)
			{
				System.out.println(c);
			}
		} 
	}

}
