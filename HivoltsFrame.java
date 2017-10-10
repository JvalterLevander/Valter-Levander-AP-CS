package gropuHivolts;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HivoltsFrame extends Main implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HivoltsFrame() {
		setFocusable(true);
	    addKeyListener(this);
	}
	
	// Movement implementation using A, S, D, W, Q, E, Z, C
	@Override
	public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode() == KeyEvent.VK_D ) {
	    		// D key code
	    		posX += 1;
	    		System.out.println("PRESSED D");
	    } else if (e.getKeyCode() == KeyEvent.VK_A ) {
	        //A key code
	    		posX -= 1;
	    } else if (e.getKeyCode() == KeyEvent.VK_W ) {
	        //W code
	    		posY -= 1;
	    } else if (e.getKeyCode() == KeyEvent.VK_S ) {
	        //S key code
	    		posY += 1;
	    } else if (e.getKeyCode() == KeyEvent.VK_Q) {
	    		//Q key code
	    		posX -= 1;
	    		posY -= 1;
	    }
	    else if (e.getKeyCode() == KeyEvent.VK_E) {
	    		//E key code
	    		posX += 1;
	    		posY -= 1;
	    }
	    else if (e.getKeyCode() == KeyEvent.VK_Z) {
	    		//Z key code
	    		posX -= 1;
	    		posY += 1;
	    }
	    else if (e.getKeyCode() == KeyEvent.VK_C) {
	    		//C key code
	    		posX -= 1;
	    		posY += 1;
	    }
	    	else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			//SPACE key code
	    	}	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
