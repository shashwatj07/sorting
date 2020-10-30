import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sort.*;

class BubbleSort{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the array");
        int n=Integer.parseInt(br.readLine());
        int arr[] = Sort.getInputArray(n);
        bubbleSort(arr, n);
        Sort.printArray(arr);
    }

    private static void bubbleSort(int arr[], int n){
        // complete this function.
    }

}