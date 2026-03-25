import java.util.Arrays;
import java.util.Collections;
public class sorting {
    public static void bubble_sort(int arr[]){
         int count=0;
        for(int turn=0;turn<arr.length-1;turn++){        
            for(int j=0;j<arr.length-1-turn;j++){
                    if(arr[j]>arr[j+1]){
                        //swap
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                        count ++;                        
                    }                 
            }            
        }
        System.out.println("Total swap is :"+count);
    }
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            //minimum num
            int min_num=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_num]>arr[j]){
                    min_num=j;
                }
            }
            //swap
            int temp=arr[min_num];
            arr[min_num]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev >=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev --;
            }
            //update
            arr[prev+1]=cur;
        }
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest, arr[i]);
        }
      
        int count[]=new int[largest +1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
      //sorting
      int j=0;
      for (int i = 0; i < count.length; i++) {
        while(count[i]>0){
            arr[j]=i;
        j ++;
        count[i]--;
        }
      }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void print2(Integer n[]){
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        Integer arr2[]={5,4,1,3,2};
        bubble_sort(arr);
        selection_sort(arr);
        insertion_sort(arr);
        Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        Arrays.sort(arr2,Collections.reverseOrder());
        Arrays.sort(arr2,0,4,Collections.reverseOrder());
        print2(arr2);
        countingSort(arr);

        print(arr);
    }
    
}
