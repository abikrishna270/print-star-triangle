import java.util.Scanner;

public class anything {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=sc.nextInt();
        char array[]=new char[limit];
        for(int i=0;i<=limit-1;i++){
            array[i]='*';
        }
        for(int j=0;j<limit;j++){
        for(int k=0;k<=j;k++){
            System.out.print(array[k]+" ");
        }
        System.out.println("");
       }
    }
}
