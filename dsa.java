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

