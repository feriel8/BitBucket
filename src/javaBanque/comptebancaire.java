package javaBanque;

public class comptebancaire {
	public double solde;
	
	public comptebancaire(double s) { 
		 this.solde=s;
	}
 //Consultation de l'etat du compte
   public void consult() {
    System.out.println("votre solde est de " + this.solde );
   }
 // retirer une somme r de notre compte
   public void debit (double r) {
	  if(solde>r && r>0) {this.solde -= r; }
                                 }
 // r'ajouter une somme c a notre compte
   public void credit(double c) {
	   if(c>0) {
	   this.solde += c; }
                                 }
   //virement de la somme v de notre compte vers le compte c
  public void virement(comptebancaire c2,double v   ) {
	debit(v);
	 c2.credit(v);
	 
	 
  }
}
