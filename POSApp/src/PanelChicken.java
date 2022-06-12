import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;




public class PanelChicken extends JPanel {

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	private final JPanel panel = new JPanel();
	
	public PanelChicken() throws ClassNotFoundException, SQLException {
		
		setBackground(Color.LIGHT_GRAY);
		setBounds(0,0,652,397);
		setLayout(null);
		panel.setBounds(0, 0, 652, 397);
		add(panel);
		
		DatabaseQuery db=new DatabaseQuery();
		int count=db.ConnectionCount("CHICKEN");
		
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
	
	ArrayList<String> name=new ArrayList<>();;

		for(int i=0;i<count;i++) {
			
			
			buttons.add(new JButton());
			name.add(db.MenuName("CHICKEN").get(i));
		
		
		
		}
		
		
		panel.setLayout(new GridLayout(3,3));
		JButton b=new JButton();
		ArrayList<String> nameCollection=new ArrayList<String>();
		String name1="";
		int initialcount=0;
		
		while(initialcount<count) {
			name1=db.MenuName("CHICKEN").get(initialcount);
			
			
			System.out.println(name1);
		
			nameCollection.add(name1);
	
		
			
		
			
			initialcount++;
	
	}
		
		int i=0;
		for(JButton button:buttons) {
			
			
			
			button.setText(String.valueOf(nameCollection.get(i)));
			panel.add(button);
			
			i++;
		}
		
		
		
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		
		
		
		
	}

}