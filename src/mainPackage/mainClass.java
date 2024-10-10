package mainPackage;

import KimYoungJu.humditiyClass;
import java.util.Scanner;
import 가동종료.Ex01;
import 박소담.Mode_sodam;
import 허은미.Mode;


public class mainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NaWaterRid na = new NaWaterRid();
		Mode mo =new Mode();
		Mode_sodam sd = new Mode_sodam();
		Ex01 e = new Ex01();
		humditiyClass h=new humditiyClass();
		// 전원
		// 제습 / 가습 설정
		// 습도 인식 및 세기 조절
		// 물통 교체 알람
		// 파워 모드, 절전모드, 수면모드 or 자동 수동

		boolean power=true;
		while (true) {
			power = e.전원();
			while (power) {

				System.out.println("[1] 제습&가습 설정");
				System.out.println("[2] 현재 습도 및 풍량");
				System.out.println("[3] 물통 교체");
				System.out.println("[4] 모드 설정");
				System.out.println("[5] 가동 종료");
				System.out.print(">>>");
				int menu = input.nextInt();
				
			switch (menu) {
			case 1: sd.display(); // 제습&가습 설정 (박소담)
					break;
				case 2: // 습도 인식 및 세기 조절 (김영주)
					System.out.println(String.format("현재의 습도에 맞춰 %d단계로 조절합니다.",h.SetWindPower()));
					
					break;
				case 3:// 물통 교체 (나호영)
					na.lidwater(120);
					break;
				case 4:// 파워모드, 절전모드,수면모드 or 자동 수동 (허은미)
					mo.display();
					break;
				case 5: // 시작 및 종료(방준혁)
					power = false;
					break;
				default: // 다른 값 입력
					System.err.println("오류");

				}
			}
		}
	}}
