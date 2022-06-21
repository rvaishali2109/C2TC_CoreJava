import java.util.ArrayList;
import java.util.List;
public class arraylistex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> List=new ArrayList<String>();
System.out.println("Adding elements to end of the list");
List.add("A");
List.add("B");
List.add("D");
List.add("E");
List.add("G");
System.out.println("ArrayList insertion order:"+List);
System.out.println("Adding an element at a specific index after B elements:");
		 List.add(2,"C");
System.out.println("ArrayList insertion order after adding C:"+List);
System.out.println("Adding an element at a specific index after E elements:");
List.add(5,"F");
	}
}
