package behavioral.observator_example;

public class FireAlarmAnnouncer implements Announcer {
    @Override
    public void announce(WeatherStation station) {
        if (station.getTemperature() > 30) {
            System.out.println("Uwaga ostrzezenie przeciwpozarowe!");
        }
    }
}
