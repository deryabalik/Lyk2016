package tr.org.linux.kamp2016.helloworld;

public class RightTriangle {
	
	private int A;
	private int B;
	
	public RightTriangle(int A, int B){
		this.A = A;
		this.B = B;
		
	}
	
	public int getA(){
		return A;
	}
	
	public int getB(){
		return B;
	}
	
	public void setA(int A){
		this.A=A;
	}
	
	public void setB(int B){
		this.B = B;
	}
	
	public int hipotenus(){
		int hipotenus = (int)Math.hypot(A,B);
		return hipotenus;
	}
	public int perimeter(){
		int perimeter= A+B+hipotenus();
				return perimeter;
	}
	
	public int area(){
		int area = (A*B)/2;
				return area;
	}

	@Override
	public String toString() {
		return ("A :" + A + " B : " + B + "Hipotenüs: " +hipotenus()+ " Area : " + area() + " Perimeter: " + perimeter());
	}
	
}
