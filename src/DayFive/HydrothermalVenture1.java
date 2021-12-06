package DayFive;

import java.util.Arrays;

public class HydrothermalVenture1 {
    int[][] input = {{0, 9, 5, 9}, {8, 0, 0, 8}, {9, 4, 3, 4}, {2, 2, 2, 1}, {7, 0, 7, 4}, {6, 4, 2, 0}, {0, 9, 2, 9}, {3, 4, 1, 4}, {0, 0, 8, 8}, {5, 5, 8, 2}};

    public static void main(String[] args) {
        HydrothermalVenture1 vent = new HydrothermalVenture1();
        vent.run();
    }

    void run() {
        maximumXValue(input);
        maximumYValue(input);
        int[][] mapArray = new int[maximumXValue(input)][maximumYValue(input)];

        for (int x = 0; x < input.length; x++) {
            isRechteLijn(input[x], mapArray);
        }
        int crossings = 0;
        for (int i = 0; i < maximumXValue(input); i++) {
            for (int k = 0; k < maximumYValue(input); k++) {
                if (mapArray[i][k] == 2) {
                    crossings++;
                }

            }
        }
        System.out.println(crossings);
    }


    public int maximumXValue(int[][] setjeWaarden) {
        int hoogsteXWaarde = 0;

        for (int i = 0; i < setjeWaarden.length; i++) {

            if (setjeWaarden[i][0] > setjeWaarden[i][2]) {
                int hoogsteVanTwee = setjeWaarden[i][0];
                if (hoogsteVanTwee > hoogsteXWaarde) {
                    hoogsteXWaarde = hoogsteVanTwee;
                }
            } else {
                int hoogsteVanTwee = setjeWaarden[i][2];
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
        for (int i = 0; i < setjeWaarden.length; i++) {

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

    public boolean isRechteLijn(int[] setjeWaarden, int[][] mapArray) {
        for (int i = 0; i < 2; i++) {
            if (setjeWaarden[i] == setjeWaarden[i + 2]) {
                {
                    if (i == 0) {
                        int eersteWaarde = setjeWaarden[i + 1];
                        int tweedeWaarde = setjeWaarden[i + 3];
                        if (eersteWaarde > tweedeWaarde) {
                            eersteWaarde = setjeWaarden[i + 3];
                            tweedeWaarde = setjeWaarden[i + 1];

                        }
                        fillHorizontal(setjeWaarden[i], eersteWaarde, tweedeWaarde, mapArray);

                    } else {
                        int eersteWaarde = setjeWaarden[i - 1];
                        int tweedeWaarde = setjeWaarden[i + 1];
                        if (eersteWaarde > tweedeWaarde) {
                            eersteWaarde = setjeWaarden[i + 1];
                            tweedeWaarde = setjeWaarden[i - 1];
                        }
                        fillVertical(setjeWaarden[i], eersteWaarde, tweedeWaarde, mapArray);

                    }
                }
                return true;
            }
        }
        return false;
    }

    public void fillHorizontal(int x, int y1, int y2, int[][] array) {
        for (int q = y1; q < y2; q++) {
            array[x][q]++;
        }


    }

    public void fillVertical(int y, int x1, int x2, int[][] array) {
        for (int q = x1; q < x2; q++) {
            array[y][q]++;
        }

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