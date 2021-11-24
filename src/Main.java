import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez l'effectif de votre classe");
        int n = scan.nextInt();
        scan.nextLine();
        Etudiant[] tab = new Etudiant[n];
        for (int i = 0; i <= n-1; i++){
            tab[i] = Etudiant.create_etudiant();
        }
        Etudiant tmp;
        for (int i = 0; i <= tab.length-2 ; i++){
            for (int j = 1; j <= tab.length-1;j++){
                if(tab [i].moyenne < tab[j].moyenne){
                    tmp = tab [i];
                    tab [i] = tab [j];
                    tab [j] = tmp;
                }
            }
        }
        char c;
        do {
            System.out.println("Entrez votre choix ");
            System.out.println("1 Afficher les etudiants par ordres de merites");
            System.out.println("2 Afficher les informations du premier ");
            System.out.println("3 Afficher les informations du dernier ");
            System.out.println("4 reinitialliser la liste ");
            System.out.println("5 Sortir du programme ");
            int choix = scan.nextInt();
            scan.nextLine();
            switch (choix){
                case 1 :
                    for (Etudiant et: tab) {
                        et.afficher();
                    }
                    break;
                case 2:
                    tab[0].afficher();
                    break;
                case 3 :
                    tab[tab.length - 1].afficher();
                    break;
                case 4 :
                    tab = null;
                    break;
                case 5 : break;
            }
            System.out.println("continuer ? o/n");
            c = scan.nextLine().charAt(0);
        }while(c== 'o');


    }
}

