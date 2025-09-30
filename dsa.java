//LINEAR SEARCH WITHOUT INPUT:
public class Main{
    public static int linearSearch(int numbers[],int key){
        for(int i = 0; i<=14; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {11,22,33,44,54,43,32,21,65,76,87,98,90,78,89};
        int key = 89;
        int res = linearSearch(numbers, key);
        if(res==-1){
            System.out.println("NO KEY FOUND!");
        }
        else{
            System.out.println("KEY AT INDEX = " + res);
        }
    }
}



//LINAR SEARCH ALGORITHM:
import java.util.*;

public class dsa{
    public static int linearSearch(int numbers[],int key){
        for(int i = 0; i <= 11; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a key:");
        int key = sc.nextInt();
        int numbers[] = {11,22,34,55,65,43,21,66,87,98,90,33,63};
        int res = linearSearch(numbers,key);
        if(res==-1){
            System.out.println("KEY NOT FOUND!");        
        }
        else{
            System.out.println("FOUNDED AT INDEX " + res);
        }

    }
}



import java.util.*;

public class dsa{
     public static int linearSearch(String food[],String key){
            for(int i = 0; i <= 7; i++){
                if(food[i].equals(key)){       //for string comparison
                    return i;
                }
            }
            return -1;
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          System.out.println("PLEASE ENTER YOUR FOOD:");
        String key = sc.nextLine();
        String food[] = {"dosa","idli-sambhar","vada-pav","chhole-bhature","kachori","samosa","bread","rice"};
        int res = linearSearch(food,key);
        if(res==-1){
            System.out.println("KEY NOT FOUND!");
        }
        else{
            System.out.println("KEY FOUNDED AT INDEX " + res);
        }

    }
}




//PROGRAMME TO FIND LARGEST NUMBER SMALLEST NUMBER:
 import java.util.*;

 public class dsa{
     public static int largestNum(int numbers[]){
         int largest = Integer.MIN_VALUE;      
         int smallest = Integer.MAX_VALUE;
         for(int i = 0; i < numbers.length; i++){
             if(numbers[i]>largest){
                 largest = numbers[i];
             }
             if(numbers[i]<smallest){
                 smallest = numbers[i];
             }
         }
         System.out.println("SMALLEST IS: " + smallest);
         return largest;
     }
     public static void main(String args[]){
         int numbers[] = {123,345,567,789,909,987,876,654,543,564,431,321,3333};
         int res = largestNum(numbers);
         System.out.println("LARGSET NUMBERS IS: " + res);
         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
     }
 }



//PROGRAMME OF BINARY SEARCH ALGORITHM:
import java.util.*;

public class dsa{
    public static int binarySearch(int numbers[],int key){
        int start = 0 , end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(key==numbers[mid]){
                return mid;
            }
         else if(key > numbers[mid]){  //right side:
            start = mid + 1;
         }
         else if(key < numbers[mid]){  //left side:
            end = mid-1;
         }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {10,20,30,40,50,60,70,80,90};  //it works only on sorted array in ascending order.
        int key = 50;
        int res = binarySearch(numbers,key);
        System.out.println("KEY IS AT INDEX: " + res);
    }
}


//BINARY SEARCH ALGO BY INPUT FROM USER:
import java.util.*;

public class dsa{
    public static int binarySearch(int numbers[],int key){
        int start = 0, end = numbers.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(key==numbers[mid]){
                return mid;
            }
            else if(key > numbers[mid]){  //right shift:
                start = mid + 1;
            }
            else if(key < numbers[mid]){   //left shift:
                end = mid - 1;
            }
            // else{
            //     System.out.println("KEY NOT FOUND!");
            // }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("PLEASE ENTER A KEY:");
        int key = sc.nextInt();
        int res = binarySearch(numbers,key);
        System.out.println("YOUR KEY IS AT INDEX: " + res);

    }
}



//BITWISE OPERATORS:
 import java.util.Scanner;

 public class dsa{
     public static void main(String args[]){
         System.out.println(4 & 5);
         System.out.println(9|5);
         System.out.println(6^9);
         System.out.println(~8);
     }
 }


//STRING MANIPULATION:
 import java.util.Scanner;

 public class dsa{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Please input a string");
         String str = sc.nextLine();
         System.out.println("String is:" + " " + str);
         System.out.println(str.length());
         System.out.println(str.charAt(7));
     }
 }


    

 import java.util.Scanner;;

 public class dsa{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER STR 1:");
         String str1 = sc.nextLine().toUpperCase();
         System.out.println("ENTER STR 2:");
         String str2 = sc.nextLine().toUpperCase();
         int str3 = str1.length();
         int str4 = str2.length();
         if(str3>str4){
             System.out.println("STR1 IS >> STR2");
             System.out.println(str1);
         }
         else if(str4>str3){
             System.out.println("STR2 IS GREATER THAN STR1");
             System.out.println(str2);
         }
         else if(str1.equals(str2)){
             System.out.println("khud dekhlo...");
             System.out.println(str1);
             System.out.println(str2);
         }
         else{
             System.out.println("Hatttt");
         }
     }
 }


//----------------------------------------------------------------------------------------


