package behavioral.observator_example;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private int temperature;
    private double pressure;
    private List<Announcer> announcers = new ArrayList<>();


    public void newMeasurement(int temperature, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
       notifyAnnouncers();
    }

    public void notifyAnnouncers() {
        for (Announcer announcer : announcers) {
            announcer.announce(this);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void add(Announcer announcer) {
        announcers.add(announcer);
    }



}
