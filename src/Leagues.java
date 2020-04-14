import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

import com.opencsv.CSVReader;

public class Leagues {
    ArrayList<Leagues> NHLArray;
    ArrayList<Leagues> NFLArray;
    ArrayList<Leagues> MLBArray;
    ArrayList<Leagues> NBAArray;
    
    public Leagues() {
        
    }
    
    private ArrayList<Games> readLeagueData(String league){
        Object NHL = new Object();
        String fileName = "";
        if(league.equals("NHL")) { 
            fileName = "NHL Games.csv";
            readNHLGame(fileName);
        }
        if(league.equals("NFL")) { 
            fileName = "nfl_elo.csv";
            readNFLGame(fileName);
        }
        if(league.equals("NBA")) { 
            fileName = "NBA Games.csv";
            readNBAGame(fileName);
        }
        if(league.contentEquals("MLB")) { 
            fileName = "MLB Games.csv";
            readMLBGame(fileName);
        }            
            return null;
        }
    
    private ArrayList<Games> readNFLGame(String file){
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        CSVReader reader = new CSVReader(br);
        
        
    }
    private ArrayList<Games> readNHLGame(String file){
        
    }
    private ArrayList<Games> readNBAGame(String file){
    
    }
    private ArrayList<Games> readMLBGame(String file){
    
    }
    }

