package javaBanque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	comptebancaire compte1= new comptebancaire(200) ;
	comptebancaire compte2= new comptebancaire(300) ;
	
	compte1.virement(compte2, 250);
	compte1.debit(300);
	
	 
	compte1.consult(); 
	compte2.consult();
		
	}

}
