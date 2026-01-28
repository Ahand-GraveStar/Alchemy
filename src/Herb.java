public class Herb {
    private String herbName;
    private String herbSkillRequirement;
    private int herbBaseSellPrice;

    public Herb() {
        this.herbName = "N/A";
        this.herbSkillRequirement = "N/A";
        this.herbBaseSellPrice = -1;
    }

    public Herb(String herbName, String herbSkillRequirement, int herbBaseSellPrice) {
        this.herbName = herbName;
        this.herbSkillRequirement = herbSkillRequirement;
        this.herbBaseSellPrice = herbBaseSellPrice;
    }

    public String getHerbName() {
        return herbName;
    }
    public int getHerbBaseSellPrice() { return herbBaseSellPrice; }
    public String getHerbSkillRequirement() {
        return herbSkillRequirement;
    }

}
