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
			
			LCD.drawInt(1,1, sensor.getDregrees());
			LCD.drawInt(1,3, sensor.getDegreesCartesian());		
			
		} 
				
	}

}