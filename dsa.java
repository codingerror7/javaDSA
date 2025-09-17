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
