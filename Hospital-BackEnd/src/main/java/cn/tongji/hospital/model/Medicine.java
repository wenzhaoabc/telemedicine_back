package cn.tongji.hospital.model;

import java.io.Serializable;

public class Medicine implements Serializable {
    private Long medicineId;

    private String name;

    private Integer price;

    private Integer inventory;

    private Integer indication;

    private Integer brand;

    private static final long serialVersionUID = 1L;

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getIndication() {
        return indication;
    }

    public void setIndication(Integer indication) {
        this.indication = indication;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medicineId=").append(medicineId);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", inventory=").append(inventory);
        sb.append(", indication=").append(indication);
        sb.append(", brand=").append(brand);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}