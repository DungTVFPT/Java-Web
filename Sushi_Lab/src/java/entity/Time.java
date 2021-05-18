/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author fb.com/truongdung0706
 */
public class Time {
    private String openDay;
    private String openHours;

    public Time() {
    }

    public Time(String openDay, String openHours) {
        this.openDay = openDay;
        this.openHours = openHours;
    }

    public String getOpenDay() {
        return openDay;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }
    
}
