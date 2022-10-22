# week3assignmentpackage week3day1;

public class RevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="san" , rev=" ";
		char ch;
		System.out.println("The gien string is:" +str); 
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println("Reversed word is:" +rev);


	}

}
