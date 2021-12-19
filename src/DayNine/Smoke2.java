package DayNine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Smoke2 {
    public static void main(String[] args) {
        Smoke2 smoke = new Smoke2();
        Smoke1 smoke1 = new Smoke1();

        //    smoke.makeCoordsArray();

        for (int m = 0; m < smoke1.lowPointCoordArray.length; m++) {
            System.out.println(smoke1.lowPointCoordArray[m][0] + "," + smoke1.lowPointCoordArray[m][1]);
        }

    }

    Smoke1 smoke1b = new Smoke1();

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

In de puzzle input zijn 226 basins te vinden.


 */
