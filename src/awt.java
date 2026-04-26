import java.awt.*;

public class awt extends Frame {
    public static void main(String args[]) {
        awt a = new awt();
        a.setSize(400, 400);
        a.setVisible(true);
        a.setLayout(new FlowLayout(FlowLayout.CENTER));
        Label l1=new Label("hello world");
        a.add(l1);
        Button b1=new Button("click");
        a.add(b1);
        Checkbox c1=new Checkbox("male");
        a.add(c1);
        TextField t1=new TextField(40);
        a.add(t1);
        TextArea t2=new TextArea(89,66);
        a.add(t2);
        CheckboxGroup ch=new CheckboxGroup();
        Checkbox ch1=new Checkbox("male",ch,true);
        Checkbox ch2=new Checkbox("female",ch,true);
        a.add(ch1);
        a.add(ch2);






    }

}
