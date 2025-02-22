public class Policy{
   
   private int policyNum;
   private String providerName;
   private static int numPolicies = 0;
   private PolicyHolder policyHolder;
      
   //no arg constructor
   public Policy(){
      policyNum = 123;
      providerName = "State Farm";
      numPolicies++;
      policyHolder = new PolicyHolder();
   }
   
   //constructor with arguments
   public Policy(int policyNum, String providerName, String fName, String lName, int age, String smokingStatus, double height, double weight){
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
   
   //toString
   public String toString(){
      return ("Policy Number: " + policyNum + "\nProvider Name: " + providerName);
   }
}