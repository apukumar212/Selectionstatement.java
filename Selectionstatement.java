package com.pack1;

public class Selectionstatement 
{
void meth1(int i)
{
	System.out.println("--------meth1()--------");
	if(i<=10)
	{
		System.out.println("hi");
	}
	System.out.println("meth1() execution completed");
}
void meth2(int i)
{
	System.out.println("--------meth2()--------");
	if(i<=10)
		System.out.println("hello");
	System.out.println("meth2() execution completed");
}
void meth3(int i)
{
	System.out.println("--------meth3()--------");
    if(!(i<=10))
    	//int x=100;//C.E because we should not write any declaration statement
    System.out.println("hi");
    System.out.println("meth3() execution completed");
}
void meth4(int i)
{
    System.out.println("--------meth4()--------");
    if(i<=10)
    {
    System.out.println("if block executed");	
    }
    else
    {
    	System.out.println("else block executed");
    }
    System.out.println("meth4() execution completed");
}
void meth5(int a,int b)
{
	System.out.println("--------meth5()--------");
	if(a<=10)
	{
		if(b<=20)
		{
			if(b>=(a+b))
			{
				System.out.println("hi");
			}
			else
			{
				System.out.println("hello");
			}
		}
		else
		{
			System.out.println("java");
		}
	}
	else
	{
		System.out.println("else block executed");
	}
	System.out.println("meth5() execution completed");
}
   int meth6(int i)
   {
	   System.out.println("--------meth6()--------");
	   if(i<=10)
		   return 10;
	       return 'A';
	  //System.out.println("meth6() execution completed");//c.e
   }
   void meth7(int i)
   {
	   System.out.println("--------meth7()--------");
	   if(true)
	   {
		   System.out.println("if block executed");
		   new Selectionstatement().meth8();
	   }
	   else
	   {
		   System.out.println("else block executed"); //dead code
	       new Selectionstatement().meth9();
	   }
	   System.out.println("meth7() execution complete");
   }
   void meth8()
   {
	   System.out.println("meth8() called");
   }
   void meth9()
   {
	   System.out.println("meth9() called");
	}
   void meth10(int i)
   {
	   System.out.println("--------meth10()--------");
	   if(i>0)
	   {
		   System.out.println(i+"is positive number");
	   }
	   else if(i<0)
	   {
		   System.out.println(i+"is negative number");
	   }
	   else
	   {
		   System.out.println(i+"is equal to 0");
	   }
	   System.out.println("meth10() execution completed");
   }
   public static void main(String[] args) 
   {
	   Selectionstatement aobj=new Selectionstatement();
	   aobj.meth1(5);
	   aobj.meth2(50);
	   aobj.meth3(100);
	   aobj.meth4('B'-'A'); //66-65=1
	   aobj.meth5(50, 6);
	   System.out.println("===>"+aobj.meth6(100));
	   aobj.meth7(500);
	   aobj.meth10(-5);
	
}
   }













