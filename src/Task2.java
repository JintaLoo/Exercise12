enum TrafficColour{
    RED, YELLOW, GREEN
}
class TrafficLightSimulator {
    TrafficColour colour = TrafficColour.RED;

    public void changeColour() {
        
        switch (colour) {
            case RED:
                colour = TrafficColour.YELLOW;
                break;
            case YELLOW:
                colour = TrafficColour.GREEN;
                break;
            case GREEN:
                colour = TrafficColour.RED;
        }
    }

    public String toString() {
        return " " + colour;
    }
}

public class Task2 {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator();
        for(int i = 0; i < 9; i++)
        {
            System.out.println(t1);
            t1.changeColour();
        }
    }
}