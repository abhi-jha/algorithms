package abhishek.algorithms.sorting;

public class BubbleSort {

    public int[] bubbleSort(int[] inputArray){
        for(int  i = 0 ; i < inputArray.length; i++){
            for(int  j = i + 1; j < inputArray.length; j ++){
                if(inputArray[i]>inputArray[j]){
                    inputArray[i] = inputArray[i]^inputArray[j];
                    inputArray[j] = inputArray[i]^inputArray[j];
                    inputArray[i] = inputArray[i]^inputArray[j];
                }
            }
        }
        return inputArray;
    }
}
