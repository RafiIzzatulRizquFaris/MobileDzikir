package tech.toughput.mobiledzikir.model;

/**
 * Created by ASUS-X454Y on 20/04/2019.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("date_for")
    @Expose
    private String dateFor;
    @SerializedName("fajr")
    @Expose
    private String fajr;
    @SerializedName("shurooq")
    @Expose
    private String shurooq;
    @SerializedName("dhuhr")
    @Expose
    private String dhuhr;
    @SerializedName("asr")
    @Expose
    private String asr;
    @SerializedName("maghrib")
    @Expose
    private String maghrib;
    @SerializedName("isha")
    @Expose
    private String isha;

    public String getDateFor() {
        return dateFor;
    }

    public void setDateFor(String dateFor) {
        this.dateFor = dateFor;
    }

    public String getFajr() {
        return fajr;
    }

    public void setFajr(String fajr) {
        this.fajr = fajr;
    }

    public String getShurooq() {
        return shurooq;
    }

    public void setShurooq(String shurooq) {
        this.shurooq = shurooq;
    }

    public String getDhuhr() {
        return dhuhr;
    }

    public void setDhuhr(String dhuhr) {
        this.dhuhr = dhuhr;
    }

    public String getAsr() {
        return asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getIsha() {
        return isha;
    }

    public void setIsha(String isha) {
        this.isha = isha;
    }
}
