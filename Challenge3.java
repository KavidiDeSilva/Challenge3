class Challenge3 {


public static int[] arr = { 47, 84, 75, 21, 14, 14, 79 };

    


    public static int sortArray(){
         //to swap
        int temp = 0; 

        for (int i=0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){ 
                    // ascending order 
                    if (arr[i] > arr[j]){  
                        temp = arr[i];  
                        arr[i] = arr[j];  
                        arr[j] = temp;  
                    }                 
            }   
        }

        for (int num : arr) {
            // Sorting array to ascending order
            System.out.print(num + " ");
        }
        return 0;

    }

    public static double findMedian(){

        double median; //declare val
        int middle = arr.length/2; //find middle number

        if (arr.length % 2 == 0)
            median = (arr[middle] + arr[middle - 1])/2;
        else
            median =  arr[middle];

        return median;
    }

    public static int findMode(){
        int result = 0;
        //to count repeatitive numbers
        int count=0;
        for (int i=0; i<arr.length; i++) { 
            int repeatcount = 1;
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i] == arr[j]) { 
                    repeatcount++;
                    if (repeatcount > count) { 
                        result = arr[i];
                        count = repeatcount;
                    }
                }
            }
        }
        return result;
    }

    public static int checkPrimeNumbers(int arr[]) {

        for (int j = 0; j < arr.length; j++) {

          for (int i = 2; i < arr[j]; i++) {
            if (arr[j] % i == 0) {
                return arr[j];
            }
          }
          System.out.println(arr[j] + " ");
        }
        return 0;
    }



    public static void main(String args[]){
        //sorted array
        System.out.print("Sorted Array ");
        System.out.println(sortArray());

        // highest value
        // int lastNum = arr[arr.length-1];
        // System.out.println(lastNum);
        System.out.println("Highest Value "+arr[arr.length-1]);

        //median
        System.out.print("Median ");
        System.out.println(findMedian());

        //mode
        System.out.print("Mode ");
        System.out.println(findMode());

        //prime numbers
        System.out.println(checkPrimeNumbers(arr));
        

    }



}