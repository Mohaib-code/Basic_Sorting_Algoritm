public class practice {
    public static void bubbleSort(int n[]){
        //turns
        for(int turns=0;turns<n.length-1;turns++){
            for(int j=0;j<n.length-1-turns;j++){
                if(n[j]<n[j+1]){
                    //swap
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;

                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
        }
        public static void insertionSort(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                int curr=arr[i];
                int prev=i-1;
                while(prev>=0 && arr[prev]<curr){
                    arr[prev+1]=arr[prev];
                    prev --;
                }
                //update
                arr[prev+1]=curr;
            }
        }
        public static void countingSort(int arr[]){
            int largest=Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                largest=Math.max(largest,arr[i]);
            }
            int count[]=new int[largest+1];
            for (int i = 0; i < arr.length; i++) {
                count[arr[i]]++;
            }
            //Sorting
            int j=0;
            for (int i = count.length-1; i >= 0; i--) {
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
            
        }
         
  
    public static void print(int n[]){
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        print(arr);
    }
}
