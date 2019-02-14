package SliderAWT;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class myImage extends JFrame  implements ActionListener
{

ImageIcon m[];
JLabel l;
JButton b,b1;
int i,l1;
JPanel p;
int prevState;
public myImage()
{
	prevState=0; //0 For Left Rotation and 1 for right Rotation
   setLayout(new BorderLayout( ));
   setSize(1366, 720);
   setVisible(true);
   JPanel p=new JPanel(new FlowLayout());
   b=new JButton("Pre");
   b1=new JButton("Next");
   p.add(b);
   p.add(b1);
   add(p,BorderLayout.SOUTH);
   b.addActionListener(this);
   b1.addActionListener(this);
  
   System.out.println("Hello");
   m = new ImageIcon[3];
   m[0] = new ImageIcon("C:\\Users\\vivek.kumar\\Documents\\Codebase\\College\\CollegeProjects\\src\\SliderAWT\\img4.jpg");
   m[1] = new ImageIcon("C:\\Users\\vivek.kumar\\Documents\\Codebase\\College\\CollegeProjects\\src\\SliderAWT\\img5.jpg");
   m[2] = new ImageIcon("C:\\Users\\vivek.kumar\\Documents\\Codebase\\College\\CollegeProjects\\src\\SliderAWT\\img6.jpg");
   System.out.println("Hello");
   l = new JLabel();
   l.setBounds(400, 0, getWidth(), getHeight());
   add(l,BorderLayout.CENTER);
   l.setIcon(m[0]);

}

public  void actionPerformed(ActionEvent e)
{
	int pos;
	//i=Math.abs(i);
	
	if(e.getSource()==b) {
		System.out.println("Before Abs"+i);
		if(i<0) {
			i=Math.abs(i)*m.length;
			System.out.println("After abs ="+i);
			l.setIcon(m[i]);
			
		}else {
		pos=i%m.length;
		l.setIcon(m[pos]);
		i--;
		}
		}
	else if(e.getSource()==b1) {
			pos=i%m.length;
			l.setIcon(m[pos]);
			i++;
		}
		/*
		 * if(m.length<i) {
		 * 
		 * System.out.println("Overflow"); return; }
		 * 
		 * System.out.println("Value of i="+i); if(e.getSource()==b && m.length>i ) {
		 * 
		 * if(i==0) {
		 * 
		 * System.out.println("This is the First Image"); i=m.length-1; prevState=1;
		 * l.setIcon(m[i]); } else { i--; l.setIcon(m[i]); }
		 * 
		 * } if(e.getSource()==b1 && m.length>i) { if(i==m.length-1) {
		 * System.out.println("This is the Last Image"); i=0; l.setIcon(m[i]); } else {
		 * i=i+1; l.setIcon(m[i]); } }
		 */
  }


public static void main(String args[])
{
   myImage i1 = new myImage();
}


}
