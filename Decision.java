import java.io.*;
import java.util.*;

public class Desicion {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if (N%2 != 0){
            System.out.print("Weird");
        }
        else if(N>=2 && N<=5){
            System.out.print("Not Weird");
        }
        else if(N>=6 && N<=20){
            System.out.print("Weird");
        }
        else if(N>20){
            System.out.print("Not Weird");
        }
        

        scanner.close();
    }
}
