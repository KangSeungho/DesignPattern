package custom.observer

import custom.WeatherData

class ForecastDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {}
    override fun display() {
        // 기상 예보 표시
    }
}