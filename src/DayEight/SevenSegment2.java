package DayEight;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;

public class SevenSegment2 {
    public static void main(String[] args) {
        SevenSegment2 sevenSegment = new SevenSegment2();
        sevenSegment.getCleanInputKeys(sevenSegment.rawInput);
        int[] distribution = sevenSegment.findDistribution(sevenSegment.cleanInputKeys[1]);
        HashMap<Character, Character> sleutel = new HashMap<Character, Character>(); //de cijfers die we al weten. We moeten eigenlijk alleen de 4 weten om de rest te beredeneren.
        sevenSegment.findEncodedFour(sevenSegment.cleanInputKeys);



        //for (int n = 0; n < sevenSegment.cleanInputCodes.length; n++) {
        //    if (distribution[n].equals("ABCEFG")) {
        //        sleutel.put("0");
        //    }
        //}
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
    char A = 0;
    char B = 0;
    char C = 0;
    char D = 0;
    char E = 0;
    char F = 0;

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

    public int[] findDistribution(String cleanInput) {
        String removeCommas = cleanInput.replace(" ", "");
        String[] individualLetters = removeCommas.split("");
        Arrays.sort(individualLetters);
        int[] distribution = new int[7];

        for (int k = 0; k < individualLetters.length; k++) {

            if (individualLetters[k].equals("a")) {
                distribution[0]++;
            }
            if (individualLetters[k].equals("b")) {
                distribution[1]++;
            }
            if (individualLetters[k].equals("c")) {
                distribution[2]++;
            }
            if (individualLetters[k].equals("d")) {
                distribution[3]++;
            }
            if (individualLetters[k].equals("e")) {
                distribution[4]++;
            }
            if (individualLetters[k].equals("f")) {
                distribution[5]++;
            }
            if (individualLetters[k].equals("g")) {
                distribution[6]++;
            }

        }


        return distribution;
    }

    public String findEncodedFour(String[] inputKeys) {

        for (int i = 0; i < inputKeys.length; i++) {
            if (inputKeys[i].length() == 4) {
                return inputKeys[i];
            }
        }
        return null;
    }

    public void findEasySegments(int[] distribution, HashMap<Character, Character> sleutel) {
        for (int j = 0; j < distribution.length; j++) {
            if (distribution[j] == 6) {
                sleutel.put((char) (j + 97), 'B');
            }
            if (distribution[j] == 4) {
                sleutel.put((char) (j + 97), 'E');
            }
            if (distribution[j] == 9) {
                sleutel.put((char) (j + 97), 'F');

            }
        }
    }

    public void findHardSegments(int[] distribution, HashMap<Character, Character> sleutel, String encodedFour) {
        for (int k = 0; k < distribution.length; k++) {
            if (distribution[k] == 7) {
                if (encodedFour.indexOf((char) (k + 97)) >= 0) {
                    sleutel.put((char) (k + 97), 'D');
                } else {
                    sleutel.put((char) (k + 97), 'G');
                }
            }
            if (distribution[k] == 8){
                if (encodedFour.indexOf((char) (k + 97)) >= 0) {
                    sleutel.put((char) (k + 97), 'C');
                } else {
                    sleutel.put((char) (k + 97), 'A');
                }

            }
        }
    }
}

//
//
//
//C = find_segment_by_frequency_in("xxxx", 8) # find in "4"
//D = find_segment_by_frequency_in("xxxx", 7) # find in "4"
//A = find_segment_by_frequency_not_in(C, 8)
//G = find_segment_by_frequency_not_in(D, 8)

// HashMap<String,String> findEasy= new HashMap<String, String>();
// HashMap<int[],String> findEasy= new HashMap<int[], String>();

//HashMap<Integer[], String> findEasy= new HashMap<Integer[], String>(distribution[0]);
//        findEasy.put(6, "B");
//        findEasy.put(4, "E");
//        findEasy.put(9, "F");


//for (int x=0; x< distribution.length; x++){
//    if(distribution[x][1]==6){
//        B=[x][0];

//# 8a, 6b, 8c, 7d, 4e, 9f, 7g
//0= ABCEFG
//1=CF
//2=ACDEG
//3=ACDFG
//4=BCDF
//5=ABDFG
//6=ABDEFG
//7=ACF
//8=ABCDEFG
//9=ABCDFG
// return distribution;

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