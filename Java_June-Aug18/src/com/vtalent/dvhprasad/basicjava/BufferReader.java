package com.vtalent.dvhprasad.basicjava;


	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class BufferReader {
		public static void main(String args[]) throws  IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter id");
			String id=br.readLine();
			System.out.println("enter salary");
			String salary=br.readLine();
			
			
			
			double salaryval=Double.parseDouble(salary);
			System.out.println("id="+id+ "salary="+salaryval);
			
		}

	}

