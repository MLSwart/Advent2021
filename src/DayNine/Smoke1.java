package DayNine;

import java.util.ArrayList;
import java.util.List;

public class Smoke1 {
    public static void main(String[] args) {
        Smoke1 smoke = new Smoke1();
        smoke.check();

        System.out.println(smoke.lowPointValues.size());

        int uitkomst = smoke.lowPointValues.size();
        for (int u = 0; u < smoke.lowPointValues.size(); u++) {
            uitkomst += smoke.lowPointValues.get(u);
        }

        System.out.println(uitkomst);


    }

    public void check() {
        controleerMidden(heightMap);
        controleerRandBoven(heightMap);
        controleerRandOnder(heightMap);
        controleerRandLinks(heightMap);
        controleerRandRechts(heightMap);
        controleerHoeken(heightMap);
    }

    int[][] heightMap = {
            {2, 1, 9, 9, 9, 4, 3, 2, 1, 0},
            {3, 9, 8, 7, 8, 9, 4, 9, 2, 1},
            {9, 8, 5, 6, 7, 8, 9, 8, 9, 2},
            {8, 7, 6, 7, 8, 9, 6, 7, 8, 9},
            {9, 8, 9, 9, 9, 6, 5, 6, 7, 8}
    };

    int laatsteRij = heightMap.length - 1;
    int laatsteKolom = heightMap[0].length - 1;


    List<Integer> lowPointValues = new ArrayList<>();
    List<Integer> lowPointCoords = new ArrayList<>();
    int[][] lowPointCoordArray;

    {
        check();
        lowPointCoordArray = new int[lowPointCoords.size() / 2][2];
        int a = 0;
        for (int i = 0; i < lowPointCoords.size() / 2; i++) {
            lowPointCoordArray[i][0] = lowPointCoords.get(a);
            lowPointCoordArray[i][1] = lowPointCoords.get(a + 1);
            a = a + 2;

        }
    }


    public void controleerMidden(int[][] heightMap) {
        for (int i = 1; i < heightMap.length - 1; i++) {
            for (int j = 1; j < heightMap[i].length - 1; j++) {
                int a = heightMap[i - 1][j];
                int b = heightMap[i][j - 1];
                int c = heightMap[i][j + 1];
                int d = heightMap[i + 1][j];
                if (heightMap[i][j] < a && heightMap[i][j] < b && heightMap[i][j] < c && heightMap[i][j] < d) {
                    lowPointValues.add(heightMap[i][j]);
                    lowPointCoords.add(i);
                    lowPointCoords.add(j);
                }

            }
        }

    }

    public void controleerRandBoven(int[][] heightMap) {

        for (int j = 1; j < (heightMap[0].length) - 1; j++) {

            int b = heightMap[0][j - 1];
            int c = heightMap[0][j + 1];
            int d = heightMap[0 + 1][j];
            if (heightMap[0][j] < b && heightMap[0][j] < c && heightMap[0][j] < d) {
                lowPointValues.add(heightMap[0][j]);
                lowPointCoords.add(0);
                lowPointCoords.add(j);
            }

        }
    }

    public void controleerRandOnder(int[][] heightMap) {

        for (int j = 1; j < heightMap[heightMap.length - 1].length - 1; j++) {
            int a = heightMap[heightMap.length - 2][j];
            int b = heightMap[heightMap.length - 1][j - 1];
            int c = heightMap[heightMap.length - 1][j + 1];
            if (heightMap[heightMap.length - 1][j] < a && heightMap[heightMap.length - 1][j] < b && heightMap[heightMap.length - 1][j] < c) {
                lowPointValues.add(heightMap[heightMap.length - 1][j]);
                lowPointCoords.add(heightMap.length - 1);
                lowPointCoords.add(j);
            }

        }
    }

    public void controleerRandLinks(int[][] heightMap) {
        for (int i = 1; i < laatsteRij; i++) {
            int a = heightMap[i - 1][0];
            int c = heightMap[i][1];
            int d = heightMap[i + 1][0];

            if (heightMap[i][0] < a && heightMap[i][0] < c && heightMap[i][0] < d) {
                lowPointValues.add(heightMap[i][0]);
                lowPointCoords.add(i);
                lowPointCoords.add(0);
            }

        }
    }

    public void controleerRandRechts(int[][] heightMap) {

        for (int i = 1; i < laatsteRij; i++) {
            int a = heightMap[i - 1][laatsteKolom];
            int b = heightMap[i][laatsteKolom - 1];
            int d = heightMap[i + 1][laatsteKolom];

            if (heightMap[i][laatsteKolom] < a && heightMap[i][laatsteKolom] < b && heightMap[i][laatsteKolom] < d) {
                lowPointValues.add(heightMap[i][laatsteKolom]);
                lowPointCoords.add(i);
                lowPointCoords.add(laatsteKolom);
            }

        }
    }

    public void controleerHoeken(int[][] heightMap) {
        if (heightMap[0][0] < heightMap[1][0] && heightMap[0][0] < heightMap[0][1]) { //linksboven
            lowPointValues.add(heightMap[0][0]);
            lowPointCoords.add(0);
            lowPointCoords.add(0);
        }
        if (heightMap[0][laatsteKolom] < heightMap[1][laatsteKolom] && heightMap[0][laatsteKolom] < heightMap[0][laatsteKolom - 1]) { //rechtsboven
            lowPointValues.add(heightMap[0][laatsteKolom]);
            lowPointCoords.add(0);
            lowPointCoords.add(laatsteKolom);
        }
        if (heightMap[laatsteRij][0] < heightMap[laatsteRij][1] && heightMap[laatsteRij][0] < heightMap[laatsteRij - 1][0]) { //linksonder
            lowPointValues.add(heightMap[laatsteRij][0]);
            lowPointCoords.add(laatsteRij);
            lowPointCoords.add(0);
        }
        if (heightMap[laatsteRij][laatsteKolom] < heightMap[laatsteRij - 1][laatsteKolom] && heightMap[laatsteRij][laatsteKolom] < heightMap[laatsteRij][laatsteKolom - 1]) {
            lowPointValues.add(heightMap[laatsteRij][laatsteKolom]);
            lowPointCoords.add(laatsteRij);
            lowPointCoords.add(laatsteKolom);
        }
    }
}


//put height map in 2D array
//write a function that checks the middle of the map (from minValue+1 to maxValue-1 on both axes) for low points (these are lower than all 4 adjacent values)
//  if it finds a low point, put the value+1 in a counter.
//write a function that checks the edges of the map, excluding the corners, for low points (these are lower than all 3 adjacent values)
//  if it finds a low point, put the value+1 in a counter.
//write a function that checks the corners of the map for low points. (these are lower than all 2 adjacent values)
//  if it finds a low point, put the value+1 in a counter.
// counter= answer.

/*{
        if (heightMap[0][0] < heightMap[1][0] && heightMap[0][0] < heightMap[0][1]) {
        lowPointValues.add(heightMap[0][0]);
        }
        if (heightMap[0][heightMap.length] < heightMap[0][heightMap.length - 1] && heightMap[0][heightMap.length] < heightMap[1][heightMap.length]) {
        lowPointValues.add(heightMap[0][heightMap.length]);
        }
        if ((heightMap[heightMap.length-1][0] < heightMap[heightMap.length - 1][0] && heightMap[heightMap[0].length-1][0] < heightMap[heightMap[0].length-1][1])) {
        lowPointValues.add(heightMap[heightMap.length-1][0]);
        }
        if (heightMap[heightMap.length-1][heightMap[0].length-1] < heightMap[heightMap.length - 2][heightMap[0].length-1] && heightMap[heightMap.length-1][heightMap[0].length-1] < heightMap[heightMap.length-2][heightMap[0].length - 1]) {
        lowPointValues.add(heightMap[heightMap.length-1][heightMap[0].length-1]);
        }

        }

 */
