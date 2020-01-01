package com.mxl.pojo;

import java.util.Date;

/**
 * #
 * # 　　　┏┓　　　┏┓
 * # 　　┏┛┻━━━┛┻┓
 * # 　　┃　　　　　　　 ┃
 * # 　　┃　　　━　　　 ┃
 * # 　　┃　┳┛　┗┳　┃
 * # 　　┃　　　　　　　 ┃
 * # 　　┃　　　┻　　　 ┃
 * # 　　┃　　　　　　　 ┃
 * # 　　┗━┓　　　┏━┛Codes are far away from bugs with the animal protecting
 * # 　　　　┃　　　┃    神兽保佑,代码无bug
 * # 　　　　┃　　　┃
 * # 　　　　┃　　　┗━━━┓
 * # 　　　　┃　　　　　 ┣┓
 * # 　　　　┃　　　　 ┏┛
 * # 　　　　┗┓┓┏━┳┓┏┛
 * # 　　　　　┃┫┫　┃┫┫
 * # 　　　　　┗┻┛　┗┻┛
 */
//:id="item.id"
//        :place_where="item.detailAddress"
//        :phone_number="item.phone"
//        :but="item.but"

//    :id = "item.createUserId"
//            :num = "item.id"
//            :sel = "item.updateUserId"
//            :status = "item.status"
//            :time = "item.updateTime"
//            :name = "item.petitionerName"
//            :number = "item.petitionerPhone"
//            :old = "item.petitionerAge"
//            :sex = "item.genderName"
//            :sort = "item.typeName"
//            :personnum = "item.petitionNum"
//            :place = "item.petitionerAddress"
//            :contain = "item.petitionDetail"
//            :overtime = "item.updateTime"
public class Item {
    public int createUserId;
    public int updateUserId;
    public int status;
    public Date updateTime;
    public String petitionerName;
    public String petitionerPhone;
    public String petitionerAge;
    public String genderName;
    public String typeName;
    public String petitionNum;
    public String petitionerAddress;

    @Override
    public String toString() {
        return "Item{" +
                "createUserId=" + createUserId +
                ", updateUserId=" + updateUserId +
                ", status=" + status +
                ", updateTime=" + updateTime +
                ", petitionerName='" + petitionerName + '\'' +
                ", petitionerPhone='" + petitionerPhone + '\'' +
                ", petitionerAge='" + petitionerAge + '\'' +
                ", genderName='" + genderName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", petitionNum='" + petitionNum + '\'' +
                ", petitionerAddress='" + petitionerAddress + '\'' +
                ", petitionDetail='" + petitionDetail + '\'' +
                ", id=" + id +
                ", detailAddress='" + detailAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", but='" + but + '\'' +
                '}';
    }

    public String petitionDetail;

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public int getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(int updateUserId) {
        this.updateUserId = updateUserId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPetitionerName() {
        return petitionerName;
    }

    public void setPetitionerName(String petitionerName) {
        this.petitionerName = petitionerName;
    }

    public String getPetitionerPhone() {
        return petitionerPhone;
    }

    public void setPetitionerPhone(String petitionerPhone) {
        this.petitionerPhone = petitionerPhone;
    }

    public String getPetitionerAge() {
        return petitionerAge;
    }

    public void setPetitionerAge(String petitionerAge) {
        this.petitionerAge = petitionerAge;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPetitionNum() {
        return petitionNum;
    }

    public void setPetitionNum(String petitionNum) {
        this.petitionNum = petitionNum;
    }

    public String getPetitionerAddress() {
        return petitionerAddress;
    }

    public void setPetitionerAddress(String petitionerAddress) {
        this.petitionerAddress = petitionerAddress;
    }

    public String getPetitionDetail() {
        return petitionDetail;
    }

    public void setPetitionDetail(String petitionDetail) {
        this.petitionDetail = petitionDetail;
    }

    public int id;
    public String detailAddress;
    public String phone;
    public String but;

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBut() {
        return but;
    }

    public void setBut(String but) {
        this.but = but;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
