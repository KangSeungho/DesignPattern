package custom

import custom.observer.Observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}

class WeatherData : Subject {
    private val observers = ArrayList<Observer>()
    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }
    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }
    override fun notifyObservers() {
        observers.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}