package javalearning;

class College{
	String initial;
	College(String o)
	{
		initial=o;
	System.out.println(initial);
}
	public String toString() {
		return initial;
	}
}
public class Objectclassex  {


	public static void main(String[] args) {
		College c=new College("Bonam");
		College c1=c;
		System.out.println(c.equals(c1));
		System.out.println(c==c1);
		System.out.println(c.hashCode());
		System.out.println(c.toString());
		System.out.println(c.getClass());// TODO Auto-generated method stub

	}

}
