interface Item {
    String getCategory();
    String getManufacturer();
    double getSales(String startDate, String endDate);
}

class Hardware implements Item {
    private String category;
    private String manufacturer;

    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getSales(String startDate, String endDate) {
        return 0.0;
    }
}

class Software implements Item {
    private String type;
    private String operatingSystem;

    public Software(String type, String operatingSystem) {
        this.type = type;
        this.operatingSystem = operatingSystem;
    }

    public String getCategory() {
        return "Software";
    }

    public String getManufacturer() {
        return "N/A";
    }

    public double getSales(String startDate, String endDate) {
        return 0.0;
    }
}
