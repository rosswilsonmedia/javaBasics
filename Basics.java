import java.util.ArrayList;

public class Basics {
    public void printNums(){
        for(int i=0; i<256; i++){
            System.out.println(i);
        }
    }
    public void printOddNums(){
        for(int i=0; i<256; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public void sumTo255(){
        int sum=0;
        for(int i=0; i<256; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public void iteratingThroughAnArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void findMax(int[] arr){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    public void arrayWithOddNumbers() {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i=1; i<256; i=i+2){
            results.add(i);
        }
        System.out.println(results);
    }

    public void getAverage(int[] arr) {
        double avg = 0;
        for(int i = 0; i < arr.length; i++){
            avg += (double)i;
        }
        avg = avg / (double) arr.length;
        System.out.println(avg);
    }

    public void greaterThanY(int[] arr, int val) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>val){
                results.add(arr[i]);
            }
        }
        System.out.println(results.size());
    }

    public void squareTheValues(int[] arr){
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            results.add(arr[i]*arr[i]);
        }
        System.out.println(results);
    }

    public int[] eliminateNegativeNumbers(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        return arr;
    }

    public double[] maxMinAvg(int[] arr){
        int max = arr[0];
        int min = arr[0];
        double avg = (double)arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            avg+=(double)arr[i];
        }
        avg=avg/(double)arr.length;
        double[] results = {(double)max, (double)min, avg};
        return results;
    }

    public int[] shifter(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=0;
        return arr;
    }
}