class Ex03{
// 반복문은 매번 실행 . 메서드는 필요한 시점때만 언제든지함. 
public static void main(String[] args){	
	int su=1;
	for(su=1;su<10;su++){
	gugu3(su);
	}

}

public static void gugu(int su) {
	System.out.println(2+"x"+su);
}
public static void gugu3(int su) {
	System.out.println(3+"x"+su);
}


}