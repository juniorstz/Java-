import java.util.Locale;
import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
 Scanner sc = new Scanner(System.in);
 System.out.println("Digite dois números para serem multiplicado");
 double A = sc.nextInt();
 double B = sc.nextInt();

 double multi = A * B;
 
 System.out.println("Resultado =" + multi);
 
  
 
  
 		
  
  sc.close();
   
		 

}
}
