package DayFive;

public class HydrothermalVenture1 {
    public static void main(String[] args) {
        HydrothermalVenture1 hydrothermalVenture1 = new HydrothermalVenture1();
        hydrothermalVenture1.maximumXValue(hydrothermalVenture1.input);
        hydrothermalVenture1.maximumYValue(hydrothermalVenture1.input);
        System.out.println(hydrothermalVenture1.maximumXValue(hydrothermalVenture1.input) + " , " + hydrothermalVenture1.maximumYValue(hydrothermalVenture1.input));
        hydrothermalVenture1.isRechteLijn(hydrothermalVenture1.input);

    }

    int[][] input = {{0, 9, 5, 9}, {8, 0, 0, 8}, {9, 4, 3, 4}, {2, 2, 2, 1}, {7, 0, 7, 4}, {6, 4, 2, 0}, {0, 9, 2, 9}, {3, 4, 1, 4}, {0, 0, 8, 8}, {5, 5, 8, 2}};
    //int[][] mapArray = new int[][];

    public int maximumXValue(int[][] setjeWaarden) {
        int hoogsteXWaarde = 0;
        int hoogsteVanTwee = 0;
        for (int i = 0; i < input.length; i++) {

            if (setjeWaarden[i][0] > setjeWaarden[i][2]) {
                hoogsteVanTwee = setjeWaarden[i][0];
                if (hoogsteVanTwee > hoogsteXWaarde) {
                    hoogsteXWaarde = hoogsteVanTwee;
                }
            } else {
                hoogsteVanTwee = setjeWaarden[i][2];
                if (hoogsteVanTwee > hoogsteXWaarde) {
                    hoogsteXWaarde = hoogsteVanTwee;
                }
            }
        }
        return hoogsteXWaarde;
    }

    public int maximumYValue(int[][] setjeWaarden) {
        int hoogsteYWaarde = 0;
        int hoogsteVanTwee = 0;
        for (int i = 0; i < input.length; i++) {

            if (setjeWaarden[i][1] > setjeWaarden[i][3]) {
                hoogsteVanTwee = setjeWaarden[i][1];
                if (hoogsteVanTwee > hoogsteYWaarde) {
                    hoogsteYWaarde = hoogsteVanTwee;
                }
            } else {
                hoogsteVanTwee = setjeWaarden[i][3];
                if (hoogsteVanTwee > hoogsteYWaarde) {
                    hoogsteYWaarde = hoogsteVanTwee;
                }
            }
        }
        return hoogsteYWaarde;
    }

    public boolean isRechteLijn(int[][] setjeWaarden) {
        for (int i = 0; i < input.length; i++) {
            //(i is hier het nummer van het array)
            if (setjeWaarden[i][0] == setjeWaarden[i][2]) {
                return true;
            } else if (setjeWaarden[i][1] == setjeWaarden[i][3]) {
                return true;
            }
        }
        return false;
        //ik denk dat deze method nu kijkt of er ergens een rechte lijn is. Dat wil ik niet: ik wil weten welke items in het array een rechte lijn zijn.
    }
}



/*
{findMaximumValues: Ik heb een method nodig die kijkt wat de grootste x-waarde en de grootste y-waarde is.}
{generateMapArray: Dan moet het programma een mapArray maken van de grootte [maximumX][maximumY].
Het array begint met op elke positie een '0'}

{findVerticals, findHorizontals: Het programma gaat alle entries af en zoekt daarbij naar entries waarbij x1=x2 of y1=y2}
Als hij zo'n entry vindt vult hij het array:
{fillVertical: als x1=x2, telt hij bij alle waarden van y1 tot y2 (inclusief) '1' op op rij x.}
{fillHorizontal: -als y1=y2 telt hij bij alle waarden van x1 tot x2 (inclusief) '1' op op rij y.}

{updateMap: geef het mapArray weer met de nieuwe waarden}




 */