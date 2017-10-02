package dk.mich279q;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Bord bord1 = new Bord();
        Bord bord2 = new Bord();
        Bord bord3 = new Bord();

        bord1.setMateriale("Warm soft Wood, honey");
        System.out.println("Bord1 is made of " + bord1.getMateriale() + ".");

        bord2.setMateriale("Cold hard Steel, baby");
        System.out.println("Bord2 is made of " + bord2.getMateriale() + ".");

        bord3.setMateriale("Pure transparent Glass, darling");
        System.out.println("Bord3 is made of " + bord3.getMateriale() + ".");

        bord1.setAntalBordBen(10);
        System.out.println("Bord1 har " + bord1.getAntalBordBen() + " ben.");

    }
}
