package ders30;

public class Aencapulation {
    private String hospital_name="Yıldız";

    public String getHemsire_adresi() {
        return hemsire_adresi;
    }

    public void setHemsire_adresi(String hemsire_adresi) {
        this.hemsire_adresi = hemsire_adresi;
    }

    public String getHemsire_ismi() {
        return hemsire_ismi;
    }

    public void setHemsire_ismi(String hemsire_ismi) {
        this.hemsire_ismi = hemsire_ismi;
    }

    public void setHasta_ucreti(int hasta_ucreti) {
        this.hasta_ucreti = hasta_ucreti;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    //hastane ismi görülebilsin ama değiştirilemesin
    //getter
    private int hasta_ucreti;
    //hasta ücretleri de giriş yapılabilsin ama
    //personel hastaların toplam ücretini görmesin
    //setter methodu lazım
    private String hemsire_adresi;
    private String hemsire_ismi;
    //bunlara da herkes erişsin.
    //bu durumda public de yapılabilir.


}
