package custom.observer

import custom.WeatherData

class CurrentConditionsDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    private var temperature = 0f
    private var humidity = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }
    override fun display() {
        // 현재 측정 값을 화면에 표시
        println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }
}