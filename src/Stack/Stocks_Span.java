package Stack;
import java.util.Arrays;
import java.util.Stack;
public class Stocks_Span
{
    public static void main(String[] args) {
        int []stocks={100,80,60,70,60,75,85};
        int [] span=new int[stocks.length];
   /*     BRUTEFORCE ALGORITHM
   for (int i=stocks.length-1;i>=0;i--)
        {  int count=1;
            for (int j=i;j>0;j--)
            {
                if(stocks[j-1]<=stocks[i])
                {count++;
                 System.out.print(count++);
                }
           }
             span[i]=count;
        }
        for (int i=0;i<span.length;i++)
        {
            System.out.println(stocks[i]+" "+span[i]);
        }
*/ //USE OF STACK TO REDUCE TIME
        Stack<Integer> visited=new Stack<>();
        span[0]=1;
        visited.push(0);
        for (int i=1;i<stocks.length;i++)
        {
//            System.out.println("Code for "+stocks[i]);
            while (!visited.empty()&&stocks[visited.peek()]<=stocks[i])
            {
//                visited.pop();
                System.out.println("poping "+visited.pop()+" for "+stocks[i]);
            }
//            System.out.println(!visited.empty());
//            System.out.println(i-visited.peek());
            span[i]=i-visited.peek();
            visited.push(i);
            System.out.println(visited);
            System.out.println("For next loop");
        }
        System.out.println(Arrays.toString(span));
    }
}
