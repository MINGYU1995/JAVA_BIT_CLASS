class Ex04
{
public static void main(String[] args)
{
	int a,b;
	a=5;
	b=2;

	a=+a;
	b=-(-b);

	a++;
	++b;

	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);

	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a<=b);
	System.out.println(a==b);
	System.out.println(a!=b);

	boolean bool1=true;
	boolean bool2=false;
	System.out.println(!bool1);	
	System.out.println(!!bool2);

	System.out.println(true && true);	
	System.out.println(true && false);	
	System.out.println(false && true);	
	System.out.println(false && false);	

	System.out.println(true || true);	
	System.out.println(true || false);	
	System.out.println(false || true);	
	System.out.println(false || false);	

	int x,y,z;
	x=3;
	y=2;
	z=1;

	x+=z+y; //x=x+z+y
	System.out.println(x);
	x-=z+y; //x=x-z+y
	System.out.println(x);


	x*=z+y; //x=x*(z+y)
	System.out.println(x);
	x/=z+y; //x=x/(z+y)
	System.out.println(x);
	
	byte n =2;
	n++;
	System.out.println(n);
	byte k=2;
	k+=2;
	System.out.println(k);	
}
}