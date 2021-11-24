
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Etudiant {
    private String matricule;
    private String nom;
    private char genre;
    private Date date_naissance = new Date();
    private double moyenne;


     void create_etudiant() {
        Scanner scan = new Scanner(System.in);
        // nom de l'etudiant
        do {
            System.out.print("Entrez le nom de l'etudiant \n");
            nom = scan.nextLine();
        }while (nom.length() < 3);

        // matricule de l'etudiant
        do {
            System.out.print("Entrez le matricule de l'etudiant \n");
            matricule = scan.nextLine();
        }while (matricule.length() < 7);

        // genre de l'etudiant

         do{
             System.out.print("Entrez le genre de l'etudiant \n");
             genre = scan.nextLine().charAt(0);
         }while (genre != 'M' && genre !='F' );

         // moyenne de l'etudiant

         do{
             System.out.print("Entrez la moyenne de l'etudiant \n");
             moyenne = scan.nextDouble();
         }while (moyenne > 20);

         // date de naissance de l'etudiant

         boolean dt = false;
         do{
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             date_naissance = null;
             System.out.print("Entrez la date de naissance au format dd/MM/yyyy \n");
             try {
                 date_naissance = sdf.parse(scan.nextLine());
                 dt = true;
             } catch (ParseException e) {
                 e.printStackTrace();
             }
         }while(!dt);
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

