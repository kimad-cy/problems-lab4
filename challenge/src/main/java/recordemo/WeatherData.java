package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        //
        return  temperatureCelsius*((double) 9/5)+32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        //
        return "Current weather: " + this.temperatureCelsius + "°C (" +
                this.temperatureFahrenheit() + "°F) and " + this.conditions;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double celsius = (double) 5/9 * (tempFahrenheit - 32);
        return new WeatherData(celsius, conditions);
       //
    }

    public static void main(String[] args) {
        // Demonstrating the static factory method
        WeatherData today = new WeatherData(25, "Sunny");
        System.out.println("Today's weather: " + today.getSummary());
        // Demonstrating the static factory method
        WeatherData today2 = fromFahrenheit(50, "Cloudy");
        System.out.println("Yesterday's weather: " + today2.getSummary());

    }
}
