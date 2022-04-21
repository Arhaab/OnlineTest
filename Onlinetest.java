
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Onlinetest extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;

    JLabel label;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton btnNext, btnBookmark;
    ButtonGroup bg;
    int count=0, current= 0, x=1, y=1, now=0;
    int m[]= new int[10];
 //Jframe with radioButton and JButton
    Onlinetest(String message){
        super(message);
        label=new JLabel();
        add(label);
        bg = new ButtonGroup();
        for(int i=0;i<5;i++);{
        int i=0;
        radioButton[i] = new JRadioButton();
        add(radioButton[i]);
        bg.add(radioButton[i]);
     }
     btnNext=new JButton("Next");
     btnBookmark=new JButton("Bookmark");
     btnNext.addActionListener(this);
     btnBookmark.addActionListener(this);
     add(btnNext);
     add(btnBookmark);
     set();
     label.setBounds(30, 40, 450, 20);
     radioButton[0].setBounds(50, 80, 100, 20);
     radioButton[1].setBounds(50, 110, 100, 20);
     radioButton[2].setBounds(50, 140, 100, 20);
     radioButton[3].setBounds(50, 170, 100, 20);
     btnNext.setBounds(100, 240,100, 30);
     btnBookmark.setBounds(270,240, 100, 30);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(null);
     setLocation(250,100);
     setVisible(true);
     setSize(600,350);
    } 
    // handle actions based on 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 9) {
				btnNext.setEnabled(false);
				btnBookmark.setText("Result");
			}
		}
		if (e.getActionCommand().equals("Bookmark")) {
			JButton bk = new JButton("Bookmark" + x);
			bk.setBounds(480, 20 + 30 * x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x] = current;
			x++;
			current++;
			set();
			if (current == 9)
				btnBookmark.setText("Result");
			setVisible(false);
			setVisible(true);
		}
        for (int i = 0, y = 1; i < x; i++, y++) {
			if (e.getActionCommand().equals("Bookmark" + y)) {
				if (check())
					count = count + 1;
				now = current;
				current = m[y];
				set();
				((JButton) e.getSource()).setEnabled(false);
				current = now;
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
    }
    void set(){
        radioButton[4].setSelected(true);
        if(current==0){
            label.setText("Q.1: Which of the following is not introduced with java 8?");
            radioButton[0].setText("Stream API");
            radioButton[1].setText("Serialization");
            radioButton[2].setText("Spliterator");
            radioButton[3].setText("lambda Expression");
        }
        if(current==1){
            label.setText("Q.2: What is the purpose of Booleansupplier function interface?");
            radioButton[0].setText("represents supplier of boolean-vaued results");
            radioButton[1].setText("returns boolean-valued results");
            radioButton[2].setText("There is no suuch function interface");
            radioButton[3].setText("returns null if Boolean is passed as argument");
        }
        if(current==2){
            label.setText("Q.3: what is the return type of lambda expression?");
            radioButton[0].setText("String");
            radioButton[1].setText("void");
            radioButton[2].setText("object");
            radioButton[3].setText("function");
        }
        if(current==3){
            label.setText("Q.4: What is the new method introdueced in java 8 to iterate over a collection?");
            radioButton[0].setText("for(String i:StringList)");
            radioButton[1].setText("foreach(String i:StringList)");
            radioButton[2].setText("StringList.foreach()");
            radioButton[3].setText("List.for()");
        }
        if(current==4){
            label.setText("Q.5: What is the new method introdueced in java 8 to iterate over a collection?");
            radioButton[0].setText("for(String i:StringList)");
            radioButton[1].setText("foreach(String i:StringList)");
            radioButton[2].setText("StringList.foreach()");
            radioButton[3].setText("List.for()");
        }
        if(current==5){
            label.setText("Q.6: What is the new method introdueced in java 8 to iterate over a collection?");
            radioButton[0].setText("for(String i:StringList)");
            radioButton[1].setText("foreach(String i:StringList)");
            radioButton[2].setText("StringList.foreach()");
            radioButton[3].setText("List.for()");
        }
        if(current==6){
            label.setText("Q.7: What is the new method introdueced in java 8 to iterate over a collection?");
            radioButton[0].setText("for(String i:StringList)");
            radioButton[1].setText("foreach(String i:StringList)");
            radioButton[2].setText("StringList.foreach()");
            radioButton[3].setText("List.for()");
        }
        if(current==7){
            label.setText("Q.8: What is the new method introdueced in java 8 to iterate over a collection?");
            radioButton[0].setText("for(String i:StringList)");
            radioButton[1].setText("foreach(String i:StringList)");
            radioButton[2].setText("StringList.foreach()");
            radioButton[3].setText("List.for()");
        }
        if(current==8){
            label.setText("Q.9: What is the new method introdueced in java 8 to iterate over a collection?");
            radioButton[0].setText("for(String i:StringList)");
            radioButton[1].setText("foreach(String i:StringList)");
            radioButton[2].setText("StringList.foreach()");
            radioButton[3].setText("List.for()");
        }
        if(current==9){
            label.setText("Q.10: What is the new method introdueced in java 8 to iterate over a collection?");
            radioButton[0].setText("for(String i:StringList)");
            radioButton[1].setText("foreach(String i:StringList)");
            radioButton[2].setText("StringList.foreach()");
            radioButton[3].setText("List.for()");
        }
        label.setBounds(30, 40, 450, 20);
        for(int i=0; i<=90;i+=30);
        int i=0;
        int j=0;
        radioButton[j].setBounds(50, 80 + i, 200, 20);
    }
    boolean check() {
        if(current==0)
        return(radioButton[1].isSelected());
        if(current==1)
        return(radioButton[1].isSelected());
        if(current==2)
        return(radioButton[0].isSelected());
        if(current==3)
        return(radioButton[2].isSelected());
        if(current==4)
        return(radioButton[0].isSelected());
        if(current==5)
        return(radioButton[0].isSelected());
        if(current==6)
        return(radioButton[1].isSelected());
        if(current==7)
        return(radioButton[2].isSelected());
        if(current==8)
        return(radioButton[0].isSelected());
        if(current==9)
        return(radioButton[0].isSelected());
        return false;

    }
    
    public static void main(String[] args){
        new Onlinetest("Online Test App");

    }
}
