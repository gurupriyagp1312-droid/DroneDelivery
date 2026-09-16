import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class DroneDelivery extends JFrame implements KeyListener {
    JLabel drone;
    JLabel house;
    JLabel batteryLabel;
    JLabel deliveryLabel;
    int x = 50;
    int y = 100;
    int houseX = 350;
    int houseY = 200;
    int battery = 100;
    int deliveries = 0;
    DroneDelivery() {
        setTitle("Drone Delivery");
        setSize(500, 400);
        setLayout(null);
        
	ImageIcon droneIcon = new ImageIcon("drone.png");
        Image droneImg = droneIcon.getImage();
        Image newDroneImg = droneImg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        drone = new JLabel(new ImageIcon(newDroneImg));
        drone.setBounds(x, y, 30, 30);
        add(drone);

	ImageIcon houseIcon = new ImageIcon("house.png");
        Image houseImg = houseIcon.getImage();
        Image newHouseImg = houseImg.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        house = new JLabel(new ImageIcon(newHouseImg));
        house.setBounds(houseX, houseY, 50, 40);
        add(house);

        batteryLabel = new JLabel("Battery: 100%");
        batteryLabel.setBounds(20, 20, 120, 30);
        add(batteryLabel);

        deliveryLabel = new JLabel("Deliveries: 0");
        deliveryLabel.setBounds(350, 20, 120, 30);
        add(deliveryLabel);

        addKeyListener(this);
        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        requestFocusInWindow();
    }
    public void keyPressed(KeyEvent e) {
        if (battery == 0)
 	{
            return;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (y > 50) 
	   {
                y = y - 10;
                battery--;
           }
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (y < 280) 
            {
                y = y + 10;
                battery--;
            }
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (x > 10) 
	    {
                x = x - 10;
                battery--;
            }
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (x < 420) 
	    {
                x = x + 10;
                battery--;
            }
        }
        drone.setBounds(x, y, 50, 40);
        batteryLabel.setText("Battery: " + battery + "%");
        if (battery == 0) 
	{	
		JOptionPane.showMessageDialog(this,"Battery Empty");
            	return;
        }
        if (x >= houseX - 30 && x <= houseX + 30 && y >= houseY - 30 && y <= houseY + 30) {
		JOptionPane.showMessageDialog(this,"Delivery Completed");
            	deliveries++;
           	battery = 100;
		batteryLabel.setText("Battery: 100%");
		deliveryLabel.setText("Deliveries: " + deliveries);
            	Random r = new Random();

            	houseX = r.nextInt(400) + 20;
            	houseY = r.nextInt(250) + 50;
            house.setBounds(houseX,  houseY,50,40);

          }
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    
}
class Drone1{

    public static void main(String[] args) {

        new DroneDelivery();
    }
}