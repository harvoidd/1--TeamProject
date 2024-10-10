package KimYoungJu;

import java.util.Random;

public class humditiyClass {
    Random ran=new Random();

	private int hum,level;

    public int getHum(){ //습도 표시
        hum=ran.nextInt(80);
        return hum;
    }
    public int SetWindPower(){
        level=(int)getHum()/10;
        return level;
    }

}
