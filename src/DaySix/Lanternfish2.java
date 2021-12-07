package DaySix;

public class Lanternfish2 {

    public static void main(String[] args) {
        Lanternfish2 fish = new Lanternfish2();
        fish.run();
    }

    void run() {
        long cat0 = 0;
        long cat1 = 0;
        long cat2 = 0;
        long cat3 = 0;
        long cat4 = 0;
        long cat5 = 0;
        long cat6 = 0;
        long cat7 = 0;
        long cat8 = 0;
        int input[] = {1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 3, 1, 1, 1, 1, 3, 1, 1, 1, 5, 1, 1, 1, 4, 5, 1, 1, 1, 3, 4, 1, 1, 1, 1, 1, 1, 1, 5, 1, 4, 1, 1, 1, 1, 1, 1, 1, 5, 1, 3, 1, 3, 1, 1, 1, 5, 1, 1, 1, 1, 1, 5, 4, 1, 2, 4, 4, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 5, 4, 3, 1, 1, 1, 1, 1, 1, 1, 5, 1, 3, 1, 4, 1, 1, 3, 1, 1, 1, 1, 1, 1, 2, 1, 4, 1, 3, 1, 1, 1, 1, 1, 5, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 4, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 4, 1, 1, 1, 1, 1, 3, 1, 3, 3, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 5, 1, 1, 1, 1, 2, 1, 1, 1, 4, 1, 1, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 3, 1, 2, 1, 1, 5, 4, 1, 1, 2, 1, 1, 1, 3, 1, 4, 1, 1, 1, 1, 3, 1, 2, 5, 1, 1, 1, 5, 1, 1, 1, 1, 1, 4, 1, 1, 4, 1, 1, 1, 2, 2, 2, 2, 4, 3, 1, 1, 3, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 4, 2, 1, 4, 1, 1, 1, 1, 1, 5, 1, 1, 4, 2, 1, 1, 2, 5, 4, 2, 1, 1, 1, 1, 4, 2, 3, 5, 2, 1, 5, 1, 3, 1, 1, 5, 1, 1, 4, 5, 1, 1, 1, 1, 4};
        int numberOfDays = 256;
        long numberOfFish = 0;

        for (int x = 0; x < input.length; x++) {
            if (input[x] < 5) {
                if (input[x] == 0) {
                    cat0++;

                } else if (input[x] == 1) {
                    cat1++;

                } else if (input[x] == 2) {
                    cat2++;

                } else if (input[x] == 3) {
                    cat3++;

                } else if (input[x] == 4) {
                    cat4++;

                }
            } else if (input[x] >= 5) {
                if (input[x] == 5) {
                    cat5++;

                } else if (input[x] == 6) {
                    cat6++;

                } else if (input[x] == 7) {
                    cat7++;

                } else if (input[x] == 8) {
                    cat8++;

                }

            }


        }
        for (int i = 0; i < numberOfDays; i++) {
            long catReserve = 0;
            catReserve = cat0;
            cat0 = cat1;
            cat1 = cat2;
            cat2 = cat3;
            cat3 = cat4;
            cat4 = cat5;
            cat5 = cat6;
            cat6 = cat7 + catReserve;
            cat7 = cat8;
            cat8 = catReserve;

            numberOfFish = cat0 + cat1 + cat2 + cat3 + cat4 + cat5 + cat6 + cat7 + cat8;
        }
        System.out.println(numberOfFish);
    }

}
