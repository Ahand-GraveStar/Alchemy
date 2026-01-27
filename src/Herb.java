public class Herb {
    private String herbName;
    private int herbBaseSellPrice;
    private String herbSkillRequirement;

    Herb(String herbName, int herbBaseSellPrice, String herbSkillRequirement) {
        this.herbName = herbName;
        this.herbSkillRequirement = herbSkillRequirement;
        this.herbBaseSellPrice = herbBaseSellPrice;
    }

    private void setHerbName() {
        this.herbName = "N/A";
    }
    private void setHerbName(String herbName) {
        this.herbName = herbName;
    }
    private void setHerbBaseSellPrice() {
        this.herbBaseSellPrice = -1;
    }
    private void setHerbBaseSellPrice(int herbBaseSellPrice) {
        this.herbBaseSellPrice = herbBaseSellPrice;
    }
    private void setHerbSkillRequirement() {
        this.herbSkillRequirement = "N/A";
    }
    private void setHerbSkillRequirement(String herbSkillRequirement) {
        this.herbSkillRequirement = herbSkillRequirement;
    }


    public String getHerbName() {
        return herbName;
    }
    public int getHerbBaseSellPrice() {
        return herbBaseSellPrice;
    }
    public String getHerbSkillRequirement() {
        return herbSkillRequirement;
    }
}
