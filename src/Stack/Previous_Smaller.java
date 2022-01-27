package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Previous_Smaller
{
    public static void main(String[] args) {
        int []a={4,10,5,8,20,15,3,12};
//        previous_Smaller_elemen(a);
//        Stack<Integer> s=new Stack<>();
        previous_Smaller_elemen(a);
    }
    static void previous_Smaller_elemen(int []a)
    {
        Stack<Integer> s= new Stack<>();
        int []b=new int[a.length];
        for (int i=0;i<a.length;i++)
        {
         while (!s.isEmpty() && s.peek()>a[i])
         {
             s.pop();
         }
         if(s.isEmpty())
         {
             b[i]=-1;
         }
         else
         {
             b[i]=s.peek();
         }
         s.push(a[i]);
        }
        System.out.println(Arrays.toString(b));
    }
}
