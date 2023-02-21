package com.example.usupbekov_adilet_4_3;

public class Country {
    private String flag;
    private String name;
    private String capital;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Country(String flag, String name, String capital) {
        this.flag = flag;
        this.name = name;
        this.capital = capital;
    }
}
