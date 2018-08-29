import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OXfrom {
    private JLabel lblScoreX;
    private JLabel lblScoreO;
    private JLabel lblScoreDraw;
    private JPanel MainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private  ox OX;
    private int col,row;
    public OXfrom() {
        OX =new ox();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =0;row=0;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =1;row=0;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =2;row=0;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =0;row=1;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =1;row=1;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =2;row=1;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =0;row=2;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =1;row=2;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col =2;row=2;
                if(OX.put(col,row)){
                    render();
                    process();
                }
            }
        });
    }

    private void process() {
        if(OX.checkWin(col,row)||OX.checkWin2(col,row)||OX.checkWin3(col,row)||OX.checkWin4(col,row)){
            int result=JOptionPane.showConfirmDialog(null,OX.getCurrentplayer()+" WIN, "+" Do you want to play again?","WIN",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                OX.reset();
                render();
            }else{
                System.exit(0);
            }
        }else if(OX.isDraw()){
            int result=JOptionPane.showConfirmDialog(null," Draw, "+" Do you want to play again?","WIN",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                OX.reset();
                render();
            }else{
                System.exit(0);
            }
        }
        OX.swithPlayer();
    }

    private void render() {
        button1.setText(OX.get(0,0));
        button2.setText(OX.get(1,0));
        button3.setText(OX.get(2,0));
        button4.setText(OX.get(0,1));
        button5.setText(OX.get(1,1));
        button6.setText(OX.get(2,1));
        button7.setText(OX.get(0,2));
        button8.setText(OX.get(1,2));
        button9.setText(OX.get(2,2));
        lblScoreX.setText("X : "+ OX.getcountX());
        lblScoreDraw.setText("Draw : "+ OX.getcountDreaw());
        lblScoreO.setText("O : "+ OX.getcountO());
    }

    public static void main(String[] args) {
        JFrame frame =new JFrame();
        OXfrom from = new OXfrom();
        frame.setContentPane(from.MainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,500));
        frame.setMaximumSize(new Dimension(800,800));
        frame.setVisible(true);
    }
}
