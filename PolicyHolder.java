public class PolicyHolder{
   //fields
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //constructors
   //no arg constructor
   public PolicyHolder(){
      firstName = "John";
      lastName = "Doe";
      age = 20;
      smokingStatus = "non-smoker";
      height = 60.0;
      weight = 200;
   }
   
   //constructor with arguments
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight){
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   //field methods: setters and getters
   
  //policyHolderFirstName
   
   /**
      setPolicyHolderFirstName sets the policy holder's first name
      @param The policy holder's first name
   */
   public void setfirstName(String name){
      firstName = name;
   }
   
   /**
      getPolicyHolderFirstName method gets the first name of the policy holder
      @return The policy holder's first name
   */
   public String getFirstName(){
      return firstName;
   }
   
   //policyHolderLastName
   
   /**
      setPolicyHolderLastName sets the last name of the policy holder
      @param The policy holder's last name
   */
   public void setLastName(String name){
      lastName = name;
   }
   
   /**
      getPolicyHolderLastName gets the last name of the policy holder
      @return The policy holder's last name
   */
   public String getLastName (){
      return lastName;
   }
   
   //policyHolderAge
   
   /**
      setPolicyHolderAge method sets the policy holder's age
      @param The age of the policy holder
   */
   public void setAge (int a){
      age = a;
   }
   
   /**
      setPolicyHolderAge method gets the policy holder's age
      @return the policy holder's age
   */
   public int getAge(){
      return age;
   }
   
   //policyHolderSmokingStatus
   
   /**
      setPolicyHolderSmokingStatus sets the smoking status of policy holder
      @param The policy holder's smoking status (non-smoker or smoker)
   */
   public void setSmokingStatus(String status){
      if (status.equalsIgnoreCase("smoker") || status.equalsIgnoreCase("non-smoker")){
         smokingStatus = status;
      }
   }
   
   /**
      getPolicyHolderSmokingStatus gets the policy holder's smoking status
      @return The smoking status of the policy holder
   */
   public String getSmokingStatus(){
      return smokingStatus;
   }
   
   //policyHolderHeight
   
   /**
      setPolicyHolderHeight sets the height of the policy holder
      @param The height of the policy holder
   */
   public void setHeight (double h){
      height = h;
   }
   
   /**
      getPolicyHolderHeight gets the policy holder's height
      @return The height of the policy holder
   */
   public double getHeight(){
      return height;
   }
   
   //policyHolderWeight
   
   /**
      setPolicyHolderWeight sets the weight of the policy holder
      @param The weight of the policy holder
   */
   public void setWeight(double w){
      weight = w;
   } 
   
   /**
      getPolicyHolderWeight gets the weight of the policy holder
      @return The weight of the policy holder
   */
   public double getWeight(){
      return weight;
   }
   
   //BMI method
   
   /**
      calcBmi calculates the BMI of the policy holder based on their height and weight
      @return The policy holder's BMI
   */
   public double calcBmi(){
      return (weight * 703 ) / (height*height );
   }
   
   //Insurance policy method
   
   /**
      calcInsurancePolicyPrice calculates the price of the insurance policy based on age, smoking status, and bmi
      @return The policy's price
   */
   public double calcInsurancePolicyPrice(){
      double price = 600;
      if (age > 50){
         price += 75;
      }
      if (smokingStatus.equalsIgnoreCase("smoker")){
         price += 100;
      }
      if (calcBmi() > 35){
         price += ((calcBmi()-35)*20);
      }
      return price;
   }
   
   //toString
   public String toString(){
      return ("Policy Holder First Name: " + firstName + "\nPolicy Holder Last Name: " + lastName + "\nPolicy Holder Age: " + age + "\nPolicy Holder Smoking Status: " + smokingStatus + "\nPolicy Holder Height: " + height + "\nPolicy Holder Weight: " + weight);
   }

}//end class