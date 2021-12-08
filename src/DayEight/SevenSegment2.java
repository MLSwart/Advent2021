package DayEight;

import java.util.Arrays;

public class SevenSegment2 {
    public static void main(String[] args) {
        SevenSegment2 sevenSegment = new SevenSegment2();
        sevenSegment.getCleanInputKeys(sevenSegment.rawInput);
        sevenSegment.determineLetterDistribution(sevenSegment.cleanInputKeys);
        sevenSegment.determineLetterDistribution(sevenSegment.cleanInputKeys);


        /*
        Neem inputKeys[1].
        Zet deze code op alfabetische volgorde in een array.
        is array.length 2, 3, 4 of 7? enz.

         */

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

    String[] cleanInputKeys = new String[(rawInput.length) / 2];
    String[] cleanInputCodes = new String[(rawInput.length) / 2];

    public void getCleanInputCodes(String[] rawInput) {
        int newPos = 0;
        for (int i = 1; i < rawInput.length; i = (i + 2)) {
            cleanInputCodes[newPos] = rawInput[i];
            newPos++;
        }

    }

    public void getCleanInputKeys(String[] rawInput) {
        int newPos = 0;
        for (int i = 0; i < rawInput.length; i = (i + 2)) {
            cleanInputKeys[newPos] = rawInput[i];
            newPos++;
        }

    }

    public void alphabetize(String[] cleanInput) {
        for (int k = 0; k < cleanInput.length; k++) {
            String[] inputSplit = cleanInput[k].split(" ");
            inputSplit.toString();
            for (int m = 0; m < inputSplit.length; m++) {
                String[] letterSplit = inputSplit[m].split("");
                Arrays.sort(letterSplit);
                letterSplit.toString();
            }
        }

    }

    public void determineLetterDistribution(String[] cleanInput) {
        for (int i = 0; i < cleanInput.length; i++) {
            String removeCommas = cleanInput[i].replace(" ", "");
            String[] individualLetters = removeCommas.split("");
            Arrays.sort(individualLetters);
            int[] nums = new int[7];
            for (int k = 0; k < individualLetters.length; k++) {

                if (individualLetters[k] == "a") {
                    nums[0]++;
                }
                if (individualLetters[k] == "b") {
                    nums[1]++;
                }
                if (individualLetters[k] == "c") {
                    nums[2]++;
                }
                if (individualLetters[k] == "d") {
                    nums[3]++;
                }
                if (individualLetters[k] == "e") {
                    nums[4]++;
                }
                if (individualLetters[k] == "f") {
                    nums[5]++;
                }
                if (individualLetters[k] == "g") {
                    nums[6]++;
                }

            }
            System.out.println("A's : " + nums[0]);
        }


    }

}






/*
#7       3 segments
#8       7 segments
#1       2 segments
#4       4 segments
#3       5 segments, 2 in common with 1
#2       5 segments, 3 in common with 4
#5       5 segments, 2 in common with 4
#9       6 segments, 4 in common with 4
#6       6 segments, 1 in common with 1
#0       6 segments, 3 in common with 4 and 2 in common with 1
 */

/*
for (int k = 0; k < cleanInputKeys.length; k++) {
            char tempcleanInputKeys[]= cleanInputKeys[k].toCharArray();
            Arrays.sort(tempcleanInputKeys);
            tempcleanInputKeys.toString();
            cleanInputKeys[k]=tempcleanInputKeys;
        }
 */