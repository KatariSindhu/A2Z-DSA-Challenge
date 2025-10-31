/*
 * LOGIC FOR INSERTION SORT
 * 1) We have 2 parts of array- sorted part(left) & unsorted part(right)
 * 2)we take first element from unsorted part of array, 
 *      and start comparing with previous element and swap if smaller,
 *      this continues till you the previous element is smaller than this element
 */
package Step2_Learn_Important_Sorting_Techniques;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={6,5,1,9,0,2,4,7};

        for(int i=1;i<arr.length;i++){//start from index 1- as index 0 is considered sorted
            int j=i;
            while(j>0 && arr[j-1]>arr[j] ){// checking with previous el and swapping if curr el is smaller
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */
