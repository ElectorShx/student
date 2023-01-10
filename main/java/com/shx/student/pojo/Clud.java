package com.shx.student.pojo;


import java.util.Date;
import java.util.Objects;

public class Clud {
    private int cludno;
    private String cludname;
    private Date cludyear;
    private String location;


    public int getCludno() {
        return cludno;
    }

    public void setCludno(int cludno) {
        this.cludno = cludno;
    }

    public String getCludname() {
        return cludname;
    }

    public void setCludname(String cludname) {
        this.cludname = cludname;
    }

    public Date getCludyear() {
        return cludyear;
    }

    public void setCludyear(Date cludyear) {
        this.cludyear = cludyear;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clud clud = (Clud) o;
        return cludno == clud.cludno && Objects.equals(cludname, clud.cludname) && Objects.equals(cludyear, clud.cludyear) && Objects.equals(location, clud.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cludno, cludname, cludyear, location);
    }

    @Override
    public String toString() {
        return "Clud{" +
                "cludno=" + cludno +
                ", cludname='" + cludname + '\'' +
                ", cludyear=" + cludyear +
                ", location='" + location + '\'' +
                '}';
    }
}
