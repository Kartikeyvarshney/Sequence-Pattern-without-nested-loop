import java.util.Scanner;

public class Solution {
    static int pattern (int i, int temp)
    {
        
        for (int a = 0 ; a < i ; a++)
        {
            System.out.print(temp + " ");
            temp += 1;
        }
        return temp;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 1;
        for(int i = 1 ; i <= num ; i ++)
        {
           temp = pattern(i,temp);
       
            System.out.println();
        }
        
    }
}
