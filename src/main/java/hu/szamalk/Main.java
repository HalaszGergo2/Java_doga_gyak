package hu.szamalk;

import hu.szamalk.modell.Betu;

public class Main {
    public static void main(String[] args) {
        Betu betu = new Betu("#");
        betu.betuBeallit();
        betu.rajzolas();
        int sorSzam = betu.hanyJel(3, "sor");
        int oszlopSzam = betu.hanyJel(1, "oszlop");
        System.out.println("Sorban található jelek száma: " + sorSzam);
        System.out.println("Oszlopban található jelek száma: " + oszlopSzam);
        boolean sorTeli = betu.sorTeliE(1);
        if (sorTeli == true){
            System.out.println("A sor tele van a megadott jellel");
        }else{
            System.out.println("A sorban nincs vagy nem csak jel található.");
        }
        boolean oszlopTeli = betu.oszlopTeliE(1);
        if(oszlopTeli == true){
            System.out.println("Az oszlop tele van a megadott jellel");
        }else{
            System.out.println("Az oszlopban nincs vagy nem csak jel található.");
        }

    }
}