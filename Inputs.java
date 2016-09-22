package programming;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("The inputs are");
		Scanner scan =new Scanner(System.in);
		System.out.println("The inputs adgdhgdre");
		int n=scan.nextInt();
		int n1=scan.nextInt();
		System.out.println(n+n1);
		
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );

int i=Integer.parseInt(br.readLine());
int i1=Integer.parseInt(br.readLine());

System.out.println(i-i1);

	}catch(Exception e){
		System.out.println(e);
	}
try{
DataInputStream dis=new DataInputStream(System.in);
int x=dis.readInt();
int y=dis.readInt();
System.out.println(x*y);
	}catch(Exception e){
		System.out.println(e);
	}

Console co=System.console();
System.out.println(co);
try{
    int  t=Integer.parseInt(co.readLine());
    int t1=Integer.parseInt(co.readLine());
    
    System.out.println(t/t1);
	}catch(Exception e){
		System.out.println(e);
	}
}
}

