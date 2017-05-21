package com.jeff.test;

public class Test
{
	byte a;
	int b;
	long c;
	float d;

	public static void main(String[] args) throws Exception
	{
		String s1 = new String("abc");
		String s2 = s1.intern();
		String s3 = "  abc";
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		System.out.println(s1 == s3);
	}

	static void hello()
	{
	}
}
