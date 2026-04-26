import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.SocketTimeoutException;

public class login extends Frame{
    public static void main(String args[]){
        login l=new login();
        l.setSize(400,400);
        l.setLayout(new FlowLayout(FlowLayout.CENTER));
        l.setVisible(true);
        Label l1=new Label("name:");
        TextField t1=new TextField(20);
        Label l2=new Label("password:");

        TextField t2=new TextField(50);
        Button b1=new Button("login");
        l.add(l1);
        l.add(t1);
        l.add(l2);
        l.add(t2);
        l.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1.getText().equals("admin") && t2.getText().equals("123")){
                    System.out.println("Successfully login");
                }else{
                    System.out.println("fail");

                }
            }
        });
    }
}
