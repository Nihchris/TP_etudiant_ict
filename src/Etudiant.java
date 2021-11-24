
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Etudiant {
    public String matricule;
    public String nom;
    public char genre;
    public Date date_naissance;
    public double moyenne;

    public Etudiant(String nom, String matricule, char genre, Date date_naissance, double moyenne) {
            this.nom = nom;
            this.matricule = matricule;
            this.genre = genre;
            this.date_naissance = date_naissance;
            this.moyenne = moyenne;
    }


    public static Etudiant create_etudiant() {
        Scanner scan = new Scanner(System.in);
        // nom de l'etudiant
        String nom;
        do {
            System.out.print("Entrez le nom de l'etudiant \n");
            nom = scan.nextLine();
        }while (nom.length() < 3);

        // matricule de l'etudiant
        String matricule;
        do {
            System.out.print("Entrez le matricule de l'etudiant \n");
            matricule = scan.nextLine();
        }while (matricule.length() < 7);

        // genre de l'etudiant
        char genre;
         do{
             System.out.print("Entrez le genre de l'etudiant \n");
             genre = scan.nextLine().charAt(0);
         }while (genre != 'M' && genre !='F' );

         // moyenne de l'etudiant
        double moyenne;
         do{
             System.out.print("Entrez la moyenne de l'etudiant \n");
             moyenne = scan.nextDouble();
         }while (moyenne > 20);

         // date de naissance de l'etudiant
         Date date_naissance = null;
         boolean dt = false;
        while(!dt){
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             System.out.print("Entrez la date de naissance au format dd/MM/yyyy \n");
             String dateInString = scan.nextLine();
             try {
                 date_naissance = sdf.parse(dateInString);
                 dt = true;
             } catch (ParseException e) {

             }
         }
         return new Etudiant(nom,matricule,genre,date_naissance,moyenne);
    }


    void afficher() {
        System.out.println("Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", genre=" + genre +
                ", date_naissance=" + date_naissance +
                ", moyenne=" + moyenne +
                '}');
    }

    public int calculerAge() {
        return new Date().getYear() - date_naissance.getYear();
    }

    public void bonifier(double bonus) {
        moyenne += bonus;

    }
}

