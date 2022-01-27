package Stack;

import java.util.Stack;

public class Form_Min_nu_Lec_1
{
    public static void main(String[] args) {
        String s="DDID";
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<=s.length();i++)
        {
            st.push(i+1);
            // before for loop end we have to done our work
            if(i==s.length()||s.charAt(i)=='I')
            {
                while (!st.empty())
                {
                    System.out.print(st.pop());
                }
            }
        }
    }
}
