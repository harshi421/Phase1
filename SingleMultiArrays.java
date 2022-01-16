import java.util.Scanner;
public class Testarray{  
public static void SingleMultiArrays(String args[]){  
int a[]=new int[5];//declaration and instantiation  
a[0]=1;//initialization  
a[1]=2;  
a[2]=3;  
a[3]=4;  
a[4]=5;  
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
//declaring and initializing 2D array  
int arr[][]={{10,20,30},{40,50,60},{70,80,90}};  
//printing 2D array  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  

}}}
    