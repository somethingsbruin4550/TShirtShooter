package frc.robot;

import edu.wpi.first.wpilibj.Talon;

/**
 * CCTalon was created to allow the reversal of a talon output. Talon.setInverted() can now be used instead
 * @deprecated
 */
public class CCTalon extends Talon
{
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