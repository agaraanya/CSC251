import java.util.Scanner;

public class Project_Aanya_Agarwal{
public static void main(String[] args){
   //variables
   int policyNum, age;
   String providerName, firstName, lastName, smokingStatus;
   double height, weight;
   Scanner input = new Scanner (System.in);
   
   //ask user for variable inputs
   System.out.print("Please enter the Policy Number: ");
   policyNum = input.nextInt();
   
   System.out.print("Please enter the Provider Name: ");
   providerName = input.nextLine();
   
   System.out.print("Please enter the Policyholder's First Name: ");
   firstName = input.nextLine();
   
   System.out.print("Please enter the Policyholder's Last Name: ");
   lastName = input.nextLine();
   
   System.out.print("Please enter the Policyholder's Age: ");
   age = input.nextInt();
   
   System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   smokingStatus = input.nextLine();
   
   System.out.print("Please enter the Policyholder's Height (in inches): ");
   height = input.nextDouble();

   System.out.print("Please enter the Policyholder's Weight (in pounds): ");
   weight = input.nextDouble();
   
   
   //initialize Policy
   Policy policy = new Policy (policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);
   
   //output
   System.out.println("Policy Number: " + policy.getPolicyNum());
   System.out.println("Provider Name: " + policy.getProviderName());
   System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFirstName());
   System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLastName());
   System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
   System.out.println("Policyholder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
   System.out.printf("Policyholder's Height: %.1f inches\n", policy.getPolicyHolderHeight());
   System.out.printf("Policyholder's Weight: %.1f pounds\n", policy.getPolicyHolderWeight());
   System.out.printf("Policyholder's BMI: %.2f\n", policy.calcBmi());
   System.out.printf("Policy Price: $%.2f", policy.calcInsurancePolicyPrice());

}
}