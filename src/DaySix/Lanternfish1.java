package DaySix;

public class Lanternfish1 {
    public static void main(String[] args) {
        Lanternfish1 fish = new Lanternfish1();
        fish.run();
    }

    void run() {
        int cat0 = 0;
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        int cat6 = 0;
        int cat7 = 0;
        int cat8 = 0;
        int input[] = {1,2,1,1,1,1,1,1,2,1,3,1,1,1,1,3,1,1,1,5,1,1,1,4,5,1,1,1,3,4,1,1,1,1,1,1,1,5,1,4,1,1,1,1,1,1,1,5,1,3,1,3,1,1,1,5,1,1,1,1,1,5,4,1,2,4,4,1,1,1,1,1,5,1,1,1,1,1,5,4,3,1,1,1,1,1,1,1,5,1,3,1,4,1,1,3,1,1,1,1,1,1,2,1,4,1,3,1,1,1,1,1,5,1,1,1,2,1,1,1,1,2,1,1,1,1,4,1,3,1,1,1,1,1,1,1,1,5,1,1,4,1,1,1,1,1,3,1,3,3,1,1,1,2,1,1,1,1,1,1,1,1,1,5,1,1,1,1,5,1,1,1,1,2,1,1,1,4,1,1,1,2,3,1,1,1,1,1,1,1,1,2,1,1,1,2,3,1,2,1,1,5,4,1,1,2,1,1,1,3,1,4,1,1,1,1,3,1,2,5,1,1,1,5,1,1,1,1,1,4,1,1,4,1,1,1,2,2,2,2,4,3,1,1,3,1,1,1,1,1,1,2,2,1,1,4,2,1,4,1,1,1,1,1,5,1,1,4,2,1,1,2,5,4,2,1,1,1,1,4,2,3,5,2,1,5,1,3,1,1,5,1,1,4,5,1,1,1,1,4};
        int numberOfDays = 80;
        Lanternfish1 fish2 = new Lanternfish1();


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


        //divideInput(input, cat0, cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8);

        System.out.println(cat0 + " , " + cat1 + " , " + cat2 + " , " + cat3 + " , " + cat4 + " , " + cat5 + " , " + cat6 + " , " + cat7 + " , " + cat8);
        for(int i=0; i<numberOfDays; i++){
            int catReserve = 0;
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

            int numberOfFish = cat0 + cat1 + cat2 + cat3 + cat4 + cat5 + cat6 + cat7 + cat8;
            System.out.println(numberOfFish);

        }




        //for(int i=0; i<numberOfDays; i++){
        //    moveFish(cat0, cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8);
        //}


    }





    /*    public void divideInput(int[] input, int cat0, int cat1, int cat2, int cat3, int cat4, int cat5, int cat6, int cat7, int cat8) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] < 5) {
                    if (input[i] == 0) {
                        cat0++;

                    } else if (input[i] == 1) {
                        cat1++;

                    } else if (input[i] == 2) {
                        cat2++;

                    } else if (input[i] == 3) {
                        cat3++;

                    } else if (input[i] == 4) {
                        cat4++;

                    }
                } else if (input[i] >= 5) {
                    if (input[i] == 5) {
                        cat5++;

                    } else if (input[i] == 6) {
                        cat6++;

                    } else if (input[i] == 7) {
                        cat7++;

                    } else if (input[i] == 8) {
                        cat8++;

                    }

                }

            }
        }

     */

   /* public void moveFish(int cat0, int cat1, int cat2, int cat3, int cat4, int cat5, int cat6, int cat7, int cat8) {
        int catReserve = 0;
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

        int numberOfFish = cat0 + cat1 + cat2 + cat3 + cat4 + cat5 + cat6 + cat7 + cat8;
        System.out.println(numberOfFish);

    }

    */

    public void fishCount(int cat0, int cat1, int cat2, int cat3, int cat4, int cat5, int cat6, int cat7, int cat8) {
        int numberOfFish = cat0 + cat1 + cat2 + cat3 + cat4 + cat5 + cat6 + cat7 + cat8;
        System.out.println(numberOfFish);

    }
}

/*
Wat ik wil doen:
-Maak 8 categorieën: cat0 (0 dagen over), cat1 (1 dag over), cat2 enz.
-Zet de aantallen vissen in de categorie van het aantal dagen.
-Per dag verhuist de hoeveelheid vissen naar de volgende categorie. Uit cat0 verhuizen de vissen naar cat6.
-Zoveel vissen als verhuizen vanuit cat0 naar cat6 komen erbij in cat8.
-Tel de categoriën bij elkaar op.
 */
