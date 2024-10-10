package mainPackage;

import java.util.Scanner;

public class NaWaterRid {
	private int water;
	private int limitwater;

	public int getLimitwater() {
		return limitwater;
	}

	public void setLimitwater(int limitwater) {
		this.limitwater = limitwater;
	}

	public int getWater() {
		return water;
	}	
	
	Scanner sc = new Scanner(System.in);
	public void lidwater(int water) {
		System.out.print("물통 최대치 입력 : ");
		this.setLimitwater(sc.nextInt());
		if(this.getWater()>=this.getLimitwater()) 
			System.out.println("물통이 가득 찼습니다. 물통을 비워주세요");
		
		else {
			System.out.println("물통 남은 양 : " + (this.getLimitwater()-this.getWater()));
		}
	}
}