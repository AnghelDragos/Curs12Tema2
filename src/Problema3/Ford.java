package Problema3;

public class Ford extends Masina{
    public Ford(String culoare){
        super(culoare, true);
    }

    @Override
    public void porneste(){
        System.out.println("Fordul a pornit");
    }
    @Override
    public void seDeplaseaza(){
        System.out.println("Fordul se deplaseaza");
    }
    @Override
    public void seOpreste(){
        System.out.println("Fordul se opreste");
    }
    @Override
    public void seStrica(){
        System.out.println("Fordul se strica");
        areProbleme=true;
    }

}
