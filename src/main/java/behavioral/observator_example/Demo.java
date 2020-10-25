package behavioral.observator_example;

public class Demo {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherAnnouncer announcer1 = new WeatherAnnouncer();
        FireAlarmAnnouncer announcer2 = new FireAlarmAnnouncer();
        weatherStation.add(announcer1);
        weatherStation.add(announcer2);
        weatherStation.newMeasurement(34,1.005);
        weatherStation.newMeasurement(32,1.003);
        weatherStation.newMeasurement(30,1.001);



    }
}
