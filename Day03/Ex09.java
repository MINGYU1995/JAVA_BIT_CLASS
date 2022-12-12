class recipe{
	String product; //품목
	int count; //수량
	int price; //금액 
	int oneprice; //정가
}

class Ex09
{
public static void main(String[] args)
{
	int total = 0;
	recipe a,b,c;
	a = new recipe();
	a.product = "생수";
	a.count = 1;
	a.price = 1200;
	a.oneprice = 1200;

	b = new recipe();
	b.product = "풍선껌";
	b.count = 2;
	b.price = 1500;
	b.oneprice = 500;

	c = new recipe();
	c.product = "과자";
	c.count = 3;
	c.price = 700;
	c.oneprice = 1400;
	total = a.price + b.price + c.price;
	

		
	System.out.println("---------------------------------------------\n");
	System.out.println("비플제로페이 영수증\n");
	System.out.println("---------------------------------------------\n");
	System.out.println("품목		정가	수량	금액\n");
	System.out.println(a.product+"          "+a.oneprice+"       "+a.count +"       "+a.price);
	System.out.println(b.product+"         "+b.oneprice+"       "+a.count +"       "+b.price);
	System.out.println(c.product+"          "+c.oneprice+"       "+a.count +"       "+c.price);
	System.out.println("---------------------------------------------\n");
	System.out.println("합계			         " + total  );
}
}