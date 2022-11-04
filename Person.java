public class Person {
    protected String name;
    protected String YearBirth;
    public Person(String name, String yearOfBirth) {
        this.name = name;
        YearBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBirth() {
        return YearBirth;
    }

    public void setYearBirth(String yearBirth) {
        YearBirth = yearBirth;
    }
    public String toString()
    {
        String fullInformation= name+" "+YearBirth;
        return fullInformation;
    }
}
