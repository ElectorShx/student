package com.shx.student.pojo;

import java.util.Date;
import java.util.Objects;

public class Scy {
    private Integer sno;
    private  Integer cludno;

    private Date eyear;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Integer getCludno() {
        return cludno;
    }

    public void setCludno(Integer cludno) {
        this.cludno = cludno;
    }

    public Date getEyear() {
        return eyear;
    }

    public void setEyear(Date eyear) {
        this.eyear = eyear;
    }

    @Override
    public String toString() {
        return "Scy{" +
                "sno=" + sno +
                ", cludno=" + cludno +
                ", eyear=" + eyear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scy scy = (Scy) o;
        return Objects.equals(sno, scy.sno) && Objects.equals(cludno, scy.cludno) && Objects.equals(eyear, scy.eyear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, cludno, eyear);
    }
}
