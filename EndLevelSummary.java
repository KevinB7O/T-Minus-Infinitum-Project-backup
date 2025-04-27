import acm.graphics.*;
import java.awt.*;
import acm.program.*;

public class EndLevelSummary extends GCompound {
    private int score;
    private int bonusPoints;
    private int elapsedTime;
    private GLabel levelSummary;
    private GLabel scoreLabel;
    private GLabel bonusPointsLabel;
    private GLabel elapsedTimeLabel;
    private GRect nextButton;
    private GLabel nextLabel;

    public EndLevelSummary(int score, int bonusPoints, int elapsedTime, Runnable nextLevelAction) {
        this.score = score;
        this.bonusPoints = bonusPoints;
        this.elapsedTime = elapsedTime;

        
        //Display level summary text
        levelSummary = new GLabel("Level Summary");
        levelSummary.setFont("SansSerif-bold-26");
        levelSummary.setColor(Color.MAGENTA);
        add(levelSummary, 0, -30);
        
        // Display score
        scoreLabel = new GLabel("Score: " + score);
        scoreLabel.setFont("SansSerif-bold-16");
        scoreLabel.setColor(Color.BLACK);
        add(scoreLabel, 0, 0);

        // Display bonus points
        bonusPointsLabel = new GLabel("Bonus Points: " + bonusPoints);
        bonusPointsLabel.setFont("SansSerif-bold-16");
        bonusPointsLabel.setColor(Color.RED);
        add(bonusPointsLabel, 0, 30);

        // Display elapsed time
        elapsedTimeLabel = new GLabel("Time: " + elapsedTime + "s");
        elapsedTimeLabel.setFont("SansSerif-bold-16");
        elapsedTimeLabel.setColor(Color.BLUE);
        add(elapsedTimeLabel, 0, 60);

        // Create "Next" button
        nextButton = new GRect(0, 90, 100, 40);
        nextButton.setFilled(true);
        nextButton.setFillColor(Color.LIGHT_GRAY);
        add(nextButton);

        nextLabel = new GLabel("Next");
        nextLabel.setFont("SansSerif-bold-16");
        nextLabel.setColor(Color.BLACK);
        add(nextLabel, 35, 115);
        
        // Add mouse listener for "Next" button
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent e) {
                nextLevelAction.run(); // Call the provided callback (next level)
            }
        });
    }
}