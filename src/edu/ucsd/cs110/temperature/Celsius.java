package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @java.lang.Override
    public Temperature toCelsius() {
        return new Celsius(super.getValue());
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        Temperature temp = new Fahrenheit((super.getValue() * 1.8F) + 32);
        return temp;
    }

    public String toString()
    {
        String str = "" + super.getValue() + " C";
        return str;
    }
}