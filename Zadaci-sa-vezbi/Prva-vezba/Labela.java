package labela1;

import java.awt.*;
import java.awt.event.*;
public class Labela1 {

    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    
    //Konstruktor 
    public Labela1(){
        prepareGUI();
    }
    
    public static void main(String[] args) {
        Labela1 awtLabelControl = new Labela1();
        awtLabelControl.showLabelDemo();
    }
    
    private void prepareGUI(){
        //MainFrame 
        mainFrame = new Frame("Java AWT Vezba 1");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        
        //Listener za MainFrame
        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        //Header Labela
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        
        //Status Labela
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);
        
        //Control Panel
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        
        //Dodavanje labela i panela na MainFrame
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    
    private void showLabelDemo(){
        headerLabel.setText("Ovo je jedna Label kontrola!");
        Label label = new Label();
        label.setText("Evo mene, eto vas ... Rece jedan nas velikan.");
        label.setAlignment(Label.CENTER);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);
        controlPanel.add(label);
        mainFrame.setVisible(true);
    }
}
