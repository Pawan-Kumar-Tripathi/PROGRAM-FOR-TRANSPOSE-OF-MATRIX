import java.io.*;
import java.util.*;
class transposeofmatrix
    {
        public void main()
        {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int arr[][] = new int [m][m];
            int arr2[][] = new int[m][m];
            //taking input
            for(int i = 0 ; i<m;i++)
            {
                for(int j = 0 ; j<m;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            // logic for transpose
            for(int i =0 ;i<m;i++)
            {
                for(int j = 0;j<m ;j++)
                {
                    arr2[i][j] = arr[j][i];
                }
            }
            for(int i =0;i<m;i++)
            {
                for(int j =0 ;j<m;j++)
                {
                    System.out.print(arr[j][i]+ " ");
                }
                System.out.println(" ");
            }
            
            System.out.println("**************");
                for(int i =0;i<m;i++)
            {
                for(int j =0 ;j<m;j++)
                {
                    System.out.print(arr2[i][j]+ " ");
                }
                System.out.println(" ");
            }
        
    }
}

    

            