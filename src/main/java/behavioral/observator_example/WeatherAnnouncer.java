package behavioral.observator_example;

public class WeatherAnnouncer implements Announcer{




    public void announce(WeatherStation station) {
        System.out.println("Nowa pogoda to: " + station.getTemperature() + "C " + station.getPressure() + "hp");
    }
}
