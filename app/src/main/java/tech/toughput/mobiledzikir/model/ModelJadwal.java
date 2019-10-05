package tech.toughput.mobiledzikir.model;

/**
 * Created by ASUS-X454Y on 20/04/2019.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelJadwal {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("for")
    @Expose
    private String _for;
    @SerializedName("method")
    @Expose
    private Integer method;
    @SerializedName("prayer_method_name")
    @Expose
    private String prayerMethodName;
    @SerializedName("daylight")
    @Expose
    private String daylight;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("map_image")
    @Expose
    private String mapImage;
    @SerializedName("sealevel")
    @Expose
    private String sealevel;
    @SerializedName("today_weather")
    @Expose
    private TodayWeather todayWeather;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("qibla_direction")
    @Expose
    private String qiblaDirection;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("status_valid")
    @Expose
    private Integer statusValid;
    @SerializedName("status_code")
    @Expose
    private Integer statusCode;
    @SerializedName("status_description")
    @Expose
    private String statusDescription;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFor() {
        return _for;
    }

    public void setFor(String _for) {
        this._for = _for;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }

    public String getPrayerMethodName() {
        return prayerMethodName;
    }

    public void setPrayerMethodName(String prayerMethodName) {
        this.prayerMethodName = prayerMethodName;
    }

    public String getDaylight() {
        return daylight;
    }

    public void setDaylight(String daylight) {
        this.daylight = daylight;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getMapImage() {
        return mapImage;
    }

    public void setMapImage(String mapImage) {
        this.mapImage = mapImage;
    }

    public String getSealevel() {
        return sealevel;
    }

    public void setSealevel(String sealevel) {
        this.sealevel = sealevel;
    }

    public TodayWeather getTodayWeather() {
        return todayWeather;
    }

    public void setTodayWeather(TodayWeather todayWeather) {
        this.todayWeather = todayWeather;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getQiblaDirection() {
        return qiblaDirection;
    }

    public void setQiblaDirection(String qiblaDirection) {
        this.qiblaDirection = qiblaDirection;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getStatusValid() {
        return statusValid;
    }

    public void setStatusValid(Integer statusValid) {
        this.statusValid = statusValid;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
}
