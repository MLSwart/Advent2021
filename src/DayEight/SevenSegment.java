package DayEight;

public class SevenSegment {
    public static void main(String[] args) {
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.getCleanInput(sevenSegment.rawInput);
        sevenSegment.countEasyNumbers(sevenSegment.cleanInput);

    }

    String[] rawInput = {"be cfbegad cbdgef fgaecd cgeb fdcge agebfd fecdb fabcd edb", "fdgacbe cefdb cefbgd gcbe",
            "edbfga begcd cbg gc gcadebf fbgde acbgfd abcde gfcbed gfec", "fcgedb cgb dgebacf gc",
            "fgaebd cg bdaec gdafb agbcfd gdcbef bgcad gfac gcb cdgabef", "cg cg fdcagb cbg",
            "fbegcd cbd adcefb dageb afcb bc aefdc ecdab fgdeca fcdbega", "efabcd cedba gadfec cb",
            "aecbfdg fbg gf bafeg dbefa fcge gcbea fcaegb dgceab fcbdga", "gecf egdcabf bgf bfgea",
            "fgeab ca afcebg bdacfeg cfaedg gcfdb baec bfadeg bafgc acf", "gebdcfa ecba ca fadegcb",
            "dbcfg fgd bdegcaf fgec aegbdf ecdfab fbedc dacgb gdcebf gf", "cefg dcbef fcge gbcadfe",
            "bdfegc cbegaf gecbf dfcage bdacg ed bedf ced adcbefg gebcd", "ed bcgafe cdgba cbgef",
            "egadfb cdbfeg cegd fecab cgb gbdefca cg fgcdab egfdb bfceg", "gbdfcae bgc cg cgb",
            "gcafb gcf dcaebfg ecagb gf abcdeg gaef cafbge fdbac fegbdc", "fgae cfgab fg bagce"};

    String[] cleanInput = new String[(rawInput.length) / 2];

    public void getCleanInput(String[] rawInput) {
        int newPos = 0;
        for (int i = 1; i < rawInput.length; i = (i + 2)) {
            cleanInput[newPos] = rawInput[i];
            newPos++;
        }
    }

    public void countEasyNumbers(String[] cleanInput) {
        int counter = 0;
        for (int i = 0; i < cleanInput.length; i++) {
            String[] split = cleanInput[i].split(" ");
            for (int j = 0; j < split.length; j++) {
                int entryLength = split[j].length();
                if (entryLength == 2 || entryLength == 7) {
                    counter++;

                }
                if (entryLength == 3 || entryLength == 4) {
                    counter++;

                }


            }

        }
        System.out.println(counter);
    }




   /* public void countDigits(String[] cleanInput) {
        int numberOfDigits=0;
        for (int i = 0; i < cleanInput.length; i++) {
            cleanInput[i].split(" ");
            for (int j = 0; j < 5; j++) {
                if(cleanInput[i][j].c){
                    numberOfDigits++;
                }

            }

        }
    }

    /*
    select line
    divide line in entries
    count characters per entry
    add 1 to counter if number of characters in an entry is 1, 3, 4 or 7.
    */

}

