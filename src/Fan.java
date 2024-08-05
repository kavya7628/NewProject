public class Fan {
    private String color;
    private String dimension;
    private boolean isOn;

    //Constructor 
    public Fan(String color, String dimension) {
        this.color = color;
        this.dimension = dimension;
        this.isOn = false; // Initially, the fan is off
    }

    //Method to switch on the fan
    public void switchOn() {
        this.isOn = true;
    }

    // Method to switch off the fan
    public void switchOff() {
        this.isOn = false;
    }

    // Method to check if the fan is switched on
    public boolean isSwitchedOn() {
        return this.isOn;
    }

    // Method to print the specifications of the fan
    public void printSpecifications() {
        System.out.println("Color: " + this.color);
        System.out.println("Dimension: " + this.dimension);
    }

    // Main method to test the Fan class
    public static void main(String[] args) {
        Fan fan = new Fan("White", "16 inches");
        fan.printSpecifications();
        fan.switchOn();
        System.out.println("Is the fan on? " + fan.isSwitchedOn());
        fan.switchOff();
        System.out.println("Is the fan off? " + fan.isSwitchedOn());
    }
}
