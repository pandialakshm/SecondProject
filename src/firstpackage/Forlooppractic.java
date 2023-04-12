package firstpackage;

public class Forlooppractic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				 //Display a Text Five Times
				/*String Name="Lakshmi";
				for(int i=0;i<=4;i++){
					System.out.println(Name);
					}*/
					//Sumnumbers();
					//subtractnumbersaddttion();
					//Increamentby2();
					decrementby2();
	}

			//1.Display Sum of n Natural Numbers increament	
			 public static void Sumnumbers(){
			  int k=0;
			  for(int i=1;i<=4;i++){
				 k= k + i;
			  }
			System.out.println(k);
			 }
			 //2.decrement
			 public static void subtractnumbersaddttion(){
				  int D=0;
				  for(int i=4;i>=1;i--){
					 D= D + i;
				  }
				System.out.println(D);
				 
				  }
			// Increment with count (i+2)
			 public static void Increamentby2(){
				  
				  for(int i=1;i<=20;i+=2){
					  System.out.println(i);
				  }
				}
			// Increment with count (i+2)
			 public static void decrementby2(){
				  
				  for(int i=20;i>=1;i-=2){
					  System.out.println(i);
				  }
				}
			  
			 
}


	


