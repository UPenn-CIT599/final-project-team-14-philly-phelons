import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/**
 * 
 * @author Robby Ballard
 *This class iterates through an ArrayList of games created by the LeagueReader class and matches a 
 *parameterized season value to the season in which a game was played, adding the game to an ArrayList,
 *thus creating an ArrayList composed entirely of the specified season's games for the specified league.
 */
public class LeagueSeason {
    ArrayList<Games> MLBSeason;//An ArrayList of Phillies games for a specified season
    ArrayList<Games> NHLSeason;//An ArrayList of Flyers games for a specified season
    ArrayList<Games> NFLSeason;//An ArrayList of Eagles games for a specified season
    ArrayList<Games> NBASeason;//An ArrayList of 76ers games for a specified season
    
    /**
     * Class constructor allows for a specified team's season ArrayList to be returned without having to call the method.
     * @param season A parameter determining the season for which games are being sought
     * @throws FileNotFoundException
     * @throws IOException
     */
    public LeagueSeason(String season) throws FileNotFoundException, IOException {
        MLBSeason = makeMLBSeason(season);
        NHLSeason = makeNHLSeason(season);
        NFLSeason = makeNFLSeason(season);
        NBASeason = makeNBASeason(season);
    }

    /**
     * This class creates an ArrayList of Phillies games for a specified season. It returns the ArrayList 
     * as a collection of Games objects.
     * @param season The season for which games are being sought
     * @return Returns an ArrayList of Games objects for the specified season
     * @throws FileNotFoundException
     * @throws IOException
     */
    private ArrayList<Games> makeMLBSeason(String season) throws FileNotFoundException, IOException {
        LeagueReader lr = new LeagueReader();//Creates an instance of the LeagueReader class
        ArrayList<Games> gameArray = lr.MLBArray;//Creates an instance of the MLBArray from the LeagueReader Class
        ArrayList<Games> returnArray = new ArrayList<Games>();//Creates an ArrayList that will be returned once it has been populated with the specified Games objects
        for(Games game : gameArray) {//AN enhanced for loop to iterate over the games in the MLB game ArrayList called from the LeagueReader class
            if(season.equals("2007")) {//If the specified season is "2007"...
                if(game.getGameDate().getYear() == 2007) {//Boolean to determine whether the Game object currently being scanned was played in 2007
                    returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                }
            }
            else if(season.equals("2008")) {//If the specified season is "2008"...
                if(game.getGameDate().getYear() == 2008) {//Boolean to determine whether the Game object currently being scanned was played in 2008
                    returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                }
            }
            else if(season.contentEquals("2009")) {//If the specified season is "2009"...
                if(game.getGameDate().getYear() == 2009) {//Boolean to determine whether the Game object currently being scanned was played in 2009
                    returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                }
            }
            else if(season.equals("2010")) {//If the specified season is "2010"...
                if(game.getGameDate().getYear() == 2010) {//Boolean to determine whether the Game object currently being scanned was played in 2010
                    returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                }
            }
            else if(season.equals("2011")) {//If the specified season is "2011"...
                if(game.getGameDate().getYear() == 2011) {//Boolean to determine whether the Game object currently being scanned was played in 2011
                    returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                }
            }
        }
        return returnArray;
    }
    private ArrayList<Games> makeNHLSeason(String season) throws FileNotFoundException, IOException{
        LeagueReader lr = new LeagueReader();//Creates an instance of the LeagueReader class
        ArrayList<Games> gameArray = lr.NHLArray;//Creates an instance of the NHLArray from the LeagueReader Class
        ArrayList<Games> returnArray = new ArrayList<Games>();//Creates an ArrayList that will be returned once it has been populated with the specified Games objects
        for(Games game : gameArray) {//AN enhanced for loop to iterate over the games in the NHL game ArrayList called from the LeagueReader class
            if(season.equals("2007")) {//If the specified season is "2008"...
                if((game.getGameDate().getYear() == 2007 && game.getGameDate().getMonthValue() > 8)
                        || (game.getGameDate().getYear() == 2008 && game.getGameDate().getMonthValue() < 5)) {//Boolean to determine if the game was played the season start and end dates (September '07 and April '09)    
                    returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2008")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2008 && game.getGameDate().getMonthValue() > 8)
                    || (game.getGameDate().getYear() == 2009 && game.getGameDate().getMonthValue() < 5)) {//Boolean to determine if the game was played the season start and end dates (September '08 and April '09)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2009")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2009 && game.getGameDate().getMonthValue() > 8)
                    || (game.getGameDate().getYear() == 2010 && game.getGameDate().getMonthValue() < 5)) {//Boolean to determine if the game was played the season start and end dates (September '09 and April '10)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2010")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2010 && game.getGameDate().getMonthValue() > 8)
                    || (game.getGameDate().getYear() == 2011 && game.getGameDate().getMonthValue() < 5)) {//Boolean to determine if the game was played the season start and end dates (September '10 and April '11)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                     }
                }
           }  
        return returnArray;
    }
    private ArrayList<Games> makeNFLSeason(String season) throws FileNotFoundException, IOException{
        LeagueReader lr = new LeagueReader();//Creates an instance of the LeagueReader class
        ArrayList<Games> gameArray = lr.NFLArray;//Creates an instance of the NFLArray from the LeagueReader Class
        ArrayList<Games> returnArray = new ArrayList<Games>();//Creates an ArrayList that will be returned once it has been populated with the specified Games objects
        for(Games game : gameArray) {//AN enhanced for loop to iterate over the games in the NFL game ArrayList called from the LeagueReader class
            if(season.equals("2007")) {//If the specified season is "2008"...
                if((game.getGameDate().getYear() == 2007 && game.getGameDate().getMonthValue() > 8)
                        || (game.getGameDate().getYear() == 2008 && game.getGameDate().getMonthValue() < 3)) {//Boolean to determine if the game was played the season start and end dates (September '07 and February '08)
                    returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2008")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2008 && game.getGameDate().getMonthValue() > 8)
                    || (game.getGameDate().getYear() == 2009 && game.getGameDate().getMonthValue() < 3)) {//Boolean to determine if the game was played the season start and end dates (September '08 and February '09)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2009")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2009 && game.getGameDate().getMonthValue() > 8)
                    || (game.getGameDate().getYear() == 2010 && game.getGameDate().getMonthValue() < 3)) {//Boolean to determine if the game was played the season start and end dates (September '09 and February '10)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2010")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2010 && game.getGameDate().getMonthValue() > 8)
                    || (game.getGameDate().getYear() == 2011 && game.getGameDate().getMonthValue() < 3)) {//Boolean to determine if the game was played the season start and end dates (September '10 and February '11)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                     }
                }
           }  
        return returnArray;
    }
    private ArrayList<Games> makeNBASeason(String season) throws FileNotFoundException, IOException{
        LeagueReader lr = new LeagueReader();//Creates an instance of the LeagueReader class
        ArrayList<Games> gameArray = lr.NBAArray;//Creates an instance of the NBAArray from the LeagueReader Class
        ArrayList<Games> returnArray = new ArrayList<Games>();//Creates an ArrayList that will be returned once it has been populated with the specified Games objects
        for(Games game : gameArray) {//AN enhanced for loop to iterate over the games in the NBA game ArrayList called from the LeagueReader class
            if(season.equals("2007")) {//If the specified season is "2008"...
                if((game.getGameDate().getYear() == 2007 && game.getGameDate().getMonthValue() > 9)
                        || (game.getGameDate().getYear() == 2008 && game.getGameDate().getMonthValue() < 7)) {//Boolean to determine if the game was played the season start and end dates (October '07 and June '08)
                    returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2008")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2008 && game.getGameDate().getMonthValue() > 9)
                    || (game.getGameDate().getYear() == 2009 && game.getGameDate().getMonthValue() < 7)) {//Boolean to determine if the game was played the season start and end dates (October '08 and June '09)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2009")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2009 && game.getGameDate().getMonthValue() > 9)
                    || (game.getGameDate().getYear() == 2010 && game.getGameDate().getMonthValue() < 7)) {//Boolean to determine if the game was played the season start and end dates (October '09 and June '10)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                    }
                }
                else if(season.equals("2010")) {//If the specified season is "2008"...
                    if((game.getGameDate().getYear() == 2010 && game.getGameDate().getMonthValue() > 9)
                    || (game.getGameDate().getYear() == 2011 && game.getGameDate().getMonthValue() < 7)) {//Boolean to determine if the game was played the season start and end dates (October '10 and June '11)
                returnArray.add(game);//Added to returnArray if the game is part of the 2007 season
                     }
                }
           }  
        return returnArray;
    }
}
