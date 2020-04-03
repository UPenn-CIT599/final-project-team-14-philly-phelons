import com.opencsv.bean.CsvBindByPosition;

public class Crime {

    @CsvBindByPosition(position = 0)
    private String district;//The district in which the crim was reported. Must be input as 2 digits (i.e. District 1 = "01", District 12 = "12")
    
    @CsvBindByPosition(position = 1)
    private String psa;
    
    @CsvBindByPosition(position = 2)
    private String dispatchDateTime;
    
    @CsvBindByPosition(position = 3)
    private String dispatchDate;
    
    @CsvBindByPosition(position = 4)
    private String dispatchTime;
    
    @CsvBindByPosition(position = 5)
    private String hour;
    
    @CsvBindByPosition(position = 6)
    private String dcKey;
    
    @CsvBindByPosition(position = 7)
    private String locationBlock;
    
    @CsvBindByPosition(position = 8)
    private String ucrGeneral;
    
    @CsvBindByPosition(position = 9)
    private String generalCode;
    
    @CsvBindByPosition(position = 11)
    private String month;
    
    @CsvBindByPosition(position = 12)
    private String lon;
    
    @CsvBindByPosition(position = 13)
    private String lat;
    
    
    public Crime() {
        
//        
    }


    public void setDistrict(String district) {
        this.district = district;
    }


    public void setPsa(String psa) {
        this.psa = psa;
    }


    public void setDispatchDateTime(String dispatchDateTime) {
        this.dispatchDateTime = dispatchDateTime;
    }


    public void setDispatchDate(String dispatchDate) {
        this.dispatchDate = dispatchDate;
    }


    public void setDispatchTime(String dispatchTime) {
        this.dispatchTime = dispatchTime;
    }


    public void setHour(String hour) {
        this.hour = hour;
    }


    public void setDcKey(String dcKey) {
        this.dcKey = dcKey;
    }


    public void setLocationBlock(String locationBlock) {
        this.locationBlock = locationBlock;
    }


    public void setUcrGeneral(String ucrGeneral) {
        this.ucrGeneral = ucrGeneral;
    }


    public void setGeneralCode(String generalCode) {
        this.generalCode = generalCode;
    }


    public void setMonth(String month) {
        this.month = month;
    }


    public void setLon(String lon) {
        this.lon = lon;
    }


    public void setLat(String lat) {
        this.lat = lat;
    }


    public String getDistrict() {
        return district;
    }


    public String getPsa() {
        return psa;
    }


    public String getDispatchDateTime() {
        return dispatchDateTime;
    }


    public String getDispatchDate() {
        return dispatchDate;
    }


    public String getDispatchTime() {
        return dispatchTime;
    }


    public String getHour() {
        return hour;
    }


    public String getDcKey() {
        return dcKey;
    }


    public String getLocationBlock() {
        return locationBlock;
    }


    public String getUcrGeneral() {
        return ucrGeneral;
    }


    public String getGeneralCode() {
        return generalCode;
    }


    public String getMonth() {
        return month;
    }


    public String getLon() {
        return lon;
    }


    public String getLat() {
        return lat;
    }
}
