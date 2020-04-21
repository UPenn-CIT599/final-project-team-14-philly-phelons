import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Robby Ballard
 *
 */
public class GameWinLossVSCrimeRate {

	/**
	 * createGameWins
	 * 
	 * @param league
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private ArrayList<Games> createGameWins(String league) throws FileNotFoundException, IOException {
		LeagueReader lr = new LeagueReader();

		ArrayList<Games> leagueData;
		ArrayList<Games> gameWins = new ArrayList<Games>();

		if (league.equals("NHL")) {
			leagueData = lr.getNHLArray();
			for (Games game : leagueData) {
				if (Integer.parseInt(game.getHomeScore()) > Integer.parseInt(game.getAwayScore())) {
					gameWins.add(game);
				}
			}
		}

		return gameWins;
	}

	private int NHLWinVSViolentCrime() throws FileNotFoundException, IOException {
		ArrayList<Games> NHLWins = createGameWins("NHL");
		ArrayList<Crime> violentCrimeArray = CrimeReader.violentCrimeArray;
		int count = 0;
		for (Games game : NHLWins) {
			for (Crime crime : violentCrimeArray) {
				if (game.getGameDate().equals(crime.getDate())) {
					count++;
				}
			}
		}
		return count;

	}

}
