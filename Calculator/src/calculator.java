import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class calculator {
    
    private JFrame frame = new JFrame("Calculator");
    
    private JTextArea txtScreen = new JTextArea();

    String strNum1="";
    String strNum2="";
    
    String[] statement;
    
    int num1=0;
    int num2=0;
    int total=0;
    
    String strTotal;

    
    private JButton btn0 = new JButton("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");
    
    private JButton btnadd = new JButton("+");
    private JButton btnsub = new JButton("-");
    private JButton btndiv = new JButton("/");
    private JButton btnmul = new JButton("X");
    
    private JButton btnequ = new JButton("=");
    
    
    public calculator(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,550);
        frame.setResizable(false);
        frame.setLayout(null);
        
        
        txtScreen.setSize(380,100);
        txtScreen.setLocation(7,5);
        txtScreen.setEditable(false);
        
        btn0.setSize(90,50);
        btn0.setLocation(105,460);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("0");
            }
        });
        
        
        btn1.setSize(90,50);
        btn1.setLocation(10,395);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("1");
            }
        });
        
        btn2.setSize(90,50);
        btn2.setLocation(105,395);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("2");
            }
        });
        
        btn3.setSize(90,50);
        btn3.setLocation(200,395);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("3");
            }
        });
        
        btn4.setSize(90,50);
        btn4.setLocation(10,325);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("4");
            }
        });
        
        btn5.setSize(90,50);
        btn5.setLocation(105,325);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("5");
            }
        });
        
        btn6.setSize(90,50);
        btn6.setLocation(200,325);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("6");
            }
        });
        
        
        btn7.setSize(90,50);
        btn7.setLocation(10,250);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("7");
            }
        });
        
        btn8.setSize(90,50);
        btn8.setLocation(105,250);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("8");
            }
        });
        
        btn9.setSize(90,50);
        btn9.setLocation(200,250);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("9");
            }
        });
        
        btndiv.setSize(70,60);
        btndiv.setLocation(310,180);
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("/");
            }
        });
        
        btnmul.setSize(70,60);
        btnmul.setLocation(310,250);
        btnmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("X");
            }
        });
        
        btnadd.setSize(70,60);
        btnadd.setLocation(310,320);
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("+");
            }
        });
        
        btnsub.setSize(70,60);
        btnsub.setLocation(310,390);
        btnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("-");
            }
        });
        
        btnequ.setSize(70,60);
        btnequ.setLocation(310,460);
        btnequ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtScreen.getText().contains("+")){
                    statement=txtScreen.getText().split("\\+");
                    
                    strNum1=statement[0];
                    strNum2=statement[1];
                    
                    num1=Integer.parseInt(strNum1);
                    num2=Integer.parseInt(strNum2);
                    
                    total=num1+num2;
                    
                    strTotal=Integer.toString(total);
                    
                    txtScreen.setText(strTotal);
                }else if(txtScreen.getText().contains("-")){
                    statement=txtScreen.getText().split("\\-");
                    
                    strNum1=statement[0];
                    strNum2=statement[1];
                    
                    num1=Integer.parseInt(strNum1);
                    num2=Integer.parseInt(strNum2);
                    
                    total=num1-num2;
                    
                    strTotal=Integer.toString(total);
                    
                    txtScreen.setText(strTotal);
                }else if(txtScreen.getText().contains("/")){
                    statement=txtScreen.getText().split("\\/");
                    
                    strNum1=statement[0];
                    strNum2=statement[1];
                    
                    num1=Integer.parseInt(strNum1);
                    num2=Integer.parseInt(strNum2);
                    
                    try{
                        total=num1/num2;
                        strTotal=Integer.toString(total);
                        txtScreen.setText(strTotal);
                        
                    }catch(Exception a){
                        txtScreen.setText("Error");
                    }
                }else if(txtScreen.getText().contains("X")){
                    statement=txtScreen.getText().split("X");
                    
                    strNum1=statement[0];
                    strNum2=statement[1];
                    
                    num1=Integer.parseInt(strNum1);
                    num2=Integer.parseInt(strNum2);
                    
                    total=num1*num2;
                    
                    strTotal=Integer.toString(total);
                    
                    txtScreen.setText(strTotal);
                }
            }
        });
        
        frame.add(txtScreen);
        frame.add(btn0);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        
        frame.add(btnadd);
        frame.add(btnsub);
        frame.add(btndiv);
        frame.add(btnmul);
        
        frame.add(btnequ);
        
        
    }
    
    public static void main(String[] args) {
        new calculator();
    }
}
