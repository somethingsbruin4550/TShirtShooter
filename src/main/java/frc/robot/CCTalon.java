package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;


public class CCTalon extends WPI_TalonSRX
{
	// Whether or not this Talon is reversed
		// private boolean _reverse;

		public CCTalon( int channel, boolean reverse )
		{
			super( channel );
			super.setInverted(reverse);
		}

		public void set( double speed )
		{
			super.set(speed);
		}
	
}