import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int sumAlice = 0;
        int sumBob = 0;
        
        if(a0>b0){
             sumAlice+=1;   
        } else if(a0<b0){
            sumBob+=1;
        }
        
        if(a1>b1){
             sumAlice+=1;   
        } else if(a1<b1){
            sumBob+=1;
        }
        
        if(a2>b2){
             sumAlice+=1;   
        } else if(a2<b2){
            sumBob+=1;
        }
        
        System.out.println(sumAlice + " " + sumBob);
    }
}

