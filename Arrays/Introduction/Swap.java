import java.io.*;
import java.util.*;
public class Main{
    
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
public static void main(String[]args)throws Exception{
    int[] arr;
    arr=new int [5];
    arr[0]=33;
    arr[1]=89;
    arr[2]=34;
    arr[3]=56;
    arr[4]=97;
    System.out.println("given array");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    swap(arr,0,4);
    //System.out.println(arr.length);
    System.out.println("after swap");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}