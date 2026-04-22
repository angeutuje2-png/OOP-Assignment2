public class Driver {

    private String driverID;
    private String name;
    private String licenseNumber;
    private int experienceYears;


    public Driver() {}


    public Driver(String driverID, String name, String licenseNumber, int experienceYears) {
        this.driverID = driverID;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }


    public String getDriverID() { return driverID; }
    public void setDriverID(String driverID) { this.driverID = driverID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }


    @Override
    public String toString() {
        return "Driver Details: [" +
                "ID: '" + driverID + '\'' +
                ", Name: '" + name + '\'' +
                ", License: '" + licenseNumber + '\'' +
                ", Experience: " + experienceYears + " years" +
                ']';
    }
}
