import java.util.HashMap;
import java.util.HashSet;

public class No_Duplicate
{
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
                int []a={1,2,3,4,5,2,7,1,4,6,2,1,8,6,9,10,3,10,10,10,10};
                for (int i=0;i<a.length;i++) {
                    if (s.contains(a[i])) {
                        count++;
                        map.put(a[i], map.get(a[i]) + 1);
//                        System.out.println(a[i]);
                    }
                    s.add(a[i]);
                    map.put(a[i], 1);

                }
        System.out.println(map);
        System.out.println("Total number of duplicate "+count);
        System.out.println(s);
    }
}
