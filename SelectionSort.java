import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sort.*;

class SelectionSort{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the array");
        int n=Integer.parseInt(br.readLine());
        int arr[] = Sort.getInputArray(n);
        selectionSort(arr, n);
        Sort.printArray(arr);
    }

    private static void selectionSort(int arr[], int n){
        // complete this function.
    }

}