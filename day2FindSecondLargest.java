# week3assignment
package week3day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int data[]= {3,2,11,4,6,7,2,3,3,6,7};
	       TreeSet <Integer> treeSet= new TreeSet<Integer>();
	   	for(int i=0;i<=data.length-1;i++)
	   	{
	   		treeSet.add(data[i]);
	   	}
	   	
	   	System.out.println("TreeSet Elements are: "+treeSet);

	   	 ArrayList<Integer> intList = new ArrayList<Integer>(treeSet);
	   	 int size = intList.size();
	   	 System.out.println("Second Largest Element is: "+intList.get(size-2));
		

	}

}
