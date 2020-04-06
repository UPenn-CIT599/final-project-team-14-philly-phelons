


/**
 * 
 * @author Tian Xue
 * Create a season class to define time frame for each league's season
 */
public class Season {
	private String nbaSeason;
	private String nflSeason;
	private String nhlSeason;
	private String mlbSeason;
	
	public Season() {
	}

	public String getNbaSeason() {
		nbaSeason = "10,11,12,01,02,03,04";
		return nbaSeason;
	}

	public String getNflSeason() {
		nflSeason = "09,10,11,12,01,02";
		return nflSeason;
	}

	public String getNhlSeason() {
		nhlSeason = "10,11,12,01,02,03,04";
		return nhlSeason;
	}

	public String getMlbSeason() {
		mlbSeason = "03,04,05,06,07,08,09,10";
		return mlbSeason;
	}

}
