import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=scn.nextInt();
		}
		int first=0;int last=arr.length-1,temp;
		while(first<last){
		    temp=arr[first];
		    arr[first]=arr[last];
		    arr[last]=temp;
		    first++;
		    last--;
		}
		
		
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
		
	}
}

