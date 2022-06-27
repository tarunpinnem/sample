import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BinarySearch search=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to be searched:");
        int element=sc.nextInt();
        int result=search.binarySearch(arr,0,size,element);
        if(result==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at : "+(element));
    }
}
