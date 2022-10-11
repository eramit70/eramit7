//example of demonstration of gridlayout
import java.awt.*;
public class GridLayoutExample
{
    public static void main(String a[])
    {
        Frame f = new Frame("GRID LAYOUT EXAMPLE");
        GridLayout gl = new GridLayout(5,2);
        f.setLayout(gl);
        f.setBounds(200,200,500,500);
        f.setVisible(true);

        Label l1 = new Label("Name");
        Label l2 = new Label("age");
        Label l3 = new Label("gender");
        Label l4 = new Label("address");
        Label l5 = new Label("college");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        TextField t5 = new TextField();
        f.add(l1);f.add(t1);f.add(l2);f.add(t2);f.add(l3);f.add(t3);f.add(l4);f.add(t4);f.add(l5);f.add(t5);
    }
}