public class Policy{
   
   private String policyNum;
   private String providerName;
   public static int numPolicies = 0;
   private PolicyHolder policyHolder;
      
   //no arg constructor
   public Policy(){
      policyNum = "123";
      providerName = "State Farm";
      numPolicies++;
      policyHolder = new PolicyHolder();
   }
   
   //constructor with arguments
   public Policy(String policyNum, String providerName, String fName, String lName, int age, String smokingStatus, double height, double weight){
      this.policyNum = policyNum;
      this.providerName = providerName; 
      numPolicies++;
      policyHolder = new PolicyHolder(fName, lName, age, smokingStatus, height, weight);
   }
   
   //setters and getters
   
   //policyNum
   
   /**
     setPolicyNum method sets the policy number 
     @param The policy number
   */
   public void setPolicyNum(String num){
      policyNum = num;
   }
   
   /**
      getPolicyNum returns the policy number
      @return The policy number
   */
   public String getPolicyNum(){
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
   
   public String getSmokingStatus(){
      return policyHolder.getSmokingStatus();
   }
   
   public double getBMI(){
      return policyHolder.calcBmi();
   }
   
   public double getPrice(){
      return policyHolder.calcInsurancePolicyPrice();
   }
   
   //toString
   public String toString(){
      return ("Policy Number: " + policyNum + "\nProvider Name: " + providerName + "\n" + policyHolder.toString());
   }
}