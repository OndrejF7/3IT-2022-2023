package sk.sosholic.prvyppolrok.databazaziakov;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.util.ArrayList;
import java.util.Random;

public class AplikaciaMojejDatabazy {
    static List<Ziak> ziakList = new ArrayList<>();
        private static boolean exit = true;

    public static void main(String[] args) {
        System.out.println("Moja databaza spoluziakov ");
        while (!exit){
            System.out.println("ak chces ukoncit applikaciu stlac 0 ");
            System.out.println("ak chces vytvorit zaznam stlac 1 ");
            System.out.println("ak chces zmazat stlac 2 ");
            System.out.println("ak chces zobrazit zaznam stlac 3 ");
            System.out.println("ak chces zobrazit CELY zaznam stlac 4 ");
            int menu = scanner.nextInt();
            switch (menu){
                case 0:
                    exit = true
                            System.out.println("Aplikacia sa vypina" );
            }
        }
    }
}