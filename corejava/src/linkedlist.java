import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> LL=new LinkedList<Integer>();
for(int i=0;i<=5;i++)
	LL.add(i);
System.out.println(""+LL);
LL.remove(3);
System.out.println(""+LL);
for(int i=0;i<=3;i++) {
System.out.println(""+LL.get(i));
}
}
}
