package Problema3;

public class Dacie extends Masina{
    public Dacie(String culoare){
        super(culoare,false);
    }

    @Override
    public void porneste(){
        System.out.println("Dacia a pornit");
    }

    @Override
    public void seDeplaseaza(){
        System.out.println("Dacia se deplaseaza");
    }
    @Override
    public void seOpreste(){
        System.out.println("Dacia se opreste");
    }
    @Override
    public void seStrica(){
        System.out.println("Dacia se strica");
        areProbleme=true;
    }
}
