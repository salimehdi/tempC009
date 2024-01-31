import java.util.*;
import java.lang.Thread;
import java.io.*;

class FactorialThread extends Thread{
	private int n;
	public FactorialThread(int n){
		this.n = n;
	}
	public void run(){
		try
          {
               int n = 1;
               while (n<=10)
               {
                   System.out.println(factorial(n));
                    n=n+1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
	}

	public int factorial (int n){
		if(n<=1){
			return n;
		}
		return n* factorial(n-1);
	}
}

class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
              
               int n = 10;
               while (n>0)
               {
                    System.out.println("==> "+c);
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

class Main {
    public static void main (String[] args){
        FactorialThread t1 = new FactorialThread(10);
        Fibonacci t2 = new Fibonacci();
        t2.start();
        t1.start();
    }
}
