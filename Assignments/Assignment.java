package learningmanagementsystem.Assignments;

public class Assignment {
    private String Points;
    private String Name;

    public void Assigment(String points, String name) {
        this.Points = points;
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getPoints() {
        return Points;
    }
}
