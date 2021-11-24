import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Etudiant etudiant= new Etudiant();
        etudiant.create_etudiant();
        etudiant.afficher();
        System.out.println("Entrez le bonus de l'etudiant");
        double bonus = scan.nextDouble();
        etudiant.bonifier(bonus);
        int age = etudiant.calculerAge();
        System.out.println("l'age de l'etudiant est "+age);
        etudiant.afficher();
    }
}
