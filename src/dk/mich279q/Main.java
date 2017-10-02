package dk.mich279q;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World"); //Hello world test

        Bord bord1 = new Bord(); //ny class (Bord) med ny variabel (bord1).

        bord1.materiale = "Træ"; //bord1 er lavet af træ, med variablen materiel fra klassen Bord.
        System.out.println("Bord1 er lavet af " + bord1.materiale + ".");

        bord1.setAntalBordBen(10); //Setter der indsætter antal bordben. (10)
        System.out.println("Bord1 har " + bord1.getAntalBordBen() + " ben."); //udkriver Getter med antalbordben.
    }
}
