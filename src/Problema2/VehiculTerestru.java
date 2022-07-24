package Problema2;

public interface VehiculTerestru extends Vehicul {

    default void afiseazaCuloare(String culoare){
        System.out.println("Culoarea vehicului terestru este: " + culoare);
    }

    int intoarceNrRoti();
}
