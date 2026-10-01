package com.example.service2;


public class Weather {
    private int id;
    private String weathername;
    private String windspeed;
    private int rainfall;
    private String temperature;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeathername() {
        return weathername;
    }

    public void setWeathername(String weathername) {
        this.weathername = weathername;
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }

    public int getRainfall() {
        return rainfall;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Weather(int id, String weathername, String windspeed, int rainfall, String temperature) {
        this.id = id;
        this.weathername = weathername;
        this.windspeed = windspeed;
        this.rainfall = rainfall;
        this.temperature = temperature;
    }
}
