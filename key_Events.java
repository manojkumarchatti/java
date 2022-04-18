// Demonstrate the key event handlers.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="SimpleKey" width=300 height=100>
</applet>
*/
public class SimpleKey extends Applet
implements KeyListener {
String msg = "";
int X = 10, Y = 20; // output coordinates
public void init() {
addKeyListener(this);
}
public void keyPressed(KeyEventke) 
{
showStatus("Key Down");
}
public void keyReleased(KeyEventke) 
{
showStatus("Key Up");
}
public void keyTyped(KeyEventke) 
{
msg += ke.getKeyChar();
repaint();
}
// Display keystrokes.
public void paint(Graphics g) 
{
g.drawString(msg, X, Y);
}
}
