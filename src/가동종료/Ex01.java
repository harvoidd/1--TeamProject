package 가동종료;

import java.util.Scanner;

public class Ex01 {
	private boolean power;
	private int num;
	public boolean 전원() {
		Scanner input = new Scanner(System.in);
		System.out.println("1.전원 켜기");
		System.out.println("2.전원 꺼두기");
		num = input.nextInt();
		switch (num) {
		case 1:
			power = true;
			break;
		case 2:
			power = false;
			break;
		}
		return power;
	}
}
