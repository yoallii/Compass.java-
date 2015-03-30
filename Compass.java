//FUNCIONAMIENTO DE SENSOR DE COMPAS HT
//INTELIROBOT ESCUELA DE ROBÓTICA SLP
//intelirobot.com.mx
import lejos.nxt.addon.*;
import lejos.nxt.*;
import lejos.util.*;
public class Compass
{

	public static void main(String[] args)
	{
		CompassHTSensor sensor = new CompassHTSensor(SensorPort.S2);
		sensor.resetCartesianZero();
	
		while(true)
		{
		
			LCD.clearDisplay();
			LCD.drawInt((int)sensor.getDegreesCartesian(),1,1);
			Delay.msDelay(100);			

			
		if(sensor.getDegreesCartesian()<30)
			{
			//m.frontAbackB(800);
			}
		if(sensor.getDegreesCartesian()>120)
		{
			//m.avanzarAC(800);
		}

		}	
	}

}