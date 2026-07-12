public abstract class Gymmember// abstract add more security 
{
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;
    
    
    
    public Gymmember(int id, String name, String location, String phone, String email, String gender, String DOB, String membershipStartDate) 
    
    {
        this.id=id;
        this.name=name;
        this.location=location;
        this.phone=phone;
        this.email=email;
        this.gender=gender;
        this.DOB=DOB;
        this.membershipStartDate=membershipStartDate;
        this.attendance=0;
        this.loyaltyPoints=0.0;
        this.activeStatus=false;
    }
    // adding corresponding accessor method for each attribute
    
    public int getid(){
        return id;
    }
    
    public String getname(){
        return name;
    }
    
    public String getlocation(){
        return location;
    }
    
    public String getphone(){
        return phone;
    }
    
    public String getemail(){
        return email;
    }
    
    public String getgender(){
        return gender;
    }
    
    public String getDOB(){
        return DOB;
    }
    
    public String getmembershipStartDate(){
        return membershipStartDate;
    }
    
    public int getattendance(){
        return attendance;
    }
    
    public double getloyaltyPoints(){
        return loyaltyPoints;
    }
    
    public boolean getactiveStatus(){
        return activeStatus; 
    }
    
    public abstract void markAttendance();
    
    public void activatemembership(){
        this.activeStatus=true;
    }
    
    public void deactivemembership(){
        if(this.activeStatus){
            this.activeStatus = false;
        }
        else{
            System.out.println("Your membership is already inactive");
        }
    }
    
    public void resetmember(){
        this.activeStatus=false;
        this.attendance=0;
        this.loyaltyPoints=0.0;   
    }
    
    public void display(){
        System.out.println("The id of memeber is " + this.id);
        System.out.println("The name of memeber is " + this.name);
        System.out.println("The address of member is " + this.location);
        System.out.println("The phone number of memeber is " + this.phone);
        System.out.println("The email of memeber is " + this.email);
        System.out.println("The gender of memeber is " + this.gender);
        System.out.println("The date of birth of memeber is " + this.DOB);
        System.out.println("The start of membership of memeber is " + this.membershipStartDate);
        System.out.println("The attendance of memeber is " + this.attendance);
        System.out.println("The loyalty points of memeber is " + this.loyaltyPoints);
        System.out.println("The active status of member is" + this.activeStatus);
        
    }
    

    
    
    
    

    
    
}
