package DayNine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Smoke2 {
    public static void main(String[] args) {
        Smoke2 smoke = new Smoke2();
        Smoke1 smoke1 = new Smoke1();
        smoke1.check();
    //    smoke.makeCoordsArray();
        System.out.println(smoke1.lowPointCoords);



    }

    Smoke1 smoke1b = new Smoke1();
    int[][] coordsArray = new int[(smoke1b.lowPointCoords.size()) / 2][2];
    String placeholder = "placeholder";

    /*public int[][] makeCoordsArray() { //todo
        int a = 0;
        int b = 0;
        for (int i = 0; i < smoke1b.lowPointCoords.size(); i = i + 2) {
            coordsArray[i][0] = smoke1b.lowPointCoords.get(a);
            coordsArray[i][1] = smoke1b.lowPointCoords.get(a + 1);
            a = a + 2;

        }
        return coordsArray;
    }

     */

}

/*
Plan van aanpak:
Ik wil een functie schrijven die alle laagtepunten uit de vorige opdracht opzoekt.
Het laagtepunt wordt opgeslagen als 'bekeken'.
Dan moet een functie alle buren van het laagtepunt bekijken en in 'bekeken' zetten.
Dan moeten de buren van de buren bekeken worden en in 'bekeken' worden gezet.
Als één van de buren een 9 is, stopt die serie. De 9 wordt niet in bekeken gezet (omdat hij nog aan een andere basin kan grenzen).
Tel de hoeveelheid items in 'bekeken'.

Doe dit voor alle laagtepunten.
Bepaal welke drie series het grootst zijn
Vermenigvuldig de grootte van de drie grootste series.
=> antwoord.


 */
