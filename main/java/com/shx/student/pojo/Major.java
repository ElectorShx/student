package com.shx.student.pojo;

import java.util.Objects;

public class Major {
    private String mname;
    private Integer dno;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Major major = (Major) o;
        return Objects.equals(mname, major.mname) && Objects.equals(dno, major.dno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mname, dno);
    }

    @Override
    public String toString() {
        return "Major{" +
                "mname='" + mname + '\'' +
                ", dno=" + dno +
                '}';
    }
    public boolean isSameDepartment(Major another){
        if(another.getDno()==this.dno){
            return true;
        }
        else {
            return false;
        }
    }
}
