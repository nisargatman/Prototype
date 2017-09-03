package com.kascayd.prototype.retro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Loc implements Serializable
{

    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("acc")
    @Expose
    private Integer acc;
    @SerializedName("alt")
    @Expose
    private Integer alt;
   // private final static long serialVersionUID = 6371568967258745563L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Loc() {
    }

    /**
     *
     * @param lon
     * @param alt
     * @param acc
     * @param lat
     */
    public Loc(Double lat, Double lon, Integer acc, Integer alt) {
        super();
        this.lat = lat;
        this.lon = lon;
        this.acc = acc;
        this.alt = alt;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Integer getAcc() {
        return acc;
    }

    public void setAcc(Integer acc) {
        this.acc = acc;
    }

    public Integer getAlt() {
        return alt;
    }

    public void setAlt(Integer alt) {
        this.alt = alt;
    }



}