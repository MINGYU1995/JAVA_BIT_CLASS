class Ex01
{

public static void main(String[] args){
	
	int a;
	a=1234;	//10binary notion 
	a=0b00000011; //2binary  3
	a=010;	//8binary 
	a=0x10;	//16binary 
	System.out.println(a);
	long b; 
	b=123411111111111111L;
	b=a;
	System.out.println(b);
	int c=(int)b;
	System.out.println(c);
	byte d =127;
	d=-128;
	d=(byte)129;
	System.out.println(d);
}

}