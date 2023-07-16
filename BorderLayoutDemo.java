
import java.awt.*;
import java.applet.*;

/*<applet code=BorderLayoutDemo height=300 width=400></applet> */

public class BorderLayoutDemo extends Applet  {
    public void init(){
        setLayout(new BorderLayout());
        add(new Button("sa"),BorderLayout.EAST);
        add(new Button("sa"),BorderLayout.NORTH);
        add(new Button("sa"),BorderLayout.WEST);
        add(new Button("sa"),BorderLayout.SOUTH);
    
        add(new TextField("fufufuf"), BorderLayout.EAST);
    }
}
