package DayFour;

public class Bingo1 {
    public static void main(String[] args) {
        arrayChecks arrayChecks = new arrayChecks();

        arrayChecks.vervangDoorNull();

    }
    int[][][] boards = {{{22, 13, 17, 11, 0},
            {8, 2, 23, 4, 24},
            {21, 9, 14, 16, 7},
            {6, 10, 3, 18, 5},
            {1, 12, 20, 15, 19}},

            {{3, 15, 0, 2, 22},
                    {9, 18, 13, 17, 5},
                    {19, 8, 7, 25, 23},
                    {20, 11, 10, 24, 4},
                    {14, 21, 16, 12, 6}},

            {{14, 21, 17, 24, 4},
                    {10, 16, 15, 9, 19},
                    {18, 8, 23, 26, 20},
                    {22, 11, 13, 6, 5},
                    {2, 0, 12, 3, 7}}};


    int[] getrokkenGetallen = {7, 4, 9, 5, 11, 17, 23, 2, 0, 14, 21, 24, 10, 16, 13, 6, 15, 25, 12, 22, 18, 20, 8, 19, 3, 26, 1};



    public class arrayChecks {
        public void vervangDoorNull() {
            int d = 0;
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 5; b++) {
                    for (int c = 0; c < 5; c++) {
                        if (boards[a][b][c] == getrokkenGetallen[d]) {
                            boards[a][b][c] = Integer.parseInt(null);

                        }
                    }
                }
            }
        }

        public boolean alEenRijVolX() {
            return false;
        }

        public boolean alEenKolomVolX() {
            return false;
        }
    }
}


/*Dus ik heb een functie nodig die controleert of een getal voorkomt in de arrays. (Nee? Opnieuw met volgende getal).
Dan heb ik een functie nodig die elke occurrence van het getal vervangt door x.
Dan heb ik een functie nodig die kijkt of er al een array is met een horizontale rij helemaal bestaand uit x'en. Zo ja: bewaar bord.
Dan een functie die kijkt of er een array is waarvan alle pos1, pos2, pos 3 enz. bestaan uit x'en. Zo ja: bewaar bord.
Is er 1 bord bewaard: winnaar
Zijn er meerdere bewaard: gelijkspel.
Zijn er geen? Nog eens.

"Dat moet wel lukken.  Enige functie waar ik me een beetje vragen bij stel of ze handig te gebruiken is is:   check_x(pos1, pos2, pos3, ....).
Dan denk ik dat je beter een functie maakt: checkrow() en check_col()."
 */
