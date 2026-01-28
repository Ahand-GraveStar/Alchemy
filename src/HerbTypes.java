import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HerbTypes {
    private final String herbFilename = "Data/HerbInformation.csv";
    private ArrayList<Herb> herbList;

    public HerbTypes() {
        herbList = new ArrayList<>();
    }

    public ArrayList<Herb> getHerbList() {
        return herbList;
    }

    public void loadAidHerbs() {
        Scanner scanner = null;
        getHerbList().clear();
        try {
            String line;
            Herb herb;
            scanner = new Scanner(new File(herbFilename));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
                herb = convertLineToHerb(line, " ");
                if(herb != null){
                    addHerb(herb);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading herb file: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public void addHerb(Herb herb) {
        if (herbList != null) {
            if (!herbList.contains(herb)) {
                herbList.add(herb);
            }
            else  {
                updateHerbList(herb);
            }
        }
    }

    public Herb findHerb(String herbName) {
        for(Herb herb : herbList) {
            if(herb.getHerbName().equals(herbName)) {
                return herb;
            }
        }
        return null;
    }

    public boolean herbExists(String herbName){
        return findHerb(herbName) != null;
    }

    public void updateHerbList(Herb herb) {
        //change name, money, level
    }

    private Herb convertLineToHerb(String line, String delimiter) {
        String[] fields = line.split(delimiter);
        if(fields.length != 3){
            return null;
        }
        return new Herb(fields[0], fields[1], Integer.parseInt(fields[2]));
    }

    private String convertHerbToLine(Herb herb, String delimiter) {
        return toString(herb, delimiter);
    }

    public String toString(Herb herb, String delimiter) {
        return herb.getHerbName() + delimiter + herb.getHerbName() + delimiter + herb.getHerbSkillRequirement() + delimiter + herb.getHerbBaseSellPrice();
    }

}
