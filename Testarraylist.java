import java.util.*;
class Testarraylist
{
public static void main(String[] args)
{
LinkedList<String> name=new LinkedList<String>();
name.add("java");
name.add("python");
name.add("c++");
name.add("dbms");
System.out.println(name);
name.remove(1);
System.out.println(name);
name.set(1,"html");
System.out.println(name);
System.out.println(name.get(1));
for(String s:name)
{
System.out.println(s);
}
name.addFirst("css");
name.addLast("c");
System.out.println(name);
name.removeFirst();
name.removeLast();  
System.out.println(name);    
}
}

