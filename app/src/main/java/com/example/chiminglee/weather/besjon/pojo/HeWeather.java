/**
  * Copyright 2018 bejson.com 
  */
package com.example.chiminglee.weather.besjon.pojo;
import java.util.List;

/**
 * Auto-generated: 2018-01-02 10:50:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class HeWeather {

    private Aqi aqi;
    private Basic basic;
    private List<Daily_forecast> daily_forecast;
    private Now now;
    private String status;
    private Suggestion suggestion;
    public void setAqi(Aqi aqi) {
         this.aqi = aqi;
     }
     public Aqi getAqi() {
         return aqi;
     }

    public void setBasic(Basic basic) {
         this.basic = basic;
     }
     public Basic getBasic() {
         return basic;
     }

    public void setDaily_forecast(List<Daily_forecast> daily_forecast) {
         this.daily_forecast = daily_forecast;
     }
     public List<Daily_forecast> getDaily_forecast() {
         return daily_forecast;
     }

    public void setNow(Now now) {
         this.now = now;
     }
     public Now getNow() {
         return now;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setSuggestion(Suggestion suggestion) {
         this.suggestion = suggestion;
     }
     public Suggestion getSuggestion() {
         return suggestion;
     }

}