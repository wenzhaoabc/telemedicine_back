package cn.tongji.hospital.model;

import com.github.yitter.idgen.YitIdHelper;

import java.io.Serializable;


public class Actor implements Serializable {
    public static final int patient=0;
    public static final int doctor=1;
    public static final int female=0;
    public static final int male=1;
    private Long actorId;

    private String password;

    private String name;

    private int role;

    private String telephone;

    private Integer age;

    private int gender;

    private int department;

    private Integer seviceYear;

    private String hospital;

    private String introduction;

    private String field;

    private Integer score;

    private String photo;

    private Integer price;

    public Actor(String name, String pwd, String gender, Integer age, String phone){
        this.actorId= YitIdHelper.nextId();
        this.name=name;
        this.password=pwd;
        if(gender.equals("男"))
            this.gender=male;
        else
            this.gender=female;
        this.telephone=phone;
        this.age=age;
        /*默认头像和身份*/
        this.photo="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.huabanimg.com%2F07b029c67010c0a17a1c78fcbc92ce612de4cf3ae8dd-Oc4KXC_fw658&refer=http%3A%2F%2Fhbimg.huabanimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1672485726&t=80d1cd40a19072dff96fdb757c9efb76";
        this.role=patient;
    }
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



    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
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