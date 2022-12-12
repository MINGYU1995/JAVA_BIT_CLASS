class Ex03
{
public static void main(String[] args)
{
		//반복문 	
		/*
			//2.while문
			(a)
			while((b)true/false){
				반복구문;(c)
			}
		(d)
		a->b->c->b->c->b->c->b(false)->d	
		*/


		/*
		//3.do~while문 
		반드시 한번의 실행을 보장
			do{
				반복구문;
			}while(true/false); <- 세미콜론 필수 
		*/ //특수한 상황빼고 잘 안씀.

		int a=0;
		while(10>a++){
			System.out.println(a+"번 실행");
		}		
}
}