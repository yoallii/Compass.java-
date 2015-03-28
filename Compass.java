import lejos.nxt.addon.*;
import lejos.nxt.*;

public class Compass
{
	public static void main(String[] args)
	{
			Compass sensor=new Compass sensor(SensorPort.S2);
			sensor.resetCartesianZero();
			while(true){
				LCD.drawInt(sensor.getDregrees(),1,1);
				LCD.drawInt(sensor.getDegreesCartesian(),1,3);		
			} 
				
	}

}