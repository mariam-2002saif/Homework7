public class Instructor extends Person {
    private double salary;
    public Instructor(String name,String YearBirth,double salary)
    {
        super(name,YearBirth);
        this.salary=salary;
    }
    public String toString()
    {
        String fullInformation=super.toString()+" "+salary;
        return fullInformation;
    }
}
