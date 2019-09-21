package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;


public class CCTalon extends WPI_TalonSRX
{
	// Whether or not this Talon is reversed
		private boolean _reverse;

		public CCTalon( int channel, boolean reverse )
		{
			super( channel );
			_reverse = reverse;
		}

		public void set( double speed )
		{
			// Sets the speed and reverses it as necessary by running the motor in the opposite direction
			if( _reverse )
			{
				super.set( -speed );
			}
			else
			{
				super.set( speed );
			}
		}
	
}
