
/**
 * This class will specify the query attributes and 
 * properties in order to run the search from runner
 * 
 */
package twitterPackage;

import twitter4j.*;

/**
 * @author claudia peinado romano
 *
 */
public class twitterQuery {

	/**
	 * runQuery will set the query parameters for the search it will use the
	 * latitude and longitude of Philly and search for Tweets within a 5 mile radius
	 * 
	 * @param team
	 * @return numberOfTweets
	 */
	public int runQuery(String team) {
		Twitter twitter = TwitterFactory.getSingleton();
		GeoLocation philly = new GeoLocation(39.9526, -75.16522);
		Query query = new Query(team);

		query.setGeoCode(philly, 5, Query.MILES);
		query.setSince("2019-5-1");

		try {
			QueryResult result = twitter.search(query);
			int numberOfTweets = result.getTweets().size();
			return numberOfTweets;
		} catch (TwitterException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
