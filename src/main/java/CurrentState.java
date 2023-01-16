public class CurrentState implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentState (Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Temperature: " + temperature + " C°");
        System.out.println("Humidity: " + humidity + " % humidity");
        System.out.println("Parabolic Pressure: " + pressure);
    }
}
