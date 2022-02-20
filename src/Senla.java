import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Senla {

    public int first_task(String str) {
        int sum = 0;
        for (char tmp : str.toCharArray()) {
            if (tmp >= '0' && tmp <= '9') {
                sum += tmp - 48;
            }
        }
        return sum;
    }

    public void second_task(int number) {
        int tmp = 2;
        int numberTmp = number;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        while (tmp <= (number / 2) + 1) {
            if (numberTmp % tmp != 0) {
                tmp += 1;
                continue;
            }
            numberTmp /= tmp;
            primeNumbers.add(tmp);
        }
        if (primeNumbers.isEmpty()) {
            primeNumbers.add(number);
        }
        System.out.println(primeNumbers);
    }


    public void third_task(String str) {
        int sum_all_vowels = 0;
        ArrayList<Integer> vowelsInWords = new ArrayList<>();
        String rightLetters = "аоэеиыуёюяАОЭУИЫУЁЮЯ";
        ArrayList<String> rightWords = new ArrayList<>();
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuilder rightWord = new StringBuilder();
//            System.out.println(word);
            int sum_vowels = 0;
            for (char letter : word.toCharArray()) {
                if (letter >= 'А' && letter <= 'я') {

                    if (rightLetters.indexOf(letter) >= 0) {
                        sum_all_vowels += 1;
                        if (sum_vowels == 0) {
                            letter -= 32;
                        }
                        sum_vowels += 1;
                    }
                    rightWord.append(letter);
                }
            }
            vowelsInWords.add(sum_vowels);
            rightWords.add(rightWord.toString());
//            System.out.println(right_word+" new");
        }

        for (int i = 0; i < vowelsInWords.size() - 1; i++) {
            for (int j = i + 1; j < vowelsInWords.size(); j++) {
                if (vowelsInWords.get(i) < vowelsInWords.get(j)) {

                    int tmp = vowelsInWords.get(i);
                    vowelsInWords.set(i, vowelsInWords.get(j));
                    vowelsInWords.set(j, tmp);

                    String strTmp = rightWords.get(i);
                    rightWords.set(i, rightWords.get(j));
                    rightWords.set(j, strTmp);
                }
            }
        }
        System.out.println(sum_all_vowels);
        System.out.println(vowelsInWords);
        System.out.println(rightWords);

    }

    public void fourth_task() {
        int[][] one = {  {0,0,0,1,0,0},
                         {0,0,1,1,0,0},
                         {0,1,0,1,0,0},
                         {0,0,0,1,0,0},
                         {0,0,0,1,0,0},
                         {0,0,0,1,0,0},
                         {0,0,1,1,1,0}};
        int[][] two = {  {2,2,2,2,2,0},
                         {1,0,0,0,2,0},
                         {0,0,0,0,2,0},
                         {2,2,2,2,2,0},
                         {2,0,0,0,0,0},
                         {2,0,0,0,0,0},
                         {2,2,2,2,2,0}};
        int[][] three = {{3,3,3,3,3,0},
                         {0,0,0,0,3,0},
                         {0,0,0,0,3,0},
                         {3,3,3,3,3,0},
                         {0,0,0,0,3,0},
                         {0,0,0,0,3,0},
                         {3,3,3,3,3,0}};
        int[][] four = { {4,0,0,0,4,0},
                         {4,0,0,0,4,0},
                         {4,0,0,0,4,0},
                         {4,4,4,4,4,0},
                         {0,0,0,0,4,0},
                         {0,0,0,0,4,0},
                         {0,0,0,0,4,0}};
        int[][] five = { {5,5,5,5,5,0},
                         {5,0,0,0,0,0},
                         {5,0,0,0,0,0},
                         {5,5,5,5,5,0},
                         {0,0,0,0,5,0},
                         {0,0,0,0,5,0},
                         {5,5,5,5,5,0}};
        int[][] six = {  {6,6,6,6,6,0},
                         {6,0,0,0,0,0},
                         {6,0,0,0,0,0},
                         {6,6,6,6,6,0},
                         {6,0,0,0,6,0},
                         {6,0,0,0,6,0},
                         {6,6,6,6,6,0}};
        int[][] seven = {{7,7,7,7,7,0},
                         {0,0,0,0,7,0},
                         {0,0,0,7,0,0},
                         {0,0,7,0,0,0},
                         {0,0,7,0,0,0},
                         {0,0,7,0,0,0},
                         {0,0,7,0,0,0}};
        int[][] eight = {{8,8,8,8,8,0},
                         {8,0,0,0,8,0},
                         {8,0,0,0,8,0},
                         {8,8,8,8,8,0},
                         {8,0,0,0,8,0},
                         {8,0,0,0,8,0},
                         {8,8,8,8,8,0}};
        int[][] nine = { {9,9,9,9,9,0},
                         {9,0,0,0,9,0},
                         {9,0,0,0,9,0},
                         {9,1,1,1,9,0},
                         {0,0,0,0,9,0},
                         {0,0,0,0,9,0},
                         {1,1,1,1,9,0}};
        int[][] zero = { {1,1,1,1,1,0},
                         {1,0,0,0,1,0},
                         {1,0,0,0,1,0},
                         {1,0,0,0,1,0},
                         {1,0,0,0,1,0},
                         {1,0,0,0,1,0},
                         {1,1,1,1,1,0}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите положительное целое число");
        int number = sc.nextInt();
        int lengthNumber = String.valueOf(number).length();
        List<Integer> numberDigits = DigitsInNumber(number);
        int maxDigits = 0;
        for (Integer numberDigit : numberDigits) {
            if (numberDigit > maxDigits) {
                maxDigits = numberDigit;
            }
        }


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < lengthNumber; j++){
                switch (numberDigits.get(j)){
                    case 0:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 0){
                                if (zero[i][k] != 0) System.out.print("0");
                                else System.out.print(" ");
                            }
                            else if (zero[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 1:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 1){
                                if (one[i][k] != 0) System.out.print("1");
                                else System.out.print(" ");
                            }
                            else if (one[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 2:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 2) {
                                if (two[i][k] != 0) System.out.print("2");
                                else System.out.print(" ");
                            }
                            else if (two[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 3:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 3) {
                                if (three[i][k] != 0)System.out.print("3");
                                else System.out.print(" ");
                            }
                            else if (three[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 4:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 4) {
                                if (four[i][k] != 0)System.out.print("4");
                                else System.out.print(" ");
                            }
                            else if (four[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 5:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 5) {
                                if (five[i][k] != 0)System.out.print("5");
                                else System.out.print(" ");
                            }
                            else if (five[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 6:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 6) {
                                if (six[i][k] != 0)System.out.print("6");
                                else System.out.print(" ");
                            }
                            else if (six[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 7:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 7) {
                                if (seven[i][k] != 0)System.out.print("7");
                                else System.out.print(" ");
                            }
                            else if (seven[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 8:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 8) {
                                if (eight[i][k] != 0)System.out.print("8");
                                else System.out.print(" ");
                            }
                            else if (eight[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                    case 9:
                        for(int k = 0; k < 6; k++){
                            if(maxDigits == 9) {
                                if (nine[i][k] != 0)System.out.print("9");
                                else System.out.print(" ");
                            }
                            else if (nine[i][k] != 0) System.out.print("*");
                            else System.out.print(" ");
                        }
                        break;
                }
            }
            System.out.println("");
        }




    }

    public static List<Integer> DigitsInNumber(int number) {

        String n = Integer.toString(number);
        char[] charArray = n.toCharArray();
        List<Integer> cia = new ArrayList<Integer>();
        for (int i = 0;i<charArray.length; i++){
            int c = Character.getNumericValue(charArray[i]);
            cia.add(c);
        }return cia;
    }


    public static void main(String[] args) {
        Senla tmp = new Senla();
//        System.out.println(tmp.first_task("123ggs45"));
//        tmp.second_task(new Scanner(System.in).nextInt());
//        tmp.second_task(221465863);
//        tmp.third_task("аа бб абв аба баааа ааа");
        tmp.fourth_task();
    }
}
