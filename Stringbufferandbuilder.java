package javalearning;

public class Stringbufferandbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer  s1=new StringBuffer("chaitu");
		StringBuffer s2=new StringBuffer("akula");
		StringBuilder s3=new StringBuilder("chaitu");
		StringBuilder s4=new StringBuilder("rocks");
		System.out.println(s1.reverse());
		System.out.println(s2.delete(1, 2));
		System.out.println(s3.append("akula"));
		System.out.println(s2.insert(1, 'b'));
		System.out.println(s4.length());
		
	}

}
