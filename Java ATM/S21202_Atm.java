package S21202_java00;
import java.util.Scanner;

// Atm 클래스 정의
class Atm{
	int in; // 입금액 변수
	int out; // 출금액 변수
	int aPrice =0; // A 계좌 잔액 변수 초기화
	int bPrice =0; // B 계좌 잔액 변수 초기화

	// A 계좌 입금 메서드
	void add1(int in) {
		this.in = in;
		aPrice = aPrice + this.in;
	}

	// B 계좌 입금 메서드
	void add2(int in) {
		this.in =in;
		bPrice = bPrice + this.in;
	}

	// A 계좌 출금 메서드
	void sub1(int out) {
		this.out = out;
		aPrice = aPrice - this.out;
	}

	// B 계좌 출금 메서드
	void sub2(int out) {
		this.out = out;
		bPrice = bPrice - this.out;
	}
}

public class S21202_Atm {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Atm a = new Atm(); // A 계좌 객체 생성
		Atm b = new Atm(); // B 계좌 객체 생성

		while(true) {
			System.out.println("메뉴 선택 : 1.입금 2.출금 9.종료");
			int i =sc.nextInt();

			if(i==1) {
				System.out.println("계좌선택 : 전메뉴=0 A=1 B=2 종료=9");
				int j = sc.nextInt();

				if(j==0) {
					continue;
				}else if(j==1) {
					System.out.println("금액입력");
					a.add1(sc.nextInt());
				}else if(j==2) {
					System.out.println("금액입력");
					b.add2(sc.nextInt());
				}else if(j == 9) {
					System.out.println("이용해 주셔서 고맙습니다^^");
					break;
				}
			}else if(i==2) {
				System.out.println("계좌선택 : 전메뉴=0 A=1 B=2 종료=9");
				int j = sc.nextInt();

				if(j==0) {
					continue;
				}else if(j==1) {
					System.out.println("금액입력");
					a.sub1(sc.nextInt());
				}else if(j==2) {
					System.out.println("금액입력");
					b.sub2(sc.nextInt());
				}else if(j == 9) {
					System.out.println("이용해 주셔서 고맙습니다^^");
					break;
				}
			}else if(i == 9) {
				System.out.println("이용해 주셔서 고맙습니다^^");
				break;
			}

			System.out.println("A잔액:"+a.aPrice);
			System.out.println("B잔액:"+b.bPrice);
		}	
	}
}
