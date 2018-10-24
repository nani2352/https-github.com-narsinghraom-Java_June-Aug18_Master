package com.vtalent.nani;

public class Test {
public static void main(String[] args) {
	First f= new Second();
	f.i=5;
	f.j=7;
	f.i=f.i+f.function(f.i+f.j);
	System.out.println(f.i);
	System.out.println(f.j);
	f.j=f.j+(int)f.function(2.0f,3);
	System.out.println(f.i);
	System.out.println(f.j);
	
}
}
