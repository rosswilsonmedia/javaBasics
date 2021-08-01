import java.util.Arrays;

public class TestBasics {
    public static void main(String[] args){
        Basics tester = new Basics();
        tester.printNums();
        tester.printOddNums();
        tester.sumTo255();
        int[] numArr = {5,4,3,2,1};
        tester.iteratingThroughAnArray(numArr);
        tester.findMax(numArr);
        tester.arrayWithOddNumbers();
        tester.getAverage(numArr);
        tester.greaterThanY(numArr, 3);
        int[] testNums = {1, 5, 10, -2};
        tester.squareTheValues(testNums);
        int[] results = tester.eliminateNegativeNumbers(testNums);
        System.out.println(Arrays.toString(results));

        double[] results2 = tester.maxMinAvg(testNums);
        System.out.println(Arrays.toString(results2));

        int[] results3 = tester.shifter(testNums);
        System.out.println(Arrays.toString(results3));
    }
}