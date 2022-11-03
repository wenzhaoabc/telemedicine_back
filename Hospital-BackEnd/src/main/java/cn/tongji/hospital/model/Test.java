package cn.tongji.hospital.model;

import java.io.Serializable;

public class Test implements Serializable {
    private Long t;

    private static final long serialVersionUID = 1L;

    public Long getT() {
        return t;
    }

    public void setT(Long t) {
        this.t = t;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", t=").append(t);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}