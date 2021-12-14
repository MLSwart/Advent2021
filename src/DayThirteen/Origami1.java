package DayThirteen;

import java.util.Arrays;

public class Origami1 {
    public static void main(String[] args) {
        Origami1 origami = new Origami1();
        OriInput oriInput = new OriInput();
        origami.findMax(oriInput.inputRaw);
        //origami.generateMapArray(oriInput.inputRaw, origami.findMax(oriInput.inputRaw));
        origami.horizontalFold(origami.generateMapArray(oriInput.inputRaw, origami.findMax(oriInput.inputRaw)));

    }

    int maximumX = 0;
    int maximumY = 0;


    public int[][] findMax(int[] inputRaw) {
        int[][] mapArray = new int[maximumX + 1][maximumY + 1];
        for (int i = 0; i < inputRaw.length; i = i + 2) {
            if (inputRaw[i] > maximumY) {
                maximumY = inputRaw[i];

            }
        }
        for (int j = 1; j < inputRaw.length; j = j + 2) {
            if (inputRaw[j] > maximumX) {
                maximumX = inputRaw[j];
            }

        }
        return mapArray;

    }


    public int[][] generateMapArray(int[] inputRaw, int[][] mapArray) {
        for (int i = 0; i < inputRaw.length - 1; i = i + 2) { //length= aantal rijen (?)
            int x = inputRaw[i + 1];
            int y = inputRaw[i];
            mapArray[x][y] = mapArray[x][y] + 1;

        }

        return mapArray;

    }

    public void printMap(int[][] mapArray) {
        for (int[] ints : mapArray) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public void horizontalFold(int[][] mapArray) { //vouw op y-as
        int foldline = 7;
        for (int i = foldline; i < mapArray.length; i++) {              //we gaan de rijen af
            int diff = Math.abs(foldline - i);                          //we bepalen het verschil tussen de y van de vouwlijn en de rijen eronder
            for (int j = 0; j < mapArray[i].length; j++) {              //we gaan de kolommen in de geselecteerde rij af
                if (mapArray[i][j] > 0) {                               //staat er een stip? Dan...
                    mapArray[i - diff][j] = mapArray[foldline-i][j];    //verplaatsen we de stip naar vouwlijn minus verschil
                    mapArray[i][j] = 0;                                 //en maken de vakjes onder de vouwlijn nul.
                }

            }

        }
        printMap(mapArray);

    }
}

/*
Plan van aanpak:
-Ik verdeel de input in x- en y- waarden, om een array te maken...
-waarin een waarde van groter dan 1 betekent een stip.
-Het array wordt <max X waarde> bij <max Y waarde>. 0,0 is linksboven. Kolommen zijn x-waarden. Rijen zijn y-waarden.
-Er zijn vouw-instructies. We beginnen voor de eerste helft met de eerste instructie.
-Als het papier vouwt op de y-as gaan de onderste waarden gespiegeld langs die y-as omhoog.
-Als het papier vouwt op de x-as gaan de rechterwaarden gespiegeld langs die y-as naar links.

-We willen een functie die het initiële array genereert, met de bijbehorende 1'en op de gegeven coordinaten.

-We willen een functie die een y-as (horizontale) vouw simuleert.
    -Waarden die op de 1e rij onder de vouw zitten, komen op de 1e rij boven de vouw. Dus rij vouw+1 => vouw-1.
    -Waarden onder de vouw worden 0/idealiter wordt het array 'afgeknipt' onder de vouw
-We willen een functie die een x-as (verticale) vouw simuleert.
    -Waarden die op de 1e kolom rechts van de vouw zitten, komen op de 1e rij links van de vouw. Dus kolom vouw+1 => vouw-1.

-We willen een functie die het totale aantal stippen telt. Het maakt niet uit of een stip +1, +2, +3 enz is.



 */
