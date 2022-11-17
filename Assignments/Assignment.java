package learningmanagementsystem.Assignments;

public class Assignment {
    private String Points;
    private String Name;

    public Assignment(String points, String name) {
        this.Points = points;
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getPoints() {
        return Points;
    }

    public void setPoints(String newPoints) {
        Points = newPoints;
    }
}
