package DayTwo;

public class Dive1 {
    public static void main(String[] args) {
        String diveValues[] = {"forward 8", "down 9", "up 1", "forward 2", "down 6", "forward 6", "down 5", "down 4", "down 2", "forward 3", "forward 8", "down 6", "up 3", "up 3", "down 5", "up 8", "forward 8", "up 6", "forward 4", "down 8", "up 2", "up 6", "forward 7", "up 6", "down 6", "down 1", "forward 8", "up 7", "forward 9", "forward 5", "forward 8", "forward 5", "down 3", "forward 5", "up 1", "forward 6", "forward 3", "forward 3", "down 2", "forward 4", "down 3", "forward 6", "forward 2", "forward 1", "down 2", "forward 1", "down 1", "up 8", "down 4", "forward 3", "up 3", "down 5", "down 2", "forward 7", "forward 1", "down 9", "up 1", "down 1", "forward 2", "forward 1", "forward 1", "forward 7", "up 5", "forward 2", "down 6", "down 7", "down 3", "down 1", "forward 4", "forward 5", "down 3", "forward 4", "down 5", "forward 3", "forward 4", "forward 2", "up 8", "down 7", "up 3", "forward 2", "down 5", "forward 9", "forward 5", "up 1", "down 5", "down 6", "forward 2", "forward 5", "down 6", "down 1", "up 8", "up 9", "down 7", "down 5", "forward 2", "forward 7", "forward 7", "up 6", "down 4", "up 6", "forward 2", "down 4", "down 3", "down 4", "forward 2", "down 2", "down 1", "down 4", "up 4", "forward 7", "forward 6", "forward 2", "forward 5", "forward 1", "forward 7", "forward 2", "down 3", "forward 7", "forward 2", "up 4", "up 5", "down 1", "down 2", "down 3", "down 7", "up 8", "forward 4", "down 5", "down 4", "forward 3", "down 6", "forward 5", "up 5", "forward 6", "down 1", "down 7", "forward 1", "forward 6", "up 9", "forward 2", "down 1", "forward 5", "forward 2", "forward 6", "forward 8", "forward 6", "down 8", "forward 3", "down 9", "up 8", "forward 9", "down 7", "down 6", "down 1", "up 5", "down 6", "forward 7", "up 9", "forward 8", "forward 3", "forward 3", "forward 2", "down 6", "up 1", "up 5", "forward 7", "down 2", "down 5", "down 1", "down 4", "forward 8", "forward 2", "forward 8", "up 5", "forward 7", "up 7", "forward 6", "forward 9", "up 1", "down 4", "forward 8", "forward 4", "down 9", "up 6", "down 8", "up 9", "down 2", "down 2", "down 9", "up 3", "down 7", "down 2", "up 9", "forward 9", "down 5", "forward 2", "forward 1", "forward 2", "down 4", "forward 4", "down 2", "forward 8", "up 3", "forward 6", "up 7", "up 9", "forward 4", "up 9", "down 5", "forward 5", "up 6", "down 2", "down 4", "forward 1", "down 2", "forward 3", "down 7", "down 1", "down 5", "forward 5", "up 5", "forward 3", "down 5", "forward 7", "down 3", "down 2", "up 9", "down 4", "forward 4", "down 4", "forward 1", "up 9", "down 8", "forward 2", "down 7", "forward 8", "down 5", "up 2", "down 9", "down 2", "up 4", "up 2", "forward 8", "forward 3", "forward 4", "down 1", "down 3", "forward 3", "down 8", "forward 7", "down 7", "forward 5", "forward 5", "up 3", "down 6", "forward 1", "down 4", "forward 2", "down 4", "up 2", "down 3", "forward 4", "forward 6", "up 7", "down 3", "forward 7", "forward 1", "down 1", "up 3", "down 7", "up 3", "up 8", "up 7", "up 7", "forward 7", "down 2", "forward 6", "forward 7", "up 3", "down 3", "up 9", "down 6", "down 7", "down 7", "up 5", "forward 6", "forward 2", "up 9", "forward 2", "down 3", "down 3", "forward 5", "forward 3", "forward 6", "forward 6", "down 7", "forward 2", "down 3", "up 4", "forward 1", "forward 5", "down 5", "up 1", "down 9", "forward 3", "up 6", "forward 5", "down 4", "forward 9", "up 5", "forward 7", "up 7", "forward 9", "forward 2", "forward 6", "forward 3", "forward 3", "up 7", "down 1", "down 1", "forward 1", "down 8", "down 2", "forward 4", "up 7", "forward 7", "down 5", "down 7", "up 6", "down 4", "forward 4", "forward 4", "up 7", "down 9", "forward 6", "forward 1", "down 7", "forward 5", "forward 2", "forward 1", "up 7", "down 9", "forward 2", "down 7", "up 8", "forward 1", "forward 4", "up 4", "forward 1", "down 9", "down 5", "down 8", "forward 8", "forward 8", "down 8", "down 3", "down 5", "down 6", "up 9", "forward 1", "down 1", "forward 1", "forward 1", "down 6", "forward 3", "down 1", "forward 9", "forward 3", "up 7", "down 9", "forward 5", "down 4", "up 9", "down 2", "down 5", "down 6", "forward 1", "up 2", "forward 9", "up 7", "forward 2", "forward 8", "down 5", "down 6", "down 8", "forward 4", "down 4", "forward 9", "forward 3", "forward 6", "forward 9", "up 2", "down 8", "up 2", "up 6", "up 5", "down 5", "down 7", "forward 1", "up 6", "forward 9", "up 4", "forward 4", "up 2", "forward 3", "down 8", "down 1", "up 5", "forward 5", "down 3", "down 4", "down 1", "forward 3", "up 2", "forward 3", "down 1", "forward 8", "up 3", "forward 4", "down 3", "forward 6", "down 9", "down 7", "forward 3", "forward 5", "forward 1", "forward 3", "up 8", "forward 2", "forward 2", "forward 7", "up 9", "forward 4", "down 1", "down 6", "forward 8", "forward 5", "up 4", "up 5", "up 9", "forward 9", "up 8", "down 3", "up 5", "forward 1", "forward 5", "up 9", "forward 8", "forward 4", "forward 3", "forward 1", "forward 6", "down 2", "up 8", "down 7", "down 1", "down 5", "up 1", "forward 9", "down 2", "down 4", "forward 3", "forward 1", "down 7", "up 9", "up 7", "down 2", "down 4", "down 1", "forward 9", "up 4", "down 9", "down 9", "down 4", "down 9", "forward 1", "down 2", "forward 8", "up 4", "up 3", "forward 4", "down 5", "forward 8", "forward 2", "forward 4", "up 3", "up 2", "up 3", "forward 4", "forward 4", "forward 6", "down 7", "down 8", "up 3", "down 9", "down 5", "up 7", "up 1", "down 3", "down 4", "up 5", "up 9", "down 2", "up 8", "forward 9", "down 3", "forward 4", "down 5", "down 1", "forward 9", "forward 2", "up 3", "down 9", "down 8", "up 7", "forward 2", "down 9", "up 8", "up 2", "down 3", "forward 3", "forward 3", "forward 3", "forward 4", "down 7", "up 2", "forward 3", "forward 7", "forward 5", "forward 7", "down 6", "down 9", "down 6", "down 8", "up 4", "down 4", "down 2", "up 1", "down 3", "forward 7", "forward 5", "down 7", "forward 1", "up 7", "forward 9", "down 8", "down 1", "down 3", "down 1", "up 8", "forward 7", "up 5", "forward 6", "down 1", "down 8", "up 1", "up 9", "forward 7", "down 9", "forward 3", "forward 8", "forward 7", "down 3", "down 5", "up 3", "up 7", "up 3", "up 6", "up 8", "down 3", "forward 7", "down 7", "forward 9", "up 9", "down 1", "down 3", "down 8", "down 6", "forward 1", "up 6", "down 1", "up 4", "down 2", "forward 9", "up 8", "up 2", "down 6", "down 1", "forward 2", "forward 6", "forward 1", "forward 2", "up 6", "down 7", "down 8", "forward 9", "up 2", "down 6", "down 8", "down 5", "up 6", "forward 6", "down 5", "forward 4", "forward 2", "down 1", "down 4", "up 5", "down 5", "down 1", "down 9", "down 1", "down 1", "forward 1", "forward 5", "up 4", "down 5", "down 3", "down 2", "down 7", "forward 5", "forward 6", "forward 2", "up 9", "up 3", "forward 6", "down 4", "forward 8", "forward 4", "forward 9", "down 6", "down 9", "down 1", "forward 6", "down 8", "down 7", "forward 5", "down 4", "forward 5", "forward 5", "up 3", "down 1", "down 4", "forward 1", "forward 7", "down 5", "down 4", "forward 7", "forward 3", "forward 4", "down 4", "forward 8", "up 2", "up 6", "down 9", "up 1", "down 8", "up 2", "up 6", "forward 5", "forward 7", "up 4", "down 4", "down 8", "forward 5", "up 4", "down 6", "forward 9", "up 4", "forward 7", "up 7", "down 3", "down 2", "down 2", "down 6", "down 4", "forward 4", "down 3", "down 4", "down 4", "down 8", "up 2", "down 3", "forward 5", "forward 5", "up 5", "forward 1", "down 7", "forward 5", "forward 7", "forward 9", "forward 4", "down 1", "down 1", "up 5", "down 6", "down 8", "down 9", "down 9", "forward 7", "down 6", "forward 3", "down 7", "up 3", "forward 5", "forward 5", "up 6", "down 5", "down 8", "down 5", "down 1", "down 7", "forward 8", "up 9", "forward 2", "up 1", "down 9", "down 2", "forward 7", "up 1", "down 5", "forward 3", "up 6", "forward 9", "up 9", "down 3", "forward 2", "up 6", "down 6", "up 8", "down 3", "up 5", "forward 9", "up 3", "forward 4", "forward 6", "down 3", "forward 4", "down 5", "down 7", "down 7", "forward 9", "forward 6", "down 9", "up 1", "forward 2", "down 8", "down 7", "up 7", "forward 6", "up 5", "down 6", "forward 6", "down 3", "forward 2", "down 7", "forward 2", "down 3", "down 8", "forward 4", "up 8", "forward 7", "down 4", "forward 3", "down 3", "forward 6", "down 7", "down 7", "forward 8", "forward 9", "down 8", "down 4", "forward 5", "down 1", "forward 9", "down 7", "up 3", "down 6", "down 4", "down 9", "forward 3", "down 1", "forward 1", "down 5", "forward 1", "forward 9", "down 9", "forward 5", "down 1", "up 9", "down 3", "down 2", "up 6", "forward 4", "down 6", "down 2", "forward 5", "up 8", "down 7", "up 6", "down 1", "forward 3", "forward 4", "down 9", "down 2", "forward 5", "forward 8", "up 2", "forward 9", "up 5", "down 1", "forward 1", "forward 6", "forward 9", "forward 2", "down 8", "forward 1", "up 8", "forward 1", "forward 8", "up 5", "forward 3", "down 4", "up 8", "down 6", "up 1", "forward 2", "forward 4", "up 6", "forward 1", "forward 4", "up 6", "down 8", "up 7", "forward 5", "up 7", "down 9", "down 2", "up 5", "forward 2", "down 7", "forward 1", "forward 1", "forward 3", "down 6", "forward 7", "up 2", "up 1", "forward 1", "up 5", "down 1", "forward 7", "up 9", "forward 7", "down 6", "up 4", "down 5", "up 2", "down 4", "up 3", "down 6", "down 7", "down 7", "up 1", "forward 4", "forward 1", "up 2", "down 7", "down 5", "forward 7", "forward 5", "forward 2", "down 4", "down 6", "down 8", "forward 9", "forward 8", "up 9", "forward 6", "down 6", "down 6", "down 8", "up 5", "forward 6", "down 6", "forward 5", "down 4", "down 6", "down 2", "up 3", "forward 1", "forward 8", "down 2", "forward 9", "forward 7", "forward 8", "forward 1", "down 8", "forward 1", "down 1", "forward 6", "forward 4", "forward 5", "up 9", "up 1", "down 7", "up 8", "down 5", "down 2", "forward 9", "up 2", "forward 6", "down 7", "down 7", "down 2", "down 6", "down 7", "forward 9", "up 2", "down 6", "forward 8", "forward 1", "down 3", "down 2", "forward 3", "forward 7", "down 3", "down 1", "down 4", "down 9", "forward 1", "down 6", "down 8", "down 4", "down 5", "down 5", "up 9", "forward 7", "down 9", "up 3", "up 5", "up 1", "forward 2", "forward 9", "down 3", "forward 1", "up 3", "forward 6", "up 2", "forward 7", "forward 5", "forward 8", "forward 7", "forward 8", "down 5", "up 3", "forward 5", "forward 8", "forward 1", "forward 5", "forward 7", "forward 2", "down 6", "down 6", "down 6", "down 2", "down 2", "up 1", "down 1", "forward 5", "forward 7", "down 4", "forward 4", "up 1", "forward 7", "forward 8", "down 5", "down 2", "down 2", "down 5", "forward 3", "forward 7", "down 5", "forward 2", "forward 8", "down 3", "forward 6", "up 1", "forward 7", "forward 4", "forward 1", "forward 9", "forward 2", "down 1", "down 1", "down 8", "forward 4", "down 6", "forward 7", "forward 2" };
        int timesForward = 0;
        int timesDown = 0;
        int timesUp = 0;

        for (int i = 0; i < diveValues.length; i++) {
            if (diveValues[i].contains("forward")) {
                timesForward++;
            }
            if (diveValues[i].contains("down")) {
                timesDown++;
            }
            if (diveValues[i].contains("up")) {
                timesUp++;
            }

        }

        String forwardValues[] = new String[timesForward];
        String downValues[] = new String[timesDown];
        String upValues[] = new String[timesUp];
        int forwardArrayPosition = 0;
        int downArrayPosition = 0;
        int upArrayPosition = 0;

        for (int x = 0; x < diveValues.length - 1; x++) {
            if (diveValues[x].contains("forward")) {
                forwardValues[forwardArrayPosition] = diveValues[x];
                forwardArrayPosition++;
            }
            if (diveValues[x].contains("down")) {
                downValues[downArrayPosition] = diveValues[x];
                downArrayPosition++;
            }
            if (diveValues[x].contains("up")) {
                upValues[upArrayPosition] = diveValues[x];
                upArrayPosition++;
            }
        }

        int numbersInForwardValues[] = new int[forwardValues.length];
        int numbersInDownValues[] = new int[downValues.length];
        int numbersInUpValues[] = new int[upValues.length];

        int totalForward = 0;
        int totalDown= 0;
        int totalUp= 0;

        for (int y = 0; y < timesForward-1; y++) {
            String numericalForwardValues = forwardValues[y].replace("forward ", "");
            forwardValues[y] = numericalForwardValues;
            int forwardNumber = Integer.parseInt(forwardValues[y]);
            numbersInForwardValues[y] = forwardNumber;
            totalForward = totalForward+forwardNumber;
        }

        for (int z = 0; z < timesDown-1; z++) {
            String numericalDownValues = downValues[z].replace("down ", "");
            downValues[z] = numericalDownValues;
            int downNumber = Integer.parseInt(downValues[z]);
            numbersInDownValues[z] = downNumber;
            totalDown = totalDown+downNumber;
        }
        for (int q = 0; q < timesUp-1; q++) {
            String numericalUpValues = upValues[q].replace("up ", "");
            upValues[q] = numericalUpValues;
            int upNumber = Integer.parseInt((upValues[q]));
            numbersInUpValues[q] = upNumber;
            totalUp = totalUp+upNumber;


        }


        System.out.println("Times forward: " + timesForward);
        System.out.println("Times down: " + timesDown);
        System.out.println("Times up: " + timesUp);

        System.out.println("Forward total: " + totalForward);
        System.out.println("(Down total: " + totalDown);
        System.out.println("Up total: " + totalUp + " )");
        System.out.println("Depth: " + (totalDown-totalUp));

        System.out.println("Forward times depth = " + (totalForward*(totalDown-totalUp)));

    }


}
