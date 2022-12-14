package demo1;

public class For_Loop_Demo2 {
	

public static void main(String[] args) {
	
	 int a, j, row=4;
	
	for ( a=0; a<=row; a++) {
		
		for (j=row-a; j>1; j--) {
			
			System.out.print(" "); 
			
		}
		
		for (j=0; j<=a; j++){
			
			System.out.print("* ");
		
		}
		
		
	
	System.out.println();
}



}


}