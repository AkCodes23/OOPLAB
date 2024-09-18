interface Item {
    double getTotalSales();
}

class Hardware implements Item {
    String category;
    String manufacturer;
    double[] sales;

    public Hardware(String category, String manufacturer, double[] sales) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    public double getTotalSales() {
        double total = 0;
        for (double sale : sales) {
            total += sale;
        }
        return total;
    }
}

class Software implements Item {
    String type;
    String operatingSystem;
    double[] sales;

    public Software(String type, String operatingSystem, double[] sales) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.sales = sales;
    }

    public double getTotalSales() {
        double total = 0;
        for (double sale : sales) {
            total += sale;
        }
        return total;
    }
}

class Main {
    public static void main(String[] args) {
        double[] hardwareSales = {1000, 1500, 1200};
        double[] softwareSales = {2000, 2500, 2300};

        Hardware hardware = new Hardware("Laptop", "Dell", hardwareSales);
        Software software = new Software("Antivirus", "Windows", softwareSales);

        System.out.println("Total hardware sales for last 3 months: " + hardware.getTotalSales());
        System.out.println("Total software sales for last 3 months: " + software.getTotalSales());
    }
}
