public class TestDrive {

    public static void main (String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentState currentStateDisplay = new CurrentState(weatherStation);
        weatherStation.setMeasurements(2, 80, 990);
        weatherStation.setMeasurements(0, 70, 950);
        weatherStation.removeObserver(currentStateDisplay);
        weatherStation.setMeasurements(1, 75, 955);
    }
}
