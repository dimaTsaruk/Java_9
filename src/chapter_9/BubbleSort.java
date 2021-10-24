package chapter_9;

public class BubbleSort {
    public static void main(String[] args) {

        int[] someNums = {88, 33, 99, 22, 54};

        int comparisonsToMake = someNums.length - 1;
        for (int i = 0; i < someNums.length - 1; ++i) {
            for (int j = 0; j < comparisonsToMake; ++j) {
                if (someNums[j] > someNums[j + 1]) {
                    int temp = someNums[j];
                    someNums[j] = someNums[j + 1];
                    someNums[j + 1] = temp;
                }
            }
            --comparisonsToMake;
        }
        printArray(someNums);
    }

    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
    }
}
