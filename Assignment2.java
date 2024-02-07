import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
    public static boolean match(String inpuString,ArrayList<String> wordList){
        int size = inpuString.length();
        if (size == 0){
            return true;
        }
        for (int i = 1; i <= size; i++)
        {   
            //divide the inputstring into two parts
            // the first part will have a length of 0 to i-1 and check if it is present in wordList ,if yes then we will check for second part of length i+1 to size-1 recursively
            if (wordList.contains(inpuString.substring(0,i)) && match(inpuString.substring(i,size),wordList)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //taking user input
        Scanner sc = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        System.out.println("Enter the size of wordList:");
        int n= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the strings of wordList:");
        for(int i=0;i<n;i++){
            wordList.add(sc.nextLine());
        }
        System.out.println("Enter the input string");
        String inpuString = sc.nextLine();

        System.out.println(match(inpuString,wordList));
       
        sc.close();
    }
}
