
import acm.graphics.*;
import acm.program.*;

public class Ejemplo1 extends GraphicsProgram {

	private static final int ANCHO_LADRILLO = 30;
	private static final int ALTO_LADRILLO = 12;
	private static final int LADRILLOS_BASE = 14;

	private static final int ALTO_PIRAMIDE = LADRILLOS_BASE * ALTO_LADRILLO;

	int basePiramide = LADRILLOS_BASE * ANCHO_LADRILLO;
	
	
	
	public void run(){

		setSize(800, 800);
		
		
		for(int j=0; j<LADRILLOS_BASE; j++){


			for(int i=0; i<LADRILLOS_BASE-j; i++){
				GRect ladrillo = new GRect(ANCHO_LADRILLO, ALTO_LADRILLO);

				add (ladrillo,(getWidth()/2 - basePiramide/2 + ANCHO_LADRILLO*j/2 + ANCHO_LADRILLO * i), (getHeight() - ALTO_LADRILLO - ALTO_LADRILLO*j)-1);
			}

			pause (30);





		}		

	}

}
