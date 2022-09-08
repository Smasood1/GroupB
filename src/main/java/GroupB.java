public class GroupB {


    //question 1

    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //question 2

    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //question 3

    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //question 4

    public static String getLastElement(String[] names) {
        return names[3];
    }

    //question 5

    public static String getSecondToLastElement(String[] names) {
        return names[2];
    }

    //question 6

    public static int getSum(int[] ints) {
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        return sum;
    }
    //question 7

    public static int getAverage(int[] ints) {
        double total = 0;
        for (int i = 0; i < ints.length; i++) {
            total = total + ints[i];
        }
        double average = (total / ints.length);
        return (int) average;
    }

    //question 8
    public static String extractAllOddNumbers(int[] number) {
        String odd = " ";
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                odd = odd + String.valueOf(number[i]) + " ";
            }
        }
        return odd;
    }

    //question 9
    public static String extractAllEvenNumbers(int[] number) {
        String even = " ";
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even = even + String.valueOf(number[i]) + " ";
            }
        }
        return even;

    }

    //question 10
    public static boolean contains(String[] names, String element) {
        for (String n : names) {
            if (element == n) {
                return true;

            }
        }return false;
    }



    //question 11
    public static int getIndexByElement(String[] names, String element) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == element) {
                return i;

            }
        }
        return -1;


    }

    //question 12
    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }

        }
    }
    //question 13

  //  public static String printGivenStringTimesNumberGiven(String str, int n){


  //  }


    public static void main(String[] args) {
        String[] names = {"Saad", "Kyle", "Kareem", "Omar"};
        int[] number = {24, 52, 33, 64, 71, 19, 62};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(number));
        System.out.println(getAverage(number));
        System.out.println(extractAllOddNumbers(number));
        System.out.println(extractAllEvenNumbers(number));
        System.out.println(contains(names,"e"));
        System.out.println(getIndexByElement(names,"Saad"));
        printOddNumbersInRange(24,62);
    }
}