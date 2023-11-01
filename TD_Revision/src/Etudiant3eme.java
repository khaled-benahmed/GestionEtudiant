
public class Etudiant3eme extends Etudiant{
    private String branche;

    public Etudiant3eme(){}
    public Etudiant3eme(int id ,String nom ,String prenom ,float moyenne,String branche){
        super(id,nom,prenom,moyenne);
        this.branche=branche;
    }


    @Override
    public void ajouterUneAbsence(){
        float moyenne = getMoyenne();
        moyenne -=50;
        System.out.println("il ya une absence Etudant3eme: moyenne= "+getMoyenne());
    }

    @Override
    public String toString() {
        return super.toString()+"Etudiant3eme{" + "branche=" + branche + '}';
    }


}