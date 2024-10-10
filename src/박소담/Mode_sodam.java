package 박소담;

import java.util.Scanner;

public class Mode_sodam {
	
		private String 모드;
		
		public void display() {
			Scanner input = new Scanner(System.in);
			int num;
			String mode="없음";
			
			System.out.println("\n"+"제습&가습 설정 메뉴입니다.");
			
			while(true) {
				System.out.println("\n"+"1. 현재 모드 확인");
				System.out.println("2. 가습모드 변경");
				System.out.println("3. 제습모드 변경");
				System.out.println("4. 초기메뉴로 이동하기");
				System.out.print(">>> : ");
				num=input.nextInt();
				
				switch (num) {
				case 1: {
					if (mode.equals(null))
					System.out.println("현재 모드가 설정되어있지 않습니다."); 
					else System.out.println("현재 모드는 "+mode+"입니다.");
					continue;
				}
				case 2: 
				{
					if (mode.equals("가습모드"))
						System.out.println("이미 가습모드로 설정되어있습니다."); 
						else mode="가습모드";
						System.out.println(mode+"로 설정합니다.");
					continue;
				}
				case 3: 
				{
					if (mode.equals("제습모드"))
						System.out.println("이미 제습모드로 설정되어있습니다."); 
						else mode="제습모드";
						System.out.println(mode+"로 설정합니다.");
					continue;
				}
				case 4:
					System.out.println("초기 메뉴로 돌아갑니다."+"\n");
					return;
				}
				
				
				
				
				
				
				}
			}
		}




