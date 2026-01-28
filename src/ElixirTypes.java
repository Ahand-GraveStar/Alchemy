import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ElixirTypes {
    private final String elixirFilename = "Data/ElixirInformation.csv";
    private ArrayList<Elixir> ElixirList;

    public ElixirTypes() { elixirList = new ArrayList<>(); }

    public ArrayList<Elixir> getElixirList() {
        return elixirList;
    }

    public void loadAidHerbs() {
        Scanner scanner = null;
        getElixirList().clear();
        try {
            String line;
            Elixir elixir;
            scanner = new Scanner(new File(elixirFilename));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
                elixir = convertLineToElixir(line, " ");
                if(elixir != null){
                    addHerb(elixir);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading elixir file: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public void addElixir(Elixir elixir) {
        if (elixirList != null) {
            if (!elixirList.contains(elixir)) {
                elixirList.add(elixir);
            }
            else  {
                updateElixirList(elixir);
            }
        }
    }

    public Elixir findElixir(String elixirName) {
        for(Elixir elixir : elixirList) {
            if(elixir.getElixirName().equals(elixirName)) {
                return elixir;
            }
        }
        return null;
    }

    public boolean elixirExists(String elixirName){
        return findElixir(elixirName) != null;
    }

    public void updateElixirList(Elixir elixir) {
        //change name, money, level
    }

    private Herb convertLineToElixir(String line, String delimiter) {
        String[] fields = line.split(delimiter);
        if(fields.length != 3){
            return null;
        }
        return new Herb(fields[0], fields[1], Integer.parseInt(fields[2]));
    }

    private String convertElixirToLine(Elixir elixir, String delimiter) {
        return toString(elixir, delimiter);
    }

    public String toString(Elixir elixir, String delimiter) {
        return herb.getElixirName() + delimiter + elixir.getElixirName() + delimiter + elixir.getHerbSkillRequirement() + delimiter + elixir.getHerbBaseSellPrice();
    }


}
