package excercises;

public class Player {
    private  String playerName;
    private  int matchesPlayed;
    private  int runs;
    private  int highestscore;
    private  String country;

    Player(String playerName,
            int matchesPlayed,
            int runs,
            int highestscore,
            String country) {
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
        this.runs = runs;
        this.highestscore = highestscore;
        this.country = country;
    }

   
    @Override
    public String toString() {
        return "Player [playerName=" + playerName + ", matchesPlayed=" + matchesPlayed + ", runs=" + runs
                + ", highestscore=" + highestscore + ", country=" + country + "]";
    }


    public String getPlayerName() {
        return playerName;
    }


    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public int getMatchesPlayed() {
        return matchesPlayed;
    }


    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }


    public int getRuns() {
        return runs;
    }


    public void setRuns(int runs) {
        this.runs = runs;
    }


    public int getHighestscore() {
        return highestscore;
    }


    public void setHighestscore(int highestscore) {
        this.highestscore = highestscore;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }

}
