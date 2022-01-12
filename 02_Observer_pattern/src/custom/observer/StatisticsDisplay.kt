package custom.observer

import custom.WeatherData

class StatisticsDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {}
    override fun display() {
        // 평균/최저/최고치 표시
    }
}