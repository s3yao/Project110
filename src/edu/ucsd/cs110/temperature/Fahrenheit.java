package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @java.lang.Override
    public Temperature toCelsius() {
        Temperature temp = new Celsius((super.getValue() - 32) / 1.8F);
        return temp;
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(super.getValue());
    }

    public String toString()
    {
        String str = "" + super.getValue() + " F";
        return str;
    }
}