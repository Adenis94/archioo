import java.util.Scanner;

public class LigneCommande implements IHM {
	
	
	public void Operator() {
		launch();
	}

	@Override
	public void launch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre opération: ");
		char op=sc.nextLine().charAt(0);
		
		
		System.out.println("Entrez x: ");
		int x = sc.nextInt();
		
		System.out.println("Entrez y: ");
		int y = sc.nextInt();
		
		int resultat = Operator.execute(x, y, op);
		System.out.println("resultat : " + resultat);
		
		
	}
	

}
