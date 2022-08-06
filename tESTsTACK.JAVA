import java.util.*;
class TestStack
{
public static void main(String[] ar)
{
LinkedList<String> s=new LinkedList<String>();
s.add("Chris");
s.add("steve");
s.add("Tom");
s.add("Peter");
System.out.println(s);
//s.remove(0);
System.out.println(s.get(1));
System.out.println(s);
s.addFirst("1");
s.addLast("2");
System.out.println(s);
s.removeLast();
s.removeFirst();
for(String st:s)
{
System.out.println(st);
}
}
}
