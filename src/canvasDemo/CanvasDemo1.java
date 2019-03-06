package canvasDemo;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.util.Vector;
public class CanvasDemo1 {
	public static void main(String []a) {
		Frame frame= new Frame("Java AWT Frame Demo");
		frame.setSize(500,500);
		frame.setVisible(true);
		Vector v= new Vector();
		for(int i=0;i<=10;i++) {
			v.addElement(i);
			Label l= new Label();
			 l.setAlignment(Label.CENTER);
		     l.setSize(350,100);
		}
		
		
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowIconified()::::");
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowDeiconified()::::::");
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowDeactivated()::::");
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Thanks For Opening Application");
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowClosed():::::");
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("windowsActivated():::::");
			}
		});
		
	}
}
