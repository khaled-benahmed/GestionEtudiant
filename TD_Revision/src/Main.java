public class Main {
    public static void main(String[] args) {
    // TODO code application logic here
    Etudiant3eme Etu1=new Etudiant3eme(5551,"khaled", "benahmed", 15.5f, "math");
    Etudiant3eme Etu2=new Etudiant3eme(5551,"sghair", "jecem", 15.5f, "math");

    EtudiantAlternance Al=new EtudiantAlternance(55874,"dhia", "hamdeni", 16.5f,1200);
    // Al.toString();


    Ecole e1=new Ecole("Ecole1");
    Ecole e2=new Ecole("Ecole2");


        try {
            e1.ajouterEtudiant(Etu1);
        } catch (EtudiantExisteException e) {
            System.out.println(e.getMessage());        }
        try {
            e1.ajouterEtudiant(Etu1);
        } catch (EtudiantExisteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(e1);
//        e1.ajouterEtudiant(Etu2);
//    //e1.ajouterEtudiant(Etu1);
//        e1.ajouterEtudiant(Al);
//
//    e1.changerEcole(Etu2, e2);
//
//    System.out.println(e1.toString());
//    //System.out.println(e2);
//    e1.changerEcole(Etu2, e2);
//
//    Etu1.ajouterUneAbsence();
//    Al.ajouterUneAbsence();
//    e1.suprimerEtu(Al);
//
//    System.out.println(e1.getMoyenneDes3A());
//    System.out.println(e1.moyenneSalaireAlternants());
//    System.out.println(e1);
//    System.out.println(e2);
//

}

}
