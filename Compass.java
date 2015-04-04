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
		int orientacion;
	
		CompassHTSensor sensor = new CompassHTSensor(SensorPort.S3);
		sensor.resetCartesianZero();
	
		while (true)
		{
			LCD.clearDisplay();
			LCD.drawInt((int)sensor.getDegreesCartesian(),1,1);
			Delay.msDelay(100);			
			orientacion=(int)sensor.getDegreesCartesian();
			if (sensor.getDegreesCartesian() > 30 && sensor.getDegreesCartesian()<330 )
			{
				if(sensor.getDegreesCartesian() >= 180)
				{
				  Motor.A.setSpeed(800);
				Motor.B.setSpeed(800);
				Motor.A.backward();
				Motor.B.backward();	
				}
				else
				{
				   Motor.A.setSpeed(800);
				Motor.B.setSpeed(800);
				Motor.A.forward();
				Motor.B.forward();		
				}

			}
			
		else
		{
			Motor.A.stop();
			Motor.B.stop();
		}
	 }
	}

}