Drone Delivery – Java Swing
A simple Java Swing-based Drone Delivery application where the user controls a drone using the Up, Down, Left, and Right arrow keys to reach a delivery destination.
The project demonstrates Java Swing GUI, Key Event Handling, Image Icons, Collision Detection, Battery Management, and Random Destination Generation. 

✨ Features
🚁 Move the drone using Arrow Keys
🏠 Delivery destination represented using a house image
🔋 Drone starts with 100% battery
⚡ Battery decreases by 1% for every valid movement
🚫 Drone cannot move outside the window boundary
📦 Displays "Delivery Completed" when the drone reaches the house
🔄 Battery resets to 100% after successful delivery
🎯 Generates a new random destination after each delivery
📊 Displays the current battery level
🔢 Displays the total number of completed deliveries
🛑 Shows "Battery Empty" when the battery reaches 0%

🛠️ Technologies Used
Java
Java Swing
AWT
KeyListener
KeyEvent
JLabel
ImageIcon
Random

🎮 Controls
Key
Action
⬆️ Up Arrow-Move Drone Up
⬇️ Down Arrow-Move Drone Down
⬅️ Left Arrow-Move Drone Left
➡️ Right Arrow-Move Drone Right

📂 Project Structure
DroneDelivery/
│
├── DroneDelivery.java
├── drone.png
└── house.png

Note: Keep drone.png and house.png in the same folder as the Java file, or update the image paths in the code accordingly.

⚙️ How It Works
The application opens a Java Swing window.
A small drone image and house image are displayed.
The user controls the drone using the arrow keys.
Every valid movement reduces the battery by 1%.
The drone is restricted from crossing the window boundaries.
When the drone reaches the house, the delivery is completed.
The delivery count increases by one.
The battery is reset to 100%.
A new destination is generated at a different random position.
If the battery reaches 0%, the drone stops moving and displays "Battery Empty".

🚀 How to Run
1. Clone the repository
  git clone <your-repository-url>
2. Open the project
  Open the project in Eclipse, IntelliJ IDEA, VS Code, or any Java-supported IDE.
3. Make sure the images are available
Place:
  drone.png
  house.png
  in the required project directory.
4. Compile and Run
  javac DroneDelivery.java
  java DroneDelivery
📚 Concepts Demonstrated
  This project was developed to practice:
  Java Swing GUI development
  Event-driven programming
  Keyboard event handling
  Object movement using coordinates
  Image handling with ImageIcon
  Boundary checking
  Collision detection
  Random number generation
  Basic game/application logic
🎯 Learning Outcome
  Through this project, I learned how to build an interactive Java Swing application and handle real-time keyboard input to control an object. It also helped me understand how event handling, GUI components, coordinates, conditions, and application logic work together in a practical project.

👩‍💻 Author
Gurupriya Mariselvam
Second-Year Computer Science Student
Coimbatore Institute of Technology
