package Problema1;

import Problema1.Enums;

public class Main {
    public static void main(String[] args) {

        Enums.Day day1 = Enums.Day.MONDAY;
        System.out.println(day1);
        if(day1== Enums.Day.MONDAY){
            System.out.println("Este o zi lucratoare");
        }

        Enums.Day day2 = Enums.Day.SATURDAY;
        switch(day2){
            case MONDAY:
                System.out.println("Este o zi lucratoare");
                break;
            case TUESDAY:
                System.out.println("Este o zi lucratoare");
                break;
            case WEDNESDAY:
                System.out.println("Este o zi lucratoare");
                break;
            case THURSDAY:
                System.out.println("Este o zi lucratoare");
                break;
            case FRIDAY:
                System.out.println("Este o zi lucratoare");
                break;
            case SATURDAY:
                System.out.println("Este weekend");
                break;
            case SUNDAY:
                System.out.println("Este Weekend");
                break;
            default:
                System.out.println("Nu ati introdus o zi a saptamanii");;
        }

    }
}
