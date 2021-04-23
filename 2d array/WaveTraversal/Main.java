import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    int[][]one=new int[n][m];
    
    for(int i=0;i<one.length;i++){
        for(int j=0;j<one[0].length;j++){
            one[i][j]=scn.nextInt();
        }
    }
    
     
        for(int j=0;j<one[0].length;j++){
           if(j%2==0){
                for(int i=0;i<one.length;i++){
                
            System.out.println(one[i][j]);
                }
           }
           else{
                for(int i=one.length-1;i>=0;i--){
                
                    System.out.println(one[i][j]);
                }
           }
        
    }
  
 
    

}

}