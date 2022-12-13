class Ex06{

	public static int func01(int su){
		//~
		if(su==0) return 0;
		else return su--+func01(su);
	}
	
	public void func02(){
		System.out.println("func02 run ... ");
	
	}

	public Ex06 func03(Ex06 me){
		System.out.println("func03 run ... ");
		return me;
	}

	public static void main(String[] args){
		//int sum = func01(3);
		//System.out.println("3+2+1 = " +  sum);
		Ex06 me = new Ex06();
		me.func02();
		me.func03();
		me = me.func03();
		me.func03(me).func03(me).func03(me);

	}

}