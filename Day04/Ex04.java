class Ex04{

public static void main(String[] args){
	int i=1,j=1;
	int a=0,b=0,sum=0,av=0;
	int h=0,k=0;
	int u=0,e=0;
System.out.println("---------------------------------");	
	int dan=1;
	while(10 > dan)
	{	
	dan++;
	System.out.print(dan + "단" + "\t");
	}
	System.out.println();
	while(9>i){
		i++;
		while(10>j){
		j++;
		System.out.print(j+"*"+i+"="+i*j + "\t");
		}
		j=2;
		System.out.println();
	}
System.out.println("---------------------------------");
	while(50>a){
	b = a++;
	sum += b;	
	if(a%3==0)
	System.out.print(""+a+" ");
	}
	System.out.println();
System.out.println("---------------------------------");
	System.out.println("a의 합은?"+sum);
System.out.println("---------------------------------");
	while(11>h){
	h++;
	if(h%2==0)
	System.out.print(h+",");
	}
	System.out.println();
System.out.println("---------------------------------");
	while(10>e){
	e++;
	if(e%2!=0){
	u += e;
	System.out.print(e);
	System.out.print("+");
	}	
	}
	System.out.println("="+u);
System.out.println("---------------------------------");
}
}