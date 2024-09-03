package td1207;
import java.util.*;
public class td1207 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int nbralea = random.nextInt(100) + 1;
        int ess = 0;
        
        System.out.println("Devinez le nombre generé");
        
        while (ess < 10) {
            System.out.print("Entrez votre proposition : "+ (ess+1) + "\n");
            int proposition = scanner.nextInt();
            ess++;
            
            if (proposition == nbralea) {
              System.out.println("vous avez gagné");
            } else if (proposition < nbralea) {
                System.out.println("Le nombre à deviner est plus grand.");
            } else {
                System.out.println("Le nombre à deviner est plus petit.");
            }
        }
        
        if (ess >= 10) {
        	System.out.println("Desolé vous avez echoué. Le nombre etait " + nbralea);
        } 
        
        scanner.close();
		
	}
}

	      
	   
	

 