package com.kascayd.prototype;

/**
 * Created by Nisarg Mehta on 04/08/2017.
 */

public class Version {
    private String _version;
    private String _hostname;

    public String get_version(){
        return _version;
    }

    public String get_hostname(){
        return _hostname;
    }

    public void set_version(String version){
        this._version = version;
    }

    public void set_hostname(String hostname){
        this._hostname = hostname;
    }
}
