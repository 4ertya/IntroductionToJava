package by.epam;

public class District {
    private String districtName;
    private City districtCenter;

    public District(String districtName, City districtCenter) {
        this.districtName = districtName;
        this.districtCenter = districtCenter;
    }

    String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

}
