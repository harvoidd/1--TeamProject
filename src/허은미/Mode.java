package 허은미;

import java.util.Scanner;

public class Mode {
	private String mode;
	public void display() {
		Scanner input=new Scanner(System.in);
		int num;
		System.out.println("모드 설정을 담당");
		while(true) {
			System.out.println("1.현재 작동 모드 확인");
			System.out.println("2.자동 모드");
			System.out.println("3.수동 모드");
			System.out.println("4.나가기");
			System.out.println(">>> : ");
			num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println("현재 작동모드: "+mode);
				break;
			case 2:
				System.out.println("자동 모드 설정 완료");
				mode = "자동";
				break;
			case 3:
				System.out.println("수동 모드 설정 완료");
				mode="수동";
			case 4:
				System.out.println("이전으로 돌아감");
				return;
			}
		}
	}
}
