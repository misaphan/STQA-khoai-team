//day la chuong trinh in ra tong cua hai phan so, nhung khong co cmt nao cho biet muc dich cua tung ham
public class ps{
	public int nmt,;
	// ten bien, ten class nen dat theo tieng anh
	public ps(){
		ts = 1;
		ms = 1;
	}
	public ps(int x, int y) 
		//chua co ngoai le mau so bang 0 - chia cho 0
		ts=x;
		ms=y;
	}
	public ps add(ps p){
		ps t = new ps();
		t.ts = ts*p.ms+ms*p.ts;
		t.ms = ms*p.ms;
		for(int i=t.ts;i>=2;i--){
			if(t.ts%i==0 && t.ms%i==0){
				t.ts=ts/i;
				t.ms=ms/i;
				break;
			}
		}
		return t;
	}
	//phan rut gon phan so nen tach thanh mot ham rieng
	
	public String toString() {
		//chua xet truong hop tu so bang 0 hoac mau so bang 1
		return ts+"/"+ms;
	}
	public static void main(String args[]) throws Exception {
		ps ps1 = new ps(2,4);
		ps ps2 = new ps(5,6);
		ps ps3 = new ps();
		ps3=ps1.add(ps2);
		System.out.println("Tong = "+ps3.ts+"/"+ps3.ms);}
		
}
