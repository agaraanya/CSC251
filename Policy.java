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
   
   /**
     setPolicyNum method sets the policy number 
     @param The policy number
   */
   public void setPolicyNum(int num){
      policyNum = num;
   }
   
   /**
      getPolicyNum returns the policy number
      @return The policy number
   */
   public int getPolicyNum(){
      return policyNum;
   }
   
   //providerName
   
   /**
      setProviderName sets the policy provider's name
      @param The policy provider's name
   */
   public void setProviderName(String name){
      providerName = name;
   }
   
   /**
      getProviderName returns the policy provider's name
      @return The policy provider's name
   */
   public String getProviderName(){
      return providerName;
   }
   
   //policyHolderFirstName
   
   /**
      setPolicyHolderFirstName sets the policy holder's first name
      @param The policy holder's first name
   */
   public void setPolicyHolderFirstName(String firstName){
      policyHolderFirstName = firstName;
   }
   
   /**
      getPolicyHolderFirstName method gets the first name of the policy holder
      @return The policy holder's first name
   */
   public String getPolicyHolderFirstName(){
      return policyHolderFirstName;
   }
   
   //policyHolderLastName
   
   /**
      setPolicyHolderLastName sets the last name of the policy holder
      @param The policy holder's last name
   */
   public void setPolicyHolderLastName(String lastName){
      policyHolderLastName = lastName;
   }
   
   /**
      getPolicyHolderLastName gets the last name of the policy holder
      @return The policy holder's last name
   */
   public String getPolicyHolderLastName (){
      return policyHolderLastName;
   }
   
   //policyHolderAge
   
   /**
      setPolicyHolderAge method sets the policy holder's age
      @param The age of the policy holder
   */
   public void setPolicyHolderAge (int age){
      policyHolderAge = age;
   }
   
   /**
      setPolicyHolderAge method gets the policy holder's age
      @return the policy holder's age
   */
   public int getPolicyHolderAge(){
      return policyHolderAge;
   }
   
   //policyHolderSmokingStatus
   
   /**
      setPolicyHolderSmokingStatus sets the smoking status of policy holder
      @param The policy holder's smoking status (non-smoker or smoker)
   */
   public void setPolicyHolderSmokingStatus(String status){
      if (status.equalsIgnoreCase("smoker") || status.equalsIgnoreCase("non-smoker")){
         policyHolderSmokingStatus = status;
      }
   }
   
   /**
      getPolicyHolderSmokingStatus gets the policy holder's smoking status
      @return The smoking status of the policy holder
   */
   public String getPolicyHolderSmokingStatus(){
      return policyHolderSmokingStatus;
   }
   
   //policyHolderHeight
   
   /**
      setPolicyHolderHeight sets the height of the policy holder
      @param The height of the policy holder
   */
   public void setPolicyHolderHeight (double height){
      policyHolderHeight = height;
   }
   
   /**
      getPolicyHolderHeight gets the policy holder's height
      @return The height of the policy holder
   */
   public double getPolicyHolderHeight(){
      return policyHolderHeight;
   }
   
   //policyHolderWeight
   
   /**
      setPolicyHolderWeight sets the weight of the policy holder
      @param The weight of the policy holder
   */
   public void setPolicyHolderWeight(double weight){
      policyHolderWeight = weight;
   } 
   
   /**
      getPolicyHolderWeight gets the weight of the policy holder
      @return The weight of the policy holder
   */
   public double getPolicyHolderWeight(){
      return policyHolderWeight;
   }
   
   //BMI method
   
   /**
      calcBmi calculates the BMI of the policy holder based on their height and weight
      @return The policy holder's BMI
   */
   public double calcBmi(){
      return (policyHolderWeight * 703 ) / (policyHolderHeight*policyHolderHeight );
   }
   
   //Insurance policy method
   
   /**
      calcInsurancePolicyPrice calculates the price of the insurance policy based on age, smoking status, and bmi
      @return The policy's price
   */
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