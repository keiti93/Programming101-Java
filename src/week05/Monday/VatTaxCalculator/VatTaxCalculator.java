package week05.Monday.VatTaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class VatTaxCalculator {

    public List<CountryVatTax> countries = new ArrayList<>();;

    public VatTaxCalculator(List<CountryVatTax> countries) {
        this.countries = countries;
    }

    public double getCountryVatTax(int id) {
        boolean flag = false;
        try {
        for (int i = 0; i < countries.size(); i++) {
            
                if (countries.get(i).getCountryId() == id) {
                    flag = true;
                    return countries.get(i).getVATTax();
                    }}
        if (flag == false){
        throw new MyException("NotAvailableInInventoryException");}
        }catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    public double calculateTax(double product, int countryId){
        double result = getCountryVatTax(countryId);
        if (result!=-1){
            return product + (result*product/100);
        }
        return 0;
    }
    
    public double calculateTax(double product){
        double result = 0;
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).isDefault() == true){
                result = getCountryVatTax(i);
            }
        }
        if (result!=-1){
            return product + (result*product/100);
        }
        return result;}

    public static void main(String[] args){
        
        List<CountryVatTax> c= new ArrayList<>();
        CountryVatTax bulgaria = new CountryVatTax(1, 20);
        bulgaria.setDefault(true);
        c.add(bulgaria);
        CountryVatTax spain = new CountryVatTax(2, 19);
        c.add(spain);
        VatTaxCalculator countries = new VatTaxCalculator(c);
        System.out.println(countries.calculateTax((double)80));
    }
}
