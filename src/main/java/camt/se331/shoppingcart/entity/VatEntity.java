package camt.se331.shoppingcart.entity;

public class VatEntity {

    private static VatEntity vatEntity;
    public static VatEntity getInstance(){
        if (vatEntity == null){
            vatEntity = new VatEntity();
        }
        return vatEntity;
    }
    private  double vat;
    public double getVat(){
        return vat;
    }

    // This method is used for test only
    protected void setVat(double vat){
        this.vat = vat;
    }

}
