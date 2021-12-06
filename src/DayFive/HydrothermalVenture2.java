package DayFive;

import static java.lang.Math.abs;

public class HydrothermalVenture2 {
    int[][] input = {{0, 9, 5, 9}, {8, 0, 0, 8}, {9, 4, 3, 4}, {2, 2, 2, 1}, {7, 0, 7, 4}, {6, 4, 2, 0}, {0, 9, 2, 9}, {3, 4, 1, 4}, {0, 0, 8, 8}, {5, 5, 8, 2}};

    public static void main(String[] args) {
        HydrothermalVenture2 vent = new HydrothermalVenture2();
        vent.run();
    }

    void run() {
        maximumXValue(input);
        maximumYValue(input);
        int[][] mapArray = new int[maximumXValue(input) + 1][maximumYValue(input) + 1];

        for (int x = 0; x < input.length; x++) {
            rechteLijn(input[x], mapArray);
        }
        for (int i = 0; i < input.length; i++) {
            diagonaleLijnen(input[i], mapArray);
        }

        int crossings = 0;
        for (int i = 0; i < mapArray.length; i++) {
            for (int k = 0; k < mapArray[0].length; k++) {
                if (mapArray[i][k] >= 2) {
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

        for (int i = 0; i < setjeWaarden.length; i++) {
            if (setjeWaarden[i][1] > setjeWaarden[i][3]) {
                int hoogsteVanTwee = setjeWaarden[i][1];
                if (hoogsteVanTwee > hoogsteYWaarde) {
                    hoogsteYWaarde = hoogsteVanTwee;
                }
            } else {
                int hoogsteVanTwee = setjeWaarden[i][3];
                if (hoogsteVanTwee > hoogsteYWaarde) {
                    hoogsteYWaarde = hoogsteVanTwee;
                }
            }
        }
        return hoogsteYWaarde;
    }

    public void rechteLijn(int[] setjeWaarden, int[][] mapArray) {

        if (setjeWaarden[0] == setjeWaarden[2]) {
            int eersteWaarde = setjeWaarden[1];
            int tweedeWaarde = setjeWaarden[3];
            if (eersteWaarde > tweedeWaarde) {
                eersteWaarde = setjeWaarden[3];
                tweedeWaarde = setjeWaarden[1];

            }
            fillHorizontal(setjeWaarden[0], eersteWaarde, tweedeWaarde, mapArray);
        }

        if (setjeWaarden[1] == setjeWaarden[3]) {
            int eersteWaarde = setjeWaarden[0];
            int tweedeWaarde = setjeWaarden[2];
            if (eersteWaarde > tweedeWaarde) {
                eersteWaarde = setjeWaarden[2];
                tweedeWaarde = setjeWaarden[0];
            }
            fillVertical(setjeWaarden[1], eersteWaarde, tweedeWaarde, mapArray);
        }
    }

    public void fillHorizontal(int x, int y1, int y2, int[][] array) {
        for (int q = y2; q >= y1; q--) {
            array[x][q]++;
        }
    }

    public void fillVertical(int y, int x1, int x2, int[][] array) {
        for (int q = x2; q >= x1; q--) {
            array[q][y]++;
        }
    }

    public void diagonaleLijnen(int[] setjeWaarden, int[][] mapArray) {
        int verschilX1 = setjeWaarden[0] - setjeWaarden[2];
        int verschilX2 = setjeWaarden[2] - setjeWaarden[0];
        int verschilY1 = setjeWaarden[1] - setjeWaarden[3];
        int verschilY2 = setjeWaarden[3] - setjeWaarden[1];

        if (abs(verschilX1) == abs(verschilY1) || abs(verschilX2) == abs(verschilY2)) {
            //diagonaal gevonden;
            if ((verschilX1) == (verschilY1)) {
                //geval 1 of 4
                if (setjeWaarden[0] < setjeWaarden[2]) //dus x wordt groter
                {//geval 4. Twijfel. Welke setjeWaarden[?]
                    fillDownRightwardDiagonal(setjeWaarden[0], setjeWaarden[2], setjeWaarden[3], mapArray);
                } else {//geval 1
                    fillUpLeftwardDiagonal(setjeWaarden[0], setjeWaarden[2], setjeWaarden[3], mapArray);
                }
            } else {
                //geval 2 of 3
                if (setjeWaarden[0] < setjeWaarden[3]) {//dus x wordt groter, y kleiner
                    //geval 2
                    fillUpRightwardDiagonal(setjeWaarden[0], setjeWaarden[2], setjeWaarden[3], mapArray);
                } else {
                    //geval 3
                    fillDownLeftwardDiagonal(setjeWaarden[0], setjeWaarden[2], setjeWaarden[3], mapArray);

                }
            }
        }
    }


    public void fillUpLeftwardDiagonal(int x, int y1, int y2, int[][] array) {
        //geval 1: dx=-, dy=- (NW)
        for (int q = x; q >= y2; q--) {
            array[x][q]++;
        }
    }

    public void fillUpRightwardDiagonal(int x, int y1, int y2, int[][] array) {
        //geval 2: dx=+, dy=- (NE)
        for (int q = y2; q >= y1; q--) {
            array[x][q]++;
            x++;
        }
    }

    public void fillDownLeftwardDiagonal(int x, int y1, int y2, int[][] array) {
        //geval 3: dx-, dy+ (SW)
        for (int q = y1; q <= y2; q++) {
            array[q][x]++;
            x--;
        }
    }

    public void fillDownRightwardDiagonal(int x, int y1, int y2, int[][] array) {
        //geval 4: dx+, dy+ (SE)
        for (int q = y1; q <= y2; q++) {
            array[x][q]++;
            x++;
        }
    }


}

/*
Vul op de mapArray de rechte lijnen in.
Detecteer de diagonale lijnen:
    -neem punt (x[oud],y[oud])
    -neem punt (x[nieuw], y2[nieuw])
    -is het verschil tussen [nieuw] en [oud] hetzelfde voor x en y? Diagonaal gedetecteerd.
    -als x==y: schuin omlaag.
    -als x!=y: schuin omhoog.

Vul op de mapArray de diagonale lijnen in:
    -omlaag:



 */
