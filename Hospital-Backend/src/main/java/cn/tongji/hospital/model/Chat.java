package cn.tongji.hospital.model;

import java.io.Serializable;
import java.util.Date;

public class Chat implements Serializable {
    private Long recordId;

    private Date createTime;

    private String fromRole;

    private String value;

    private String kind;

    private static final long serialVersionUID = 1L;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFromRole() {
        return fromRole;
    }

    public void setFromRole(String fromRole) {
        this.fromRole = fromRole;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", createTime=").append(createTime);
        sb.append(", fromRole=").append(fromRole);
        sb.append(", value=").append(value);
        sb.append(", kind=").append(kind);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}