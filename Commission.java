public class Commission extends Hourly {
    
    public double totalSales;
    
    public double commRate;

    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double comm ) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commRate = comm;
    }
    
    public void addSales (double moreSales){
        totalSales += moreSales;
    }
 
    @Override
    public double pay() {
        double payment = super.pay() + (totalSales*commRate);
        totalSales = 0;
        return payment;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales : " + totalSales;
        return result;
    }
    
}
