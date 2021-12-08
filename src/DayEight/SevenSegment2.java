package DayEight;

import java.util.Arrays;

public class SevenSegment2 {
    public static void main(String[] args) {
        SevenSegment2 sevenSegment = new SevenSegment2();
        sevenSegment.getCleanInput(sevenSegment.rawInput);
        sevenSegment.determineEasyNumbers(sevenSegment.cleanInput);

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

       /* for (int k = 0; k < cleanInput.length; k++) {
            char tempCleanInput[]= cleanInput[k].toCharArray();
            Arrays.sort(tempCleanInput);
            tempCleanInput.toString();
            cleanInput[k]=tempCleanInput;
        }

        */
    }

    public void determineEasyNumbers(String[] cleanInput) {
        int counter = 0;
        for (int i = 0; i < cleanInput.length; i++) {
            String[] split = cleanInput[i].split(" ");
            for (int j = 0; j < split.length; j++) {
                int entryLength = split[j].length();
                if (entryLength == 2) {
                    System.out.println("serie nummer " + (i + 1) + ", 1 is code " + split[j]);
                }
                if (entryLength == 3) {
                    System.out.println("serie nummer " + (i + 1) + ", 7 is code " + split[j]);

                }
                if (entryLength == 4) {
                    System.out.println("serie nummer " + (i + 1) + ", 4 is code " + split[j]);
                }
                if (entryLength == 7) {
                    System.out.println("serie nummer " + (i + 1) + ", 8 is code " + split[j]);
                }


            }

        }
    }
}
