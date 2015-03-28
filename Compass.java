//FUNCIONAMIENTO DE SENSOR DE COMPAS HT
//INTELIROBOT ESCUELA DE ROBÓTICA SLP
//intelirobot.com.mx
import lejos.nxt.addon.*;
import lejos.nxt.*;

public class Compass
{

	public static void main(String[] args)
	{
	
		CompassHTSensor sensor = new CompassHTSensor(SensorPort.S2);
		sensor.resetCartesianZero();
	
		while(true)
		{
			
			LCD.drawInt(sensor.getDregrees(),1,1);
			LCD.drawInt(sensor.getDegreesCartesian(),1,3);		
			
		} 
				
	}

}