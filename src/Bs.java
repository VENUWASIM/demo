import java.util.*;
public class Bs {
    public static void  printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ "");

        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {9,5,1,3,60};
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
        
    }
    
}
