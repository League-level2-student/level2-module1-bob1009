package intro_to_array_lists;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class GuestBook implements ActionListener {
	JFrame frame=new JFrame();
	JButton button=new JButton();
	JButton button2=new JButton();
	JPanel panel=new JPanel();
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
	GuestBook names2=new GuestBook();
	}
	GuestBook(){
		frame.setSize(500, 500);
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		button.setText("add person");
		button2.setText("view list");
		frame.setVisible(true);
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			String choser=JOptionPane.showInputDialog("write down someones name for your awesome party");
			names.add(choser);
		}
		if (e.getSource()==button2) {
			String list="";
			for (int i = 0; i < names.size(); i++) {
				list+="geust "+i+" :"+names.get(i)+"\n";
				
			}
			JOptionPane.showMessageDialog(null," "+list);
			
		}
	}
}
// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners