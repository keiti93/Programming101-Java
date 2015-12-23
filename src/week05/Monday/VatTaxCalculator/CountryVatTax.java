package week05.Monday.VatTaxCalculator;

public class CountryVatTax {

    private int countryId;
    private double VATTax;
    private boolean isDefault;
    
    public CountryVatTax (int countryId, double VATTax){
        this.countryId = countryId;
        this.VATTax = VATTax;
        isDefault = false;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public double getVATTax() {
        return VATTax;
    }

    public void setVATTax(double vATTax) {
        VATTax = vATTax;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }
}
