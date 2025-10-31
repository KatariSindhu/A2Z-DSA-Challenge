/*
 * LOGIC OF SELECTION SORT
 * 1) Take a range of index 0(i) to n-1 of array, then 1 to n-1, then 2 to n-1....so on.. 
 * 2) In each range, find smallest element
 * 3) Swap the smallest element with index i
 */
package Step2_Learn_Important_Sorting_Techniques;

public class SelectionSort{
    public static void main(String[] args){
        int arr[] ={6,5,1,9,0,2,4,7};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){// for selecting range for comparison
            int smallestIdx=i;
            for(int j=i+1;j<arr.length;j++){ //unsorted part- finding smallest element(in each range)
                if(arr[j]<arr[smallestIdx]) smallestIdx=j;
            }
            int temp=arr[i];
            arr[i]=arr[smallestIdx];
            arr[smallestIdx]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*
 * Time Complexity : O(n^2)
 * Space Complexity: O(1)
 */