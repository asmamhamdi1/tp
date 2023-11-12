import java.util.Date;

class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    // Constructeur par défaut
    public Produit() {}

    // Constructeur paramétré
    public Produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    
    public void afficher() {
        System.out.println("ID: " + identifiant + ", Libellé: " + libelle +
                ", Marque: " + marque + ", Prix: " + prix + ", Date d'expiration: " + dateExpiration);
    }

    
}

public class GestionProduits {
    public static void main(String[] args) {
        
        Produit produitVide = new Produit();

        
        Produit lait = new Produit(1021, "Lait et Delice", "", 0);
        Produit yaourt = new Produit(2510, "Yaourt et Vitalait", "", 0);
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1.200);

       
        lait.afficher();
        yaourt.afficher();
        tomate.afficher();

        
        lait.setPrix(0.700);
        System.out.println("Produit modifié :");
        lait.afficher();

        
        yaourt.setMarque("Vitalait");
        tomate.setDateExpiration(new Date()); 

        
        lait.afficher();
        yaourt.afficher();
        tomate.afficher();
    }
}