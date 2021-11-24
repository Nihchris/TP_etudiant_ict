import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez votre choix ");
        System.out.println("1 test de la classe etudiant");
        System.out.println("2 test de la gestion d'etudiant");
        int choix = scan.nextInt();
        scan.nextLine();
        switch (choix){
            case 1 :
                Etudiant etudiant = Etudiant.create_etudiant();
                etudiant.afficher();
                System.out.println("Entrez le bonus de l'etudiant");
                double bonus = scan.nextDouble();
                etudiant.bonifier(bonus);
                int age = etudiant.calculerAge();
                System.out.println("l'age de l'etudiant est "+age+ " ans");
                etudiant.afficher();
                break;
            case 2:
                System.out.println("Entrez l'effectif de votre classe");
                int n = scan.nextInt();
                scan.nextLine();
                Etudiant[] tab = new Etudiant[n];
                for (int i = 0; i <= n-1; i++){
                    tab[i] = Etudiant.create_etudiant();
                }
                for (Etudiant et: tab) {
                    et.afficher();
                }

        }

    }
}

