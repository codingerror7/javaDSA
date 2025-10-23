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



//2D ARRAYS:
import java.util.*;

public class dsa{
    public static void main(String args[]){
        int[][] arr = new int[1][2];        // 1 row and 2 columns.
        arr[0][0] = 98;
        arr[0][1] = 33;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

    }
}


//INPUT IN 2D ARRAYS:
import java.util.Scanner;

public class dsa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[1][2];
        arr[0][0] = sc.nextInt();
        arr[0][1] = sc.nextInt();
        System.out.println(arr[0][0]*arr[0][1]);
    }
}



//STRING INPUT AND ARRAY CONCATENATION IN 2D ARRAYS:
import java.util.Scanner;

public class dsa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[1][2];
        arr[0][0] = sc.nextLine();
        arr[0][1] = sc.nextLine();
        System.out.println("first one is:" + " " + arr[0][0]);
        System.out.println("Second one is:" + " " + arr[0][1]);
        String con = "FULL NAME IS:" + " " + arr[0][0] + " " + arr[0][1]; //ARRAY CONCATENTAION
        System.err.println(con); 
    }
}



//3D ARRAYS:
import java.util.Scanner;

public class dsa{
    public static void main(String args[]){
        int[][][] arr = new int[1][1][1];
        arr[0][0][0] = 22;
        System.out.println(arr[0][0][0]);
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



import java.util.Scanner;
public class dsa{
    public static void main(String args[]){
        String str = "sujal saraswat";
        String uc = str.toUpperCase();
        String lc = str.toLowerCase();
        char ca = str.charAt(3);
        String concat = str.concat(" is a coder.");
        int length = str.length();
        int indexOf = str.indexOf("sujal");
        String ss = str.substring(8);
        String replace = str.replace("a", "l");
        System.out.println("ACTUAL STRING IS" + " " + str);
        System.out.println("UPPERCASE IS" + " " + uc);
        System.out.println("LOWERCASE IS" + " " + lc);
        System.out.println("charAt is" + " " + ca);
        System.out.println("CONCATENATE IS" + " " + concat);
        System.out.println("LENGTH IS" + " " + length);
        System.out.println("INDEXOF IS" + " " + indexOf);
        System.out.println("SUBSTRING IS" + " " + ss);
        System.out.println("REPLACEMENT IS" + " " + replace);

    }
}



//----------------------------------------------------------------------------------------




//OOPS:
 class Animal{
     String name;
     int age;

     void eat(){
         System.out.println("eats..");
     }
     void sleep(){
         System.out.println("sleeping...");
     }
 }
 public class dsa{
     public static void main(String args[]){
         Animal a1 = new Animal();
         a1.name = "elephant";
         a1.age = 20;
         System.out.println("The name is:" + " " + a1.name);
         System.out.println("The age is:" + " " + a1.age);
         a1.eat();
         a1.sleep();

         Animal a2 = new Animal();
         a2.name = "cat";
         a2.age = 8;
         System.out.println("The name is:" + " " + a2.name);
         System.out.println("The age is:" + " " + a2.age);
         a2.eat();
         a2.sleep();
     }
 }




 class Animal{
     String name;
     int age;

     void eat(){
         System.out.println("HE IS EATING...");
     }
     void sleep(){
         System.out.println("HE IS SLEEPING...");
     }
 }
 class Fish{
     String name;
     int weight;

     void swim(){
         System.out.println("SWIMMING...");
     }
     void eat(){
         System.out.println("HE IS EATING...");
     }
 }
 class Bird{
     String name;
     int age;

     void flying(){
         System.out.println("ITS FLYING HIGHHH...");
     }
     void hungry(){
         System.out.println("ITS HUNGRYY LOOKING FOR FOOD.");
     }
 }
 class Mammals{
     String type;
     int weight;

     void walk(){
         System.out.println("WALKING AND WALKING...");
     }
     void eat(){
         System.out.println("EATING FOOD...");
     }
     void sleep(){
         System.out.println("SLEEPING..");
     }
     void breathing(){
         System.out.println("BHAI SAAnS TO LENE DE!");
     }
 }
 public class dsa{
     public static void main(String args[]){
         System.out.println("FOR ANIMALS:");
         System.out.println("ANIMAL 1:");
         Animal a1 = new Animal();
         a1.name = "cat";
         a1.age = 8;
         System.out.println("THE NAME IS" + " " + a1.name);
         System.out.println("THE AGE IS" + " " + a1.age);
         a1.eat();
         a1.sleep();

         System.out.println("ANIMAL 2:");
         Animal a2 = new Animal();
         a2.name = "dog";
         a2.age = 14;
         System.out.println("THE NAME IS" + " " + a2.name);
         System.out.println("THE AGE IS" + " " + a2.age);
         a2.eat();
         a2.sleep();


         System.out.println("FOR FISHES:");
         System.out.println("FISH 1:");
         Fish f1 = new Fish();
         f1.name = "Tuna";
         f1.weight = 20;
         System.out.println("THE NAME IS" + " " + f1.name);
         System.out.println("THE WEIGHT IS" + " " + f1.weight + "Kg");
         f1.swim();
         f1.eat();

         System.out.println("FISH 2:");
         Fish f2 = new Fish();
         f2.name = "pyrana";
         f2.weight = 35;
         System.out.println("THE NAME IS" + " " + f2.name);
         System.out.println("THE WEIGHT IS" + " " + f2.weight + "Kg");
         f2.swim();
         f2.eat();


         System.out.println("FOR BIRDS:");
         System.out.println("FISH 1:");
         Bird b1 = new Bird();
         b1.name = "Sparrow";
         b1.age = 12;
         System.out.println("THE NAME IS" + " " + b1.name);
         System.out.println("THE AGE IS" + " " + b1.age);
         b1.flying();
         b1.hungry();


         System.out.println("FISH 2:");
         Bird b2 = new Bird();
         b2.name = "Crow";
         b2.age = 9;
         System.out.println("THE NAME IS" + " " + b2.name);
         System.out.println("THE AGE IS" + " " + b2.age);
         b2.flying();
         b2.hungry();

         System.out.println("FOR MAMMALS:");
         System.out.println("MAMMAL 1:");
         Mammals m1 = new Mammals();
         m1.type = "HUMANS";
         m1.weight = 80;
         System.out.println("TYPE IS" + " " + m1.type);
         System.out.println("WEIGHT IS" + " " + m1.weight + "Kg");
         m1.walk();
         m1.eat();
         m1.sleep();
         m1.breathing();


         System.out.println("MAMMAL 2:");
         Mammals m2 = new Mammals();
         m2.type = "Whale";
         m2.weight = 1110;
         System.out.println("TYPE IS" + " " + m2.type);
         System.out.println("WEIGHT IS" + " " + m2.weight + "Kg");
         m2.walk();
         m2.eat();
         m2.sleep();
         m2.breathing();
     }
 }


INHERITANCE:
 class Pen{
     String name;
     String type;

     void write(){
         System.out.println("WRITING...");
     }
 }
 class Pencil extends Pen{
     void cutter(){
         System.out.println("SHARPENER");
     }
 }
 public class dsa{
     public static void main(String args[]){
         Pen p1 = new Pen();
         p1.name = "apsara";
         System.out.println(p1.name);
         p1.type = "gel";
         System.out.println(p1.type);
         p1.write();

         Pencil p2 = new Pencil();
         p2.name = "natraj";
         System.out.println(p2.name);
         p2.write();
         p2.cutter();
     }
 }



//BUBBLE SORT:
import java.util.Scanner;

public class dsa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array is:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        //SORTING:
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //SWAPPING:
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//RECURSION BASICS:
public class dsa{
    public static void printNum(int n){
        if(n==0) return;
        System.out.print(n + " ");
        printNum(n-1);
    }
    public static void main(String args[]){
        System.out.println("NUMS ARE:");
        printNum(5);
    }
}


public class dsa{
    public static void printNum(int n){
        if(n==11) return;
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String args[]){
        printNum(1);
    }
}
