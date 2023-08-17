package selectClass;

import java.util.ArrayList;

public class listPractice {
 public static void main(String[]args) {
	 java.util.List<String>AutomationBatch=new ArrayList<String>();
	// int size = AutomationBatch.size();
	 //System.out.println(size);
	 AutomationBatch.add("Ram");
	 AutomationBatch.add("Sham");
	 AutomationBatch.add("Geeta");
	 AutomationBatch.add("Meena");
	 int size = AutomationBatch.size();
	 System.out.println("Size of AutomationBatch is = "+size);
	 
	 for(int i=0;i<4;i++) {
		 
		 String name = AutomationBatch.get(i);
		 System.out.println(name);
	 }

 }
}
