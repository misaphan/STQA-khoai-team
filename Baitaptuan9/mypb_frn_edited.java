// This program allow user to see the summary of 2 fractions
public class frn{
	public int nmt,dnt;
	//numerator and denominator 
	public frn(){
		nmt = 1;
		dnt = 1;
	}
	public frn(int x, int y) throws ArithmeticException {
		if(y==0) {
			throw new DivideByZeroException();
		}
		nmt=x;
		dnt=y;
	}
	// add method
	public frn add(frn p){
		frn t = new frn();
		t.nmt = nmt*p.dnt+dnt*p.nmt;
		t.dnt = dnt*p.dnt;
		return t;
	}
	// reduce the result
	public void reduce(){
		for(int i=nmt;i>=2;i--){
			if(nmt%i==0 && dnt%i==0){
				nmt=nmt/i;
				dnt=dnt/i;
				break;
			}
		}
	}
	public String toString() {
		if(nmt==0)
			return "0";
		if(dnt==1)
			return nmt+"";
		return nmt+"/"+dnt;
	}
	public static void main(String args[]) {
		frn frn1 = new frn(2,4);
		frn frn2 = new frn(5,6);
		frn frn3 = new frn();
		frn3=frn1.add(frn2);
		frn3.reduce();
		System.out.println("Tong = "+frn3.nmt+"/"+frn3.dnt);}
	}
}
