package com.kascayd.prototype.retro;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ParkRequest implements Serializable
{

    @SerializedName("device")
    @Expose
    private String device;
    @SerializedName("location")
    @Expose
    private Loc loc;
    private final static long serialVersionUID = -3408273948332635497L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ParkRequest() {
    }

    /**
     *
     * @param loc
     * @param device
     */
    public ParkRequest(String device, Loc loc) {
        super();
        this.device = device;
        this.loc = loc;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Loc getLoc() {
        return loc;
    }

    public void setLoc(Loc loc) {
        this.loc = loc;
    }

}