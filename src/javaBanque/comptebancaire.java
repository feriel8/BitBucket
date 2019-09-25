package javaBanque;

public class comptebancaire {
	public double solde;
	public void compte (double solde) { 
		 this.solde=solde;
	}
 //Consultation de l'etat du compte
   public void consult() {
    System.out.println(solde );
   }
 // retirer une somme r de notre compte
   public void debit (double r) {
	  do {
	   this.solde -= r; } while(solde>r && r>0);
   }
 // r'ajouter une somme c a notre compte
   public void credit(double c) {
	   do {
	   this.solde += c; }while(c>0);
   }
   //virement de la somme v de notre compte vers le compte c
  public void virement(comptebancaire c2,double v   ) {
	debit(v);
	 c2.credit(v);
	 
  }
}
