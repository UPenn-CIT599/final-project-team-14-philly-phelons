import com.opencsv.bean.CsvBindByPosition;

/**
 * Crime class will create crime objects 
 * collaborates with CrimeReader class
 *
 */

public class Crime {

	@CsvBindByPosition(position = 0)
	private String district;// The district in which the crime was reported. Must be input as 2 digits (i.e.
							// District 1 = "01", District 12 = "12")

	@CsvBindByPosition(position = 1)
	private String psa;

	@CsvBindByPosition(position = 2)
	private String dispatchDateTime; // The date and time the crime was reported

	@CsvBindByPosition(position = 3)
	private String dispatchDate;// The date on which police were dispatched to the scene

	@CsvBindByPosition(position = 4)
	private String dispatchTime;// The time at which police were dispatched

	@CsvBindByPosition(position = 5)
	private String dispatchHour;// The hour at which police were dispatched

	@CsvBindByPosition(position = 6)
	private String dcKey;// No clear explanation for this one

	@CsvBindByPosition(position = 7)
	private String locationBlock;// What city block the crime occurred on

	@CsvBindByPosition(position = 8)
	private String ucrGeneral;// No clear explanation for this data

	@CsvBindByPosition(position = 9)
	private String generalCode;// The code of the crime (e.g., Arson, Burglary, ...)

	@CsvBindByPosition(position = 11)
	private String crimeMonth;// What month the crime occurred in

	@CsvBindByPosition(position = 12)
	private String longitude;// The longitude data for where the crime was committed

	@CsvBindByPosition(position = 13)
	private String latitude;// The latitude date for where the crime was committed

	public Crime() {

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
		this.dispatchHour = hour;
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
		this.crimeMonth = month;
	}

	public void setLon(String lon) {
		this.longitude = lon;
	}

	public void setLat(String lat) {
		this.latitude = lat;
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

	public String getDispatchHour() {
		return dispatchHour;
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

	public String getCrimeMonth() {
		return crimeMonth;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	/**
	 * will read what method is called from CrimeReader
	 * @param methodName
	 * @return String from method called or null if methodName doesn't match
	 */
	public Object getMethodName(String methodName) { 
		if (methodName.equals("getDistrict")) {
			return getDistrict();
		}
		if (methodName.equals("getPsa")) {
			return getPsa();
		}
		if (methodName.equals("getDispatchDateTime")) {
			return getDispatchDateTime();
		}
		if (methodName.equals("getDispatchDate")) {
			return getDispatchDate();
		}
		if (methodName.equals("getDispatchTime")) {
			return getDispatchTime();
		}
		if (methodName.equals("getHour")) {
			return getDispatchHour();
		}
		if (methodName.equals("getDcKey")) {
			return getDcKey();
		}
		if (methodName.equals("getLocationBlock")) {
			return getLocationBlock();
		}
		if (methodName.equals("getUcrGeneral")) {
			return getUcrGeneral();
		}
		if (methodName.equals("getGeneralCode")) {
			return getGeneralCode();
		}
		if (methodName.equals("getMonth")) {
			return getCrimeMonth();
		}
		if (methodName.equals("getLon")) {
			return getLongitude();
		}
		if (methodName.equals("getLat")) {
			return getLatitude();
		}
		return null;
	}
}
