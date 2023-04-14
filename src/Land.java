public class Land {
    private String id;
    private String ownerName;
    private String houseType;
    private double area;

    //default constructor
    public Land() 
    {
        id = "";
        ownerName = "";
        houseType = "";
        area = 0;
    }

    //normal constructor
    public Land(String id, String ownerName, String houseType, double area)
    {
        this.id = id;
        this.ownerName = ownerName;
        this.houseType = houseType;
        this.area = area;
    }

    //copy constructor
    public Land(Land copyLand) 
    {
        this.id = copyLand.id;
        this.ownerName = copyLand.ownerName;
        this.houseType = copyLand.houseType;
        this.area = copyLand.area;
    }

    //getter
    public String getId()
    {
        return this.houseType;
    }
    
    public String getOwnerName()
    {
        return this.ownerName;
    }

    public String getHouseType()
    {
        return this.houseType;
    }

    public double getArea()
    {
        return this.area;
    }

    //processor
    public double calcTaxPrice()
    {
        double taxRate = 0, taxPrice = 0; // RM-per-m^2
        switch (getHouseType().charAt(0)) {
            case 't':
            case 'T':
                taxRate = 10;           
                break;
            case 's':
            case 'S':
                taxRate = 15;           
                break;
            case 'b':
            case 'B':
                taxRate = 20;           
                break;
            case 'c':
            case 'C':
                taxRate = 30;           
                break;
            default:
                System.out.println("Invalid house type.");
                break;
        }
        taxPrice = taxRate*getArea();
        return taxPrice;
    }

    //printer
    public String toString()
    {
        return String.format("%nLand ID:\t%s%nOwner Name:\t%s%nHouse Type:\t%s%nArea of land:\t%.2f m^2%nTax Price:\tRM%.2f%n", id, ownerName, houseType, area, calcTaxPrice());
    }
}
