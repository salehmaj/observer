import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    private static WeatherStation objUnique;

    private WeatherStation () {
        observers = new ArrayList<Observer>();
    }

    public static WeatherStation getInstance() {
        if (objUnique == null) {
            objUnique = new WeatherStation();
        }
        return objUnique;
    }

    public void registerObserver (Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements (float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
