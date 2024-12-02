package hu.szamalk.modell;

import java.util.Arrays;

public class Betu {

    private String jel;
    private String[][] betu;

    public Betu(String jel) {
        this.jel = jel;
    }

    public void betuBeallit(){
        betu = new String[5][5];

        betu[0] = new String[]{jel, jel, jel, jel, jel};
        betu[1] = new String[]{jel, " ", " ", " ", " "};
        betu[2] = new String[]{jel, jel, jel, jel, jel};
        betu[3] = new String[]{jel, " ", " ", jel, jel};
        betu[4] = new String[]{jel, jel, jel, jel, jel};

    }

    public void rajzolas(){

        for (int i = 0; i < betu.length; i++) {
            for (int j = 0; j < betu[i].length; j++) {
                System.out.print(betu[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int hanyJel(int hanyadik, String oszlopVagySor){
        int db = 0;
        if (oszlopVagySor.equals("sor")) {
            for (int i = 0; i < betu[hanyadik].length; i++) {
                if (betu[hanyadik][i].equals(jel)) {
                    db++;
                }
            }
        }else if(oszlopVagySor.equals("oszlop")){
            for (int j = 0; j < betu[hanyadik].length; j++){
                if (betu[j][hanyadik].equals(jel)){
                    db++;
                }
            }
        }
        return db;
    }

    public boolean sorTeliE(int hanyadik){
        boolean teli = false;

        for (int i = 0; i < betu[hanyadik].length; i++){
            if(betu[hanyadik][i] != null && betu[hanyadik][i].equals(jel)){
                teli = true;
            }else{
                teli = false;
            }
        }
        return teli;
    }

    public boolean oszlopTeliE(int hanyadik){
        boolean teli = false;
        int i = 0;
        while (betu[i][hanyadik].equals(jel)){
            i++;
            teli = true;
        }

        /*for (int i = 0; i < betu[hanyadik].length; i++){
            if(betu[i][hanyadik] != null && betu[i][hanyadik].equals(jel)){
                teli = true;
            }else{
                teli = false;
            }
        }*/
        return teli;
    }

}
