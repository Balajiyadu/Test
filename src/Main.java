import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        You are given an array A of size N.
//        Let us denote S as the sum of all integers present in the array.
//        Among all integers present in the array, find the minimum integer X such that
//        S ≤ N*X

        //MY LOGIC
        //[   ask user for size of an array then assign some random num by importing java.lang.Random class  ]
        //then find min value in that array

        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Tell me the size of an Array " );
        int n = scanner.nextInt();

        for(int i=0;i<=n;i++)
        {
            int arrayElements = random.nextInt();
            arr.add(arrayElements);
        }

        int min= arr.get(0);
//        int sum = 0;
        for(int j=0;j<arr.size();j++)
        {
            if(arr.get(j)<min)
            {
                min = arr.get(j);
            }
//               sum=sum+arr.get(j);
        }
      System.out.println("Array elements are "+arr);
       System.out.println(" minimum value is "+min);
//
//        ArrayList<Integer> brr= new ArrayList<>();
//
//        int res = 0 ;
//        for(int i = 0;i< arr.size();i++)
//        {
//            res = n*arr.get(i);
//            if(sum<=res)
//            {
//                brr.add(i);
//                break;
//            }
//        }
//        System.out.println(brr.get(0));
//        System.out.println(arr.get(brr.get(0)));
    }
}