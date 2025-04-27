
public class GameData {
	private int totalScore = 0;
    private int totalBonusPoints = 0;
	
	private static GameData instance;
    
    /*public GameData (int totalScore, int totalBonusPoints) {
    	this.totalScore = totalScore;
    	this.totalBonusPoints = totalBonusPoints;
    }*/
	
	private GameData() {
		
	}  
	
	public static GameData getInstance() {
		if (instance == null) {
			instance = new GameData();
		}
		return instance;
	}
    
    
    //Getter and setter
    public int getTotalScore() {
        return totalScore;
    }
    
    public void setTotalScore (int totalScore) {
    	this.totalScore = totalScore;
    }
    
    //Getter and setter
    public int getTotalBonusPoints() {
        return totalBonusPoints;
    }
    public void setTotalBonusPoints (int totalBonusPoints) {
    	this.totalBonusPoints = totalBonusPoints;
    }
    
    public void addScore(int score) {
        totalScore += score;
    }
    
    public void addBonus(int bonus) {
        totalBonusPoints += bonus;
    }
    
}
