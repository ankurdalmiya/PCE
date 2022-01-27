
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int row =4;
		for (int i=0; i<row; i++)
		{
		for (int j=0; j<=i; j++) 
		{
			System.out.print("* ");
		}
		System.out.println(); 
	*/
		
		int i, j, row = 6;       
		for (i=0; i<row; i++)   {  

			for (j=2*(row-i); j>=0; j--){  
         
				System.out.print(" ");
			}
				for (j=0; j<=i; j++ )  {
					System.out.print("* ");   
				}
				System.out.println();   
			}
		
		

	}}