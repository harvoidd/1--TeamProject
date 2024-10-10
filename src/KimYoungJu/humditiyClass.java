package KimYoungJu;

import java.util.Random;

public class humditiyClass {
    Random ran=new Random();

	private int hum,humPower,level,inputHum;

    public int getHum(){ //습도표시
        hum=ran.nextInt(80);
        return hum;
    }
    public int SetWindPower(int level){
        this.level=level;
        return level;
    }

}
