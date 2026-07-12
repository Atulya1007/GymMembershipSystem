

public class PremiumMember extends Gymmember
{
    private final double premiumCharge;
    private String personalTrainer;
    private boolean isFullPayment;
    private double paidAmount;
    private double discountAmount;
    
    
    public PremiumMember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate ,String personalTrainer){
        super( id, name, location, phone, email, gender, DOB, membershipStartDate);
        this.premiumCharge= 50000;
        this.personalTrainer=personalTrainer;
        this.isFullPayment=false;
        this.paidAmount=0;
        this.discountAmount=0;
        
    }
    
    public final double premiumCharge(){
        return premiumCharge;
    }
    
    public String getpersonalTrainer(){
        return personalTrainer;
    }
    
    public boolean getisFullPayment(){
        return isFullPayment;
    }
    
    public double getpaidAmount(){
        return paidAmount;
    }
    
    public double getdiscountAmount(){
        return discountAmount;
        
    
    }
    
    @Override
    public void markAttendance(){
        this.attendance++;
        this.loyaltyPoints += 10;
    }
    
    public String payDueAmount(double paidAmount)
    {
        if(isFullPayment){
            return"Your payment has already been full. This is extent of your payment";
        }
        else if(this.paidAmount + paidAmount > this.premiumCharge){
            return"Please review your payment because it already extends our premium charge";
            
        }
        else{
            this.paidAmount += paidAmount;
            double remainingAmount=this.premiumCharge-this.paidAmount;
            this.isFullPayment=this.paidAmount>=this.premiumCharge;
            return"Your transaction has been completed " + remainingAmount + "is to paid on this account";
        }
    }
    
    public String calculateDiscount() {
    if (isFullPayment) {
        double discount = this.premiumCharge * 0.10;
        this.discountAmount = discount;
        return "The discount on your charge is  " + discount;
    } 
    else {
        return "Your discount is not applicable since the payment amount was not full";
    }
    }
    
    public void revertPremiumMember() {
    super.resetmember();
    this.personalTrainer = "";
    this.isFullPayment = false;
    this.paidAmount = 0;
    this.discountAmount = 0;
}
@Override
public void display() {
    super.display();
    System.out.println("The personal Trainer choosen by a member is " + this.personalTrainer);
    System.out.println("Amount paid by a member is  " + this.paidAmount);
    System.out.println("Is Full Payment: " + this.isFullPayment);
    double remainingAmount = this.premiumCharge - this.paidAmount;
    if (this.isFullPayment) {
        System.out.println("The discount on your charges is " + this.discountAmount);
    }
    System.out.println("The RemainingAmount to be paid is  " + remainingAmount);
}



    
            
    
    
    
    

    
    
  
}
