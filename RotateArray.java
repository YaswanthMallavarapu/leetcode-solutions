import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of n and m");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        /*System.out.println("original array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();                                                                                       
        }
        int transpose[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        
        for(int i=0;i<m;i++){
           int temp= transpose[0][i];
           transpose[0][i]=transpose[n-1][n-1-i];
           transpose[n-1][n-1-i]=temp;
        }
           

        System.out.println("rotated array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            System.out.print(transpose[i][j]+" ");
            }
            System.out.println();                                                                                       
        }
            */
            System.out.println("original array");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
                }
                System.out.println();                                                                                       
            }
        System.out.println();

        int trans1[][]=transpose(arr);

        for(int i=0;i<trans1.length;i++){
         int temp=trans1[i][0];
         trans1[i][0]=trans1[trans1[0].length-2+i][trans1[0].length-1];
         trans1[trans1[0].length-2+i][trans1[0].length-1]=temp;

}
        System.out.println("rotated array");
        for(int i=0;i<trans1.length;i++){
            for(int j=0;j<trans1[0].length;j++){
            System.out.print(""+trans1[i][j]+" ");
            }
            System.out.println();                                                                                       
        }



  sc.close();
    }
    public static int[][] transpose(int arr[][]){
        int trans[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                trans[i][j]=arr[j][i];
            }
        }
      return trans;
    }
}
