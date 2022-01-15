package DayNine;

import java.util.*;

public class Smoke2 {

    public static void main(String[] args) {
        Smoke1 smokeNew = new Smoke1();
        Smoke2 smoke = new Smoke2();
        smoke.printLowPointCoordsToHash();
        System.out.println(smoke.lowPoints);
        smoke.checkBasinSize(smokeNew.lowPointCoordArray, smokeNew.heightMap);


    }

    Smoke1 smoke1 = new Smoke1();
    Set<Point> lowPoints = new HashSet<>();
    Set<Point> seenPoints = new HashSet<>();
    Set<Integer> basinSizes = new HashSet<Integer>();


    public void printLowPointCoordsToHash() {
        for (int lowPointNum = 0; lowPointNum < smoke1.lowPointCoordArray.length; lowPointNum++) {
            lowPoints.add(new Point(smoke1.lowPointCoordArray[lowPointNum][0], smoke1.lowPointCoordArray[lowPointNum][1]));
        }
    }

    public void checkBasinSize(int[][] lowPointCoordArray, int[][] heightMap) { //todo
        Iterator<Point> i = lowPoints.iterator();
        while (i.hasNext()) {
            seenPoints.removeAll(seenPoints);
            int m = 1;
            Point point = i.next();
            seenPoints.add(point);
            Set<Point> seenThisIteration = new HashSet<>();
            Iterator<Point> j = seenThisIteration.iterator();
            boolean done = false;
            if (j.hasNext()) {
                done = false;
                point =j.next();
            }
            while (!done) {
                if ((point.x()) - m >= 0 && heightMap[point.y()][(point.x()) - m] != 9 && !seenPoints.contains(new Point((point.x()) - m, point.y()))) {
                    seenThisIteration.add(new Point((point.x()) - m, point.y()));
                    seenPoints.add(new Point((point.x()) - m, point.y()));

                }
                if ((point.x()) + m < smoke1.laatsteKolom && heightMap[(point.y())][point.x() + m] != 9 && !seenPoints.contains(new Point((point.x()) + m, point.y()))) {
                    seenThisIteration.add(new Point((point.x()) + m, point.y()));
                    seenPoints.add(new Point((point.x()) + m, point.y()));

                }
                if ((point.y()) - m >= 0 && heightMap[point.y() - m][(point.x())] != 9 && seenPoints.contains(new Point((point.x()), point.y() - m))) {
                    seenThisIteration.add(new Point((point.x()), point.y() - m));
                    seenPoints.add(new Point((point.x()), point.y() - m));

                }
                if ((point.y()) + m < smoke1.laatsteRij && heightMap[point.y() + m][(point.x())] != 9 && seenPoints.contains(new Point((point.x()) - m, point.y() + m))) {
                    seenThisIteration.add(new Point((point.x()) - m, point.y() + m));
                    seenPoints.add(new Point((point.x()) - m, point.y() + m));

                }


                if (seenThisIteration.size() == 0) {
                    done = true;
                    System.out.println(seenPoints.size());
                }
                seenThisIteration.removeAll(seenThisIteration);

            }

        }

    }


}


//check rechts
//check rij omhoog
//check rij omlaag






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
