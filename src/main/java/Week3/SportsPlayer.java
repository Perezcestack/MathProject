package Week3;

public class SportsPlayer {
    public String getTeam() {
        return team;
    }
    public void playsFor(String name){
        System.out.println(name + " plays for the " + team);
    }
    public void tCIS (String teamColor){
        System.out.println(team + "s colors are " + teamColor);
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    private String team;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    public SportsPlayer() {
    }
    private String name = "";
    private String sport = "";
    private String dateOfBirth = "";
    private String teamColor = "";
    private String height = "";



}
