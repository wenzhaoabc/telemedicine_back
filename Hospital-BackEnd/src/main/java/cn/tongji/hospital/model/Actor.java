package cn.tongji.hospital.model;

import java.io.Serializable;

public class Actor implements Serializable {
    private Long actorId;

    private String password;

    private String name;

    private String role;

    private Integer telephone;

    private Integer age;

    private String gender;

    private String department;

    private Integer seviceYear;

    private String hospital;

    private Integer introduction;

    private String field;

    private Integer score;

    private String photo;

    private Integer price;

    private static final long serialVersionUID = 1L;

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSeviceYear() {
        return seviceYear;
    }

    public void setSeviceYear(Integer seviceYear) {
        this.seviceYear = seviceYear;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public Integer getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Integer introduction) {
        this.introduction = introduction;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", actorId=").append(actorId);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", role=").append(role);
        sb.append(", telephone=").append(telephone);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", department=").append(department);
        sb.append(", seviceYear=").append(seviceYear);
        sb.append(", hospital=").append(hospital);
        sb.append(", introduction=").append(introduction);
        sb.append(", field=").append(field);
        sb.append(", score=").append(score);
        sb.append(", photo=").append(photo);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}