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
		
			LCD.drawInt((int)sensor.getDegreesCartesian(),1,1);
			LCD.drawInt((int)sensor.getDegreesCartesian(),1,3);

			if (sensor == 0)
			{
			
				Motor.A.setSpeed(900);
				Motor.A.forward();
				Motor.C.setSpeed(900);
				Motor.C.forward();

			}

			if (sensor >= 0)
			{

				Motor.A.setSpeed(450);
				Motor.A.backward();
				Motor.C.setSpeed(450);
				Motor.C.forward();

			}

			if (sensor <= 0)
			{

				Motor.C.setSpeed(450);
				Motor.C.forward();
				Motor.A.setSpeed(450);
				Motor.A.backward();

			}
			
		} 
				
	}

}