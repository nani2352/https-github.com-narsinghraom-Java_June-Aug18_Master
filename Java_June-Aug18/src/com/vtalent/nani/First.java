/**
 * 
 */
/**
 * @author KS IT
 *
 */
package com.vtalent.nani;

public class First{
	int i,j;
	public int function(int i){
		this.i=i+this.i;
		this.j=i+this.j;
		return i;
	}
public int function(float f1,int i) {
	this.i=this.i+i;
	j=(int)f1+this.j;
	return i;
	}
}
class Second extends First{
	int i;
	public int function(int i){
		i=i+super.function(i);
		this.i=this.i+i;
		return i;
	}
public void function(double d1,double d2) {
	this.i+=(int)(d1+d2);
	super.i+=this.i;
}
}
