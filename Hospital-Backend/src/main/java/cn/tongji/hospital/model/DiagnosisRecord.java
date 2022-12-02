package cn.tongji.hospital.model;

import java.io.Serializable;
import java.util.Date;

public class DiagnosisRecord implements Serializable {
    private Long recordId;

    private Long patientId;

    private Long doctorId;

    private String state;

    private String review;

    private Integer advice;

    private Integer reviewScore;

    private Integer price;

    private Date startTime;

    private Date payTime;

    private Date endTime;

    private String problem;

    private static final long serialVersionUID = 1L;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getAdvice() {
        return advice;
    }

    public void setAdvice(Integer advice) {
        this.advice = advice;
    }

    public Integer getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(Integer reviewScore) {
        this.reviewScore = reviewScore;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", patientId=").append(patientId);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", state=").append(state);
        sb.append(", review=").append(review);
        sb.append(", advice=").append(advice);
        sb.append(", reviewScore=").append(reviewScore);
        sb.append(", price=").append(price);
        sb.append(", startTime=").append(startTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", problem=").append(problem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}