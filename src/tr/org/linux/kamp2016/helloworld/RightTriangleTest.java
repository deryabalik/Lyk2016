package tr.org.linux.kamp2016.helloworld;

public class RightTriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++){
			int A =(int)(Math.random()*49)+1;
			int B =(int)(Math.random()*49)+1;
			RightTriangle k = new RightTriangle(A,B);
		/*	System.out.println("Hipotenüsü : " +k.hipotenus());
			System.out.println("Çevresi : " +k.perimeter());
			System.out.println("Alanı : " +k.area());
		*/
			System.out.println(k);
		}
		
		
	}

}
