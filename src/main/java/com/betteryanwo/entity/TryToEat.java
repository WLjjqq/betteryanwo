package com.betteryanwo.entity;

/**
 * @author :MaMengna
 * @Date :Create in 14:25 2018/6/12
 */
public class TryToEat {
    private Long eId;
    private String corporateName;
    private String cAddress;
    private String tasting;
    private String position;
    private String applicant;
    private int number;
    private String pThone;
    private String pEmail;
    private String remarks;

    public Long geteId() {
        return eId;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public String getTasting() {
        return tasting;
    }

    public String getPosition() {
        return position;
    }

    public String getApplicant() {
        return applicant;
    }

    public int getNumber() {
        return number;
    }

    public String getpThone() {
        return pThone;
    }

    public String getpEmail() {
        return pEmail;
    }

    public String getRemarks() {
        return remarks;
    }

    public void seteId(Long eId) {
        this.eId = eId;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public void setTasting(String tasting) {
        this.tasting = tasting;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setpThone(String pThone) {
        this.pThone = pThone;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public TryToEat(Long eId, String corporateName, String cAddress, String tasting,
                    String position, String applicant, int number, String pThone,
                    String pEmail, String remarks) {
        this.eId = eId;
        this.corporateName = corporateName;
        this.cAddress = cAddress;
        this.tasting = tasting;
        this.position = position;
        this.applicant = applicant;
        this.number = number;
        this.pThone = pThone;
        this.pEmail = pEmail;
        this.remarks = remarks;
    }

    public TryToEat() {
    }

    @Override
    public String toString() {
        return "TryToEat{" +
                "eId=" + eId +
                ", corporateName='" + corporateName + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", tasting='" + tasting + '\'' +
                ", position='" + position + '\'' +
                ", applicant='" + applicant + '\'' +
                ", number=" + number +
                ", pThone='" + pThone + '\'' +
                ", pEmail='" + pEmail + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
