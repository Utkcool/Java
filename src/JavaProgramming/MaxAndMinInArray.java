package JavaProgramming;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a []= {50,30,40,120,60,100,20};
		
		int max = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.println("Maximun value is :"+ max);
		
		int min = a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(min > a[i])
			{
				min = a[i];
			}
		}
		
		System.out.println("Minimum value is :"+ min);
	}

}
