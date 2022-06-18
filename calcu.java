package cycle6;
import javax.swing.*;
import java.awt.event.*;
public class calcu implements ActionListener{
    static double a=0,b=0,result;
    static int op=0;
    JFrame f;
    JTextField t;
    //JPanel p;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq,bclr,bdec;
    calcu(){
        f=new JFrame("Simple Calculator");
        t=new JTextField();

         b1=new JButton("1");
         b2=new JButton("2");
         b3=new JButton("3");
         b4=new JButton("4");
         b5=new JButton("5");
         b6=new JButton("6");
         b7=new JButton("7");
         b8=new JButton("8");
         b9=new JButton("9");
         b0=new JButton("0");
         badd=new JButton("+");
         bsub=new JButton("-");
         bmul=new JButton("*");
         bdiv=new JButton("/");
         beq=new JButton("=");
         bclr=new JButton("C");
         bdec=new JButton(".");

        t.setBounds(60,40,350,30);
        b7.setBounds(60,100,60,40);
        b8.setBounds(160,100,60,40);
        b9.setBounds(260,100,60,40);
        bdiv.setBounds(360,100,60,40);
        b4.setBounds(60,160,60,40);
        b5.setBounds(160,160,60,40);
        b6.setBounds(260,160,60,40);
        bmul.setBounds(360,160,60,40);
        b1.setBounds(60,220,60,40);
        b2.setBounds(160,220,60,40);
        b3.setBounds(260,220,60,40);
        bsub.setBounds(360,220,60,40);
        b0.setBounds(60,280,60,40);
        bdec.setBounds(160,280,60,40);
        badd.setBounds(260,280,60,40);
        beq.setBounds(360,280,60,40);
        bclr.setBounds(200,340,100,40);

        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(b0);
        f.add(bdec);
        f.add(badd);
        f.add(beq);
        f.add(bclr);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);
        bdec.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            t.setText(t.getText().concat("1"));
        }
        if(e.getSource()==b2){
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3){
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4){
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5){
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6){
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7){
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8){
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9){
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0){
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==bdec){
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==badd){
            //t.setText(t.getText().concat("+"));
            a=Double.parseDouble(t.getText());
            op=1;
            t.setText("");
        }
        if(e.getSource()==bsub){
            a=Double.parseDouble(t.getText());
            op=2;
            t.setText("");
        }
        if(e.getSource()==bmul){
            a=Double.parseDouble(t.getText());
            op=3;
            t.setText("");
        }
        if(e.getSource()==bdiv){
            a=Double.parseDouble(t.getText());
            op=4;
            t.setText("");
        }
        if(e.getSource()==beq){
            b=Double.parseDouble(t.getText());
            switch(op){
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result= a*b;
                break;
            case 4:
                try{
                    result = a/b;
                }
                catch(ArithmeticException ae){
                    t.setText("Error");
                }
                break;
            default:
                result=0;
            }
            t.setText("" + result);
        }
        if(e.getSource()==bclr){
            t.setText("");
        }
    }
    public static void main(String args[]){
        new calcu();
    }
}
