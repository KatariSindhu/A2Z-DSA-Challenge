/*
 * LOGIC OF BUBBLE SORT
 * 1) Push the largest element to the last
 * 2) One loop will run from n-1 to 0 index- outer loop- its to set a range for the inner loop, like till which index it should compare
 * 3) Inner loop will go from 0 to n-2 index -every adjacent element will be compared and max element will be should right
 */
package Step2_Learn_Important_Sorting_Techniques;

public class BubbleSort {
    public static void main(String[] args){
        int arr[] ={6,5,1,9,0,2,4,7};

        for(int i=arr.length-1;i>=0;i--){ //outer loop for number of passess
            boolean swapOccured=false;
            for(int j=0;j<i;j++){ //inner loop for comparing and swapping
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapOccured=true;
                }
            }
            if(!swapOccured){// if no swap occured in entire array from 0 to n-1, then it means that its already sorted array, we can break here
                break;
            }
        }        
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*
 * Time Complexity : Worst and Average Case: O(n^2) , 
 *                   Best Case: O(n) - already sorted - Due to the optimization
 * Space Complexity: O(1)
 */
