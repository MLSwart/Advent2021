package DayNine;

import java.util.ArrayList;
import java.util.List;

public class Smoke2 {

    public static void main(String[] args) {
        Smoke1 smokeNew = new Smoke1();
        Smoke2 smoke = new Smoke2();
        smoke.printCoordsArray();
        for(int lowPointNum =0; lowPointNum<smokeNew.lowPointCoordArray.length; lowPointNum++){
            smoke.checkBasinSize(smokeNew.lowPointCoordArray, smokeNew.heightMap, lowPointNum);
        }


    }
    Smoke1 smoke1 = new Smoke1();



    public void printCoordsArray() {
        for (int lowPointNum = 0; lowPointNum < smoke1.lowPointCoordArray.length; lowPointNum++) {
            System.out.println(smoke1.lowPointCoordArray[lowPointNum][0] + "," + smoke1.lowPointCoordArray[lowPointNum][1]);
        }

    }

    public void checkBasinSize(int[][] lowPointCoordArray, int[][] heightMap, int lowPointNum) {
        List<int[]> checked = new ArrayList<int[]>();
        int xCoord = smoke1.lowPointCoordArray[lowPointNum][0];
        int yCoord = smoke1.lowPointCoordArray[lowPointNum][1];
        checked.add(heightMap[lowPointNum]);
        boolean negenGevonden=false;
        while(!negenGevonden){
            xCoord--;
        if (heightMap[xCoord][yCoord]!=9||xCoord>=0||!checked.contains(heightMap[lowPointNum])){ //links kijken
            checked.add(heightMap[lowPointNum]);
        }
        else negenGevonden=true;

    }
        System.out.print(checked);

}

//check links
//check rechts
//check rij omhoog
//check rij omlaag



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
