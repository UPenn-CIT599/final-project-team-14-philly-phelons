import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
public class LeagueReader {

    public void readCrimes(){
       int count = 0;
        try {
        Reader reader = Files.newBufferedReader(Paths.get("MLB Games.csv"));
        
        CsvToBean<mlb> csvToBean = new CsvToBeanBuilder<mlb>(reader)
                .withType(mlb.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
        
        for(mlb game : (Iterable<mlb>) csvToBean) {
            if (game.getTeam1().equals("")){
                count += Integer.parseInt(game.getScore1());
            }
        }

    reader.close();

    System.out.println("There were " + count + " DUIs");

        } catch (IOException e) {
            e.printStackTrace();
        }
}
    public static void main(String[] args) {
        LeagueReader lr = new LeagueReader();
        lr.readCrimes();
    }
}
