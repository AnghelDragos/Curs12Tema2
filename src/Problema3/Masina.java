package Problema3;

public abstract class Masina {
    String culoare;
    boolean areProbleme;

    public Masina(String culoare, boolean areProbleme){
        this.culoare=culoare;
        this.areProbleme=areProbleme;
    }

    public void afiseazaAtribute(){
        System.out.println("Culoarea masinii este: "+culoare);
        if(areProbleme){
            System.out.println("Masina are probleme");
        }
        else{
            System.out.println("Masina nu are probleme");
        }
    }

    abstract void porneste();
    abstract void seDeplaseaza();
    abstract void seOpreste();
    abstract void seStrica();


}
