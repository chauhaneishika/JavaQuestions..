//1
//public class Questions {
//    static void main() {
//
//        int[] marks = {46,55,32,41,88,17};
//        for(int i = 0; i < marks.length; i++) {
//            if(marks[i] < 35) {
//                System.out.print(i+" ");
//            }
//        }
//    }
//}

//2

//import java.util.Scanner;
//
//public class Questions {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        //input and output
//        System.out.println("Enter array elements : ");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for(int i =0; i<arr.length;i++) {
//            sum += arr[i];
//        }
//        System.out.println("Sum of array elements = " + sum);
//    }
//}

//3

//import java.util.Scanner;
//
//public class Questions {
//    static void main() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        //input
//        System.out.println("Enter array elements: ");
//        for(int i =0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        //Element to be searched
//        System.out.println("Enter element: ");
//        int x = sc.nextInt();
//
//        //output
//        for(int i =0; i<arr.length; i++) {
//            if(arr[i] == x) {
//                System.out.println("Element found at index: " + i);
//            }
//        }
//    }
//}

//4


//import java.util.Scanner;
//
//public class Questions {
//    static void main() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size : ");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//
//        //input and output
//        System.out.println("Enter array elements : ");
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        //element to be searched
//        System.out.println("Enter the element to be searched: ");
//        int x = sc.nextInt();
//        boolean flag = false; // nahi mila
//        for(int i = 0; i<arr.length; i++) {
//            if(arr[i] == x) {
//                flag = true;
//                break;
//            }
//        }
//        if(flag == false) {
//            System.out.println("Nahi mila");
//        } else{
//            System.out.println("Mil gya");
//        }
//    }
//}

//5


//import java.util.Scanner;
//
//public class Questions {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        //input and output
//        System.out.println("Enter array elements: ");
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for(int i = 0; i<n;i++) {
//            if(arr[i] > max) max = arr[i];
//        }
//        System.out.println("Maximum element is: " + max);
//    }
//}

//6

//public class Questions {
//    static void main() {
//
//        int[] arr = {5,6,8,9,6};
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i < arr.length; i++) {
//            if(arr[i] > max)
//               max = arr[i];
//        }
//        int sMAx = Integer.MIN_VALUE;
//        for(int i = 0 ; i < arr.length; i++) {
//            if(arr[i] > sMAx && arr[i] != max)
//                sMAx = arr[i];
//        }
//        System.out.println("Maximum value is : " + max);
//        System.out.println("Second largest value is : " + sMAx);
//    }
//}

//7

//import java.util.Scanner;
//
//public class Questions {
//    static void main() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        //input
//        System.out.println("Enter array elements: ");
//        for(int i =0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the element x: ");
//        int x = sc.nextInt();;
//        int count = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] > x)
//                count++;
//        }
//        System.out.println("Count of elements greater than " + x + " = " + count);
//    }
//}

// PASSING ARRAYS TO METHODS

//8

//public class Questions {
//    public int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//        int[] ans = new int[2]; // ye ans h hum nums name ke arr m travel kr rhe h
//        for(int i = 0; i<n ; i++) {
//            for(int j = i+1; j<n; j++) {
//                if(nums[i]+nums[j] == target) {   //mil gaya
//                    ans[0] = i; ans[1] =j;
//                    break;
//                }
//            }
//        }
//        return ans;
//    }
//}

//9

public class Questions {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void main() {
        int[] arr = {2,3,5,7,9,11,13,17};
        int n = arr.length;
        print(arr);
        int i=0, j=n-1;
        while(i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        print(arr);
    }
}

