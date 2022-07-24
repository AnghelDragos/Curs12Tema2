package Problema3;

public class ServiceAuto {
    public static void main(String[] args) {
        Masina dacia1 = new Dacie("Rosu");
        dacia1.porneste();
        dacia1.seDeplaseaza();
        dacia1.seOpreste();
        dacia1.afiseazaAtribute();
        dacia1.seStrica();
        dacia1.afiseazaAtribute();

        Masina ford1 = new Ford("Verde");
        ford1.porneste();
        ford1.seDeplaseaza();
        ford1.seOpreste();
        ford1.afiseazaAtribute();
        ford1.seStrica();
        ford1.afiseazaAtribute();

        Masina dacia2=new Dacie("Violet");
        Masina ford2 = new Ford("Albastru");

        Masina[] arrayMasini = {dacia1,dacia2,ford1,ford2};
        reparaMasini(arrayMasini);

    }

    static void repara(Masina masina){
        masina.areProbleme=false;
        masina.porneste();
        masina.seDeplaseaza();
    }

    static void reparaMasini(Masina[] masini){
        for(Masina m:masini){
            if(m.areProbleme==true){
                repara(m);
            }
            else{
                System.out.println("Masina nu are nevoie de reparatii");
            }
        }
    }
}
