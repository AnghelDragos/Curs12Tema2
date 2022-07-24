package Problema2;

public class Automobil implements VehiculTerestru{

    @Override
    public void afiseazaCuloare(String culoare){
        System.out.println("Culoarea automobilului este: " + culoare);
    }

    @Override
    public int intoarceNrRoti(){
        return 4;
    }


    @Override
    public void seDeplaseaza() {
        System.out.println("Automobilul se deplaseaza");
    }
}
