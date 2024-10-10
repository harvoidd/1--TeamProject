package mainPackage;

import java.util.Scanner;
import 허은미.Mode;
import 박소담.Mode_sodam;

public class mainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NaWaterRid na = new NaWaterRid();
		Mode mo =new Mode();
		Mode_sodam sd = new Mode_sodam();
		// 전원
		// 제습 / 가습 설정
		// 습도 인식 및 세기 조절
		// 물통 교체 알람
		// 파워 모드, 절전모드, 수면모드 or 자동 수동

		boolean power = true;
		while (power) {

			System.out.println("[1] 제습&가습 설정");
			System.out.println("[2] 현재 습도 및 풍량");
			System.out.println("[3] 물통 교체");
			System.out.println("[4] 모드 설정");
			System.out.println("[5] 가동 종료");
			System.out.print(">>>");
			int menu = input.nextInt();

			switch (menu) {
			case 1: sd.display();
				// 제습&가습 설정 (박소담)

				break;
			case 2: // 습도 인식 및 세기 조절 (김영주)

				break;
			case 3:// 물통 교체 (나호영)
				na.lidwater(120);
				break;
			case 4:// 파워모드, 절전모드,수면모드 or 자동 수동 (허은미)
				mo.display();
				break;
			case 5: // 시작 및 종료(방준혁)

				break;
			default: // 다른 값 입력
				System.err.println("오류");
			}
		}
	}
}