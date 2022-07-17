package Main;

import ManagePizza.GUI.LoginGUI;

public class Main {

    public static void main(String[] args) {
        
        changeLNF("Nimbus");
        LoginGUI login = new LoginGUI();
        login.showWindow();
    }
    
    public static void changeLNF(String nameLNF){
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if(nameLNF.equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex){
            
        }
    }
}
