package Problema2;

public class BicicletaDeCurse extends Bicicleta{

    public void afiseazaCuloare(String culoare){
        System.out.println("Culoarea bicicletei de curse este: " + culoare);
    }

    public int intoarceNrRoti(){
        return 2;
    }

    @Override
    public void seDeplaseaza() {
        System.out.println("Bicicleta de curse se deplaseaza");
    }
}
