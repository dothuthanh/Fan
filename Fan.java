public class Fan {
    int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){

    }
    public int getSpeed(){
        return speed;
    }
    void setSpeed(int seepd){
        this.speed = seepd;
    }
    public boolean isOn(){
        return on;
    }
    void setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public  String toString(){
        if(this.on){
            return "Fan{" + "speed" + speed + ",radius" + radius+ ",color" + color + ",fan is off" + "}";
        }
        return "Fan{" + "color='" + color+ '\'' + ",fan is off" +"}";
    }
}
class Test{
    public static void main(String[] args){
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println("fan2 = " + fan2);
        System.out.println("fan1 = " + fan1);
    }
}
