package javaBanque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	comptebancaire compte1= new comptebancaire() ;
	comptebancaire compte2= new comptebancaire() ;
	compte1.compte(200);
	compte2.compte(300);
	
	compte1.virement(compte2, 100);
	 
	compte1.consult(); 
	compte2.consult();
	
	

	
	
	
	
		
	}

}
