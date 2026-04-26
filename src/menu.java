import java.awt.*;

public class menu extends Frame {
    public static void main(String args[]){
        menu m=new menu();
        m.setSize(400,400);
        m.setVisible(true);
        m.setLayout(new FlowLayout(FlowLayout.CENTER));

        MenuBar menuBar;
        Menu menu1,menu2,menu3,menu4;
        MenuItem mi1,mi2,mi3,mi4,mi5;

        menuBar =new MenuBar();
        menu1=new Menu("File");
        menu2=new Menu("edit");
        menu3 =new Menu("view");
        menu4=new Menu("help");
        mi1=new MenuItem("save");
        mi2=new MenuItem("undo");
        mi3=new MenuItem("redo");
        mi4=new MenuItem("tools");
        mi5=new MenuItem("call ");

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);


        menu1.add(mi1);
        menu2.add(mi2);
        menu2.add(mi3);
        menu3.add(mi4);
        menu4.add(mi5);
        m.setMenuBar(menuBar);







    }
}
