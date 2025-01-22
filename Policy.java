public class Policy{
   
   private int policyNum;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String policyHolderSmokingStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   //no arg constructor
   public Policy(){
      policyNum = 123;
      providerName = "State Farm";
      policyHolderFirstName = "John";
      policyHolderLastName = "Doe";
      policyHolderAge = 20;
      policyHolderSmokingStatus = "non-smoker";
      policyHolderHeight = 60.0;
      policyHolderWeight = 200;
   }
   
   //constructor with arguments
   public Policy(int policyNum, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight){
      this.policyNum = policyNum;
      this.providerName = providerName; 
      policyHolderFirstName = firstName;
      policyHolderLastName = lastName;
      policyHolderAge = age;
      policyHolderSmokingStatus = smokingStatus;
      policyHolderHeight = height;
      policyHolderWeight = weight;
   }
   
   //setters and getters
   
   //policyNum
   public void setPolicyNum(int num){
      policyNum = num;
   }
   
   public int getPolicyNum(){
      return policyNum;
   }
   
   //providerName
   public void setProviderName(String name){
      providerName = name;
   }
   
   public String getProviderName(){
      return providerName;
   }
   
   //policyHolderFirstName
   public void setPolicyHolderFirstName(String firstName){
      policyHolderFirstName = firstName;
   }
   
   public String getPolicyHolderFirstName(){
      return policyHolderFirstName;
   }
   
   //policyHolderLastName
   public void setPolicyHolderLastName(String lastName){
      policyHolderLastName = lastName;
   }
   
   public String getPolicyHolderLastName (){
      return policyHolderLastName;
   }
   
   //policyHolderAge
   public void setPolicyHolderAge (int age){
      policyHolderAge = age;
   }
   
   public int getPolicyHolderAge(){
      return policyHolderAge;
   }
   
   //policyHolderSmokingStatus
   public void setPolicyHolderSmokingStatus(String status){
      if (status.equalsIgnoreCase("smoker") || status.equalsIgnoreCase("non-smoker")){
         policyHolderSmokingStatus = status;
      }
   }
   
   public String getPolicyHolderSmokingStatus(){
      return policyHolderSmokingStatus;
   }
   
   //policyHolderHeight
   public void setPolicyHolderHeight (double height){
      policyHolderHeight = height;
   }
   
   public double getPolicyHolderHeight(){
      return policyHolderHeight;
   }
   
   //policyHolderWeight
   public void setPolicyHolderWeight(double weight){
      policyHolderWeight = weight;
   } 
   
   public double getPolicyHolderWeight(){
      return policyHolderWeight;
   }
   
   //BMI method
   public double calcBmi(){
      return (policyHolderWeight * 703 ) / (policyHolderHeight*policyHolderHeight );
   }
   
   //Insurance policy method
   public double calcInsurancePolicyPrice(){
      double price = 600;
      if (policyHolderAge > 50){
         price += 75;
      }
      if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")){
         price += 100;
      }
      if (calcBmi() > 35){
         price += ((calcBmi()-35)*20);
      }
      return price;
   }

}