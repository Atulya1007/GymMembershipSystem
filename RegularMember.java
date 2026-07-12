public class RegularMember extends Gymmember //override after writing getter
{
    private final int attendanceLimit;
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;
    
    public RegularMember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate, String referralSource)
    {
        super(id, name, location, phone, email, gender, DOB, membershipStartDate);
        this.attendanceLimit = 30;
        this.isEligibleForUpgrade = false;
        this.removalReason = "";
        this.referralSource = referralSource;
        this.plan = "basic";
        this.price = 6500;
    }
    
    public int getattendanceLimit(){
        return attendanceLimit;
    }
    
    public boolean getisEligibleForUpgrade(){
        return isEligibleForUpgrade;
    }
    
    public String getremovalReason(){
        return removalReason;
    }
    
    public String getreferralSource(){
        return referralSource;
    }
    
    public String getplan(){
        return plan;
    }
    
    public double getprice(){
        return price;
    }
    
    @Override
    public void markAttendance(){
        this.attendance++;
        this.loyaltyPoints+=5;
        if (this.attendance >= attendanceLimit){
            this.isEligibleForUpgrade = true;
        }
    }
    
    public double getPlanPrice(String plan){
        switch(plan){
            case"basic":
            return 6500;
            case"standard":
            return 12500;
            case"deluxe":
            return 18500;
            default:
                return -1.0;
                
         }
        
    }
    
    public String upgradePlan(String plan){
        if(this.getplan().equals(plan)){
            return"You have already purchased this experience";
        }
        
        double newPrice=this.getPlanPrice(plan);
        if(newPrice==-1.0){
            return"This plan doesnot exist so please choose a appropriate plan that is available in our system ";
        }
        
        if (attendance >attendanceLimit){
            this.plan=plan;
            this.price=newPrice;
            this.isEligibleForUpgrade=true;
            return"Congrats you have upgraded your plan succesfully";
        }
        else{
            return"You are inelligible for an upgrade because you are absent in most of you gym sessions.Please try to upgrade after you have attended more sessions. Thank you";
        }
        
         }
         
         public void revertRegularMember(String removalReason){
             this.isEligibleForUpgrade=false;
             this.plan="basic";
             this.price=6500.0;
             this.removalReason="removalReason";
             super.resetmember();
              }
               @Override
              public void display(){
                  super.display();
                  System.out.println("The plan choosen by a member is " + this.plan);
                  System.out.println("The price of a membership is " + this.price);
                  if(!this.removalReason.isEmpty()){
                      System.out.println("The removable reason of a membership is" + this.removalReason);
                  }
                  
    }
}

                  
                
                
              
              
              
              
              
