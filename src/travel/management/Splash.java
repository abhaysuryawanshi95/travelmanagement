
package travel.management;

import javax.swing.*;

public class Splash extends JFrame{

    public Splash() {
        
        setSize(1200, 600);
        setLocation(200, 100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/icons/splash.jpg"));
        JLabel image = new JLabel(i1);
        add(image);
        
        setVisible(true);
    }
     
    public static void main(String[] args){
        new Splash();
    }
    
}
