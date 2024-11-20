package Week7;

public class Course implements Comparable {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNrOfStudyPoints() {
        return nrOfStudyPoints;
    }

    public void setNrOfStudyPoints(int nrOfStudyPoints) {
        this.nrOfStudyPoints = nrOfStudyPoints;
    }

    public int getMaxNumOfStudents() {
        return maxNumOfStudents;
    }

    public void setMaxNumOfStudents(int maxNumOfStudents) {
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public Course(String title, int nrOfStudyPoints, int maxNumOfStudents) {
        this.title = title;
        this.nrOfStudyPoints = nrOfStudyPoints;
        this.maxNumOfStudents = maxNumOfStudents;
    }
    private String title;
    private int nrOfStudyPoints;
    private int maxNumOfStudents;

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", nrOfStudyPoints=" + nrOfStudyPoints +
                ", maxNumOfStudents=" + maxNumOfStudents +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return getTitle().compareTo(((Course)o).getTitle());
    }

}
