package com.kascayd.prototype.retro;

/**
 * Created by adityaruia on 01/09/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ParkResponse implements Serializable
{

    @SerializedName("error_code")
    @Expose
    private Integer errorCode;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;
    private final static long serialVersionUID = -5545346866237953326L;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "error_code='" + errorCode + '\'' +
                ", type='" + type + '\'' +
                ", message=" + message +
                ", status=" + status +
                '}';
    }

}



