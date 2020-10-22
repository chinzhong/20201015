import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrame extends JFrame{
    private Container CP;
    private JButton jbtn11 = new JButton();
    private JButton jbtn12 = new JButton();
    private JButton jbtn13 = new JButton();
    private JButton jbtn21 = new JButton();
    private JButton jbtn22 = new JButton();
    private JButton jbtn23 = new JButton();
    private JButton jbtn31 = new JButton();
    private JButton jbtn32 = new JButton();
    private JButton jbtn33 = new JButton();
    private JButton jbtnReset = new JButton("Reset");
    private JButton jbtnGo = new JButton("Go");
    private JButton jbtnExit = new JButton("Exit");
    //private JLabel jlb = new JLabel("0");
    private int counts = 1;
    int x = 1;
    int y = 0; 
    public MainFrame(){
        init();
    }
    private void init(){
        CP = this.getContentPane();
        CP.setLayout(new GridLayout(4,3,3,3));
        this.setBounds(100,100,500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(jbtn11);
        this.add(jbtn12);
        this.add(jbtn13);
        this.add(jbtn21);
        this.add(jbtn22);
        this.add(jbtn23);
        this.add(jbtn31);
        this.add(jbtn32);
        this.add(jbtn33);
        this.add(jbtnReset);
        this.add(jbtnGo);
        this.add(jbtnExit);
        jbtn11.setEnabled(false);
        jbtn12.setEnabled(false);
        jbtn13.setEnabled(false);
        jbtn21.setEnabled(false);
        jbtn22.setEnabled(false);
        jbtn23.setEnabled(false);
        jbtn31.setEnabled(false);
        jbtn32.setEnabled(false);
        jbtn33.setEnabled(false);
        jbtn11.setFont(new Font(null,Font.BOLD,80));
        jbtn12.setFont(new Font(null,Font.BOLD,80));
        jbtn13.setFont(new Font(null,Font.BOLD,80));
        jbtn21.setFont(new Font(null,Font.BOLD,80));
        jbtn22.setFont(new Font(null,Font.BOLD,80));
        jbtn23.setFont(new Font(null,Font.BOLD,80));
        jbtn31.setFont(new Font(null,Font.BOLD,80));
        jbtn32.setFont(new Font(null,Font.BOLD,80));
        jbtn33.setFont(new Font(null,Font.BOLD,80));
        jbtn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn11.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn11.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }
            }
        });
        jbtn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn12.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn12.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }
            }
        });
        jbtn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn13.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{               
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn13.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }
            }
        });
        jbtn21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn21.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn21.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }
            }
        });
        jbtn22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn22.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn22.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }
            }
        });
        jbtn23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn23.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn23.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }
            }
        });
        jbtn31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn31.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn31.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }       
            }
        });
        jbtn32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn32.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn32.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }
            }
        });
        jbtn33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (counts == x){                    
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("O");
                    jbtn33.setEnabled(false);
                    test();
                    x = x + 2;
                    counts ++;
                }else{
                    JButton tmpbtn = (JButton) e.getSource();
                    tmpbtn.setText("X");
                    jbtn33.setEnabled(false);
                    test();
                    y++;
                    counts ++;
                }
            }
        });
        jbtnReset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jbtn11.setText("");
                jbtn12.setText("");
                jbtn13.setText("");
                jbtn21.setText("");
                jbtn22.setText("");
                jbtn23.setText("");
                jbtn31.setText("");
                jbtn32.setText("");
                jbtn33.setText("");
                jbtn11.setEnabled(false);
                jbtn12.setEnabled(false);
                jbtn13.setEnabled(false);
                jbtn21.setEnabled(false);
                jbtn22.setEnabled(false);
                jbtn23.setEnabled(false);
                jbtn31.setEnabled(false);
                jbtn32.setEnabled(false);
                jbtn33.setEnabled(false);
            }
        });
        jbtnGo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jbtn11.setEnabled(true);
                jbtn12.setEnabled(true);
                jbtn13.setEnabled(true);
                jbtn21.setEnabled(true);
                jbtn22.setEnabled(true);
                jbtn23.setEnabled(true);
                jbtn31.setEnabled(true);
                jbtn32.setEnabled(true);
                jbtn33.setEnabled(true);
            }
        });
        jbtnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
    private void test(){
        if(jbtn11.getText().equals(jbtn12.getText()) && jbtn11.getText().equals(jbtn13.getText())){
            if(jbtn11.getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Play1 Win");
            }
        }
        if(jbtn11.getText().equals(jbtn12.getText()) && jbtn11.getText().equals(jbtn13.getText())){
            if(jbtn11.getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Play2 Win");
            }
        }
        if(jbtn21.getText().equals(jbtn22.getText()) && jbtn21.getText().equals(jbtn23.getText())){
            if(jbtn21.getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Play1 Win");
            }
        }
        if(jbtn21.getText().equals(jbtn22.getText()) && jbtn21.getText().equals(jbtn23.getText())){
            if(jbtn21.getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Play2 Win");
            }
        }
        if(jbtn31.getText().equals(jbtn32.getText()) && jbtn31.getText().equals(jbtn33.getText())){
            if(jbtn31.getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Play1 Win");
            }
        }
        if(jbtn31.getText().equals(jbtn32.getText()) && jbtn31.getText().equals(jbtn33.getText())){
            if(jbtn31.getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Play2 Win");
            }
        }
        if(jbtn11.getText().equals(jbtn21.getText()) && jbtn11.getText().equals(jbtn31.getText())){
            if(jbtn11.getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Play1 Win");
            }
        }
        if(jbtn11.getText().equals(jbtn21.getText()) && jbtn11.getText().equals(jbtn31.getText())){
            if(jbtn11.getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Play2 Win");
            }
        }
        if(jbtn12.getText().equals(jbtn22.getText()) && jbtn12.getText().equals(jbtn32.getText())){
            if(jbtn12.getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Play1 Win");
            }
        }
        if(jbtn12.getText().equals(jbtn22.getText()) && jbtn12.getText().equals(jbtn32.getText())){
            if(jbtn12.getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Play2 Win");
            }
        }
        if(jbtn13.getText().equals(jbtn23.getText()) && jbtn13.getText().equals(jbtn33.getText())){
            if(jbtn13.getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Play1 Win");
            }
        }
        if(jbtn13.getText().equals(jbtn23.getText()) && jbtn13.getText().equals(jbtn33.getText())){
            if(jbtn13.getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Play2 Win");
            }
        }
        if(jbtn11.getText().equals(jbtn22.getText()) && jbtn11.getText().equals(jbtn33.getText())){
            if(jbtn11.getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Play1 Win");
            }
        }
        if(jbtn11.getText().equals(jbtn22.getText()) && jbtn11.getText().equals(jbtn33.getText())){
            if(jbtn11.getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Play2 Win");
            }
        }
        if(jbtn13.getText().equals(jbtn22.getText()) && jbtn13.getText().equals(jbtn31.getText())){
            if(jbtn13.getText().equals("O")){
                JOptionPane.showMessageDialog(null,"Play1 Win");
            }
        }
        if(jbtn13.getText().equals(jbtn22.getText()) && jbtn13.getText().equals(jbtn31.getText())){
            if(jbtn13.getText().equals("X")){
                JOptionPane.showMessageDialog(null,"Play2 Win");
            }
        }
    }
}