package ManagePizza.GUI;

import javax.swing.*;
import java.awt.*;

public class LoginGUI extends JFrame{
    public LoginGUI(){
        this.setTitle("Đăng nhập");
        this.setSize(440, 624);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
       
    }
    public void showWindow(){
        Image icon = Toolkit.getDefaultToolkit().getImage("image/ManagerUI/icon-app.png");
        this.setIconImage(icon);
        this.setVisible(true);
    }
}
