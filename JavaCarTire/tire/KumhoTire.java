package tire;

public class KumhoTire extends Tire{
	//필드 생성자
	public KumhoTire(String location, int maxRatation) {
		super(location, maxRatation);
	}
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+ "KumhoTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" KumhoTire 펑크 ***");
			 return false;
		}
	}
}
