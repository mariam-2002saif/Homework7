public class Students extends Person {
    private String major;
    public Students(String name,String YearBirth,String major)
    {
        super(name,YearBirth);
        this.major=major;
    }
    public String toString()
    {
        String fullInformation =super.toString()+" "+major;
        return fullInformation ;
    }
}
