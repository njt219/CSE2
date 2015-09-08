///////////////////////////////////////////////////////////////////////
//Nicholas Tulp
//hw02 
//manipulating data stored in variables, running simple calculations and printing numerical output

// Declare the public class
public class Arithmetic{
// Declare the main method
    public static void main(String[] args) {

int nSocks = 3; //number of socks being bought
int nGlasses = 6; //number of glasses being bought
int nEnvelopes = 1; //number of envelopes being bought

double sockCost = 2.58; //the price of 1 sock
double drinking_glassCost = 2.29; //the price of 1 drinking glass
double envelopeCost = 3.25; //the price of 1 envelope

double socks = 7.74; //the price of 3 socks
double drinking_glasses = 13.74; //the price of 6 drinking glasses
double envelope = 3.25; //the price of 1 envelope
double PA_sales_tax = .06; // the pennslyvania sales tax

double one_sock_tax = sockCost*PA_sales_tax; // the cost of tax for one sock 
double one_sock_temp = (int)(one_sock_tax*100); // the cost of tax for one sock with two decimals
double one_sock_final = one_sock_temp/100; // the cost of tax for one sock with two decimals

double one_drinking_glass_tax = drinking_glassCost*PA_sales_tax; // the cost of tax for one drinking glass
double one_drinking_glass_tax_temp = (int)(one_drinking_glass_tax*100); // the cost of tax for one drinking glass with two decimals 
double one_drinking_glass_tax_final = one_drinking_glass_tax_temp/100; // the cost of tax for one drinking glass with two decimals

double one_envelope_tax = envelopeCost * PA_sales_tax; // the cost of tax for one envelope
double one_envelope_tax_temp = (int)(one_envelope_tax*100); // the cost of tax for one envelope with two decimals
double one_envelope_tax_final = (one_envelope_tax_temp/100); // the cost of tax for one envelope with two decimals

double socks_tax = socks * PA_sales_tax; // the total amount spent on tax for three socks
double socks_tax_temp = (int)(socks_tax*100); // making the total amount of tax for three socks two decimal points  
double socks_tax_final = socks_tax_temp/100; // making the total amount of tax for three socks two decimal points

double drinking_glasses_tax = drinking_glasses * PA_sales_tax; // the total amount spent on tax for one drinking glasses
double drinking_glasses_temp = (int)(drinking_glasses_tax*100); // making the total amount of tax for drinking glasses two decimal points
double drinking_glasses_final = drinking_glasses_temp/100; // making the total amount of tax for drinking glasses two decimal points

double envelope_tax = envelope * PA_sales_tax; // the total amount spent on tax for one envelope
double envelope_tax_temp = (int)(envelope_tax*100); // making the total amount of tax for envelopes two decimal points
double envelope_tax_final = envelope_tax_temp/100; // making the total amount of tax for envelopes two decimal points

double socks_tax_total = socks_tax + socks; // the total amount spent on three socks with tax
double socks_total_temp = (int)(socks_tax_total*100); // the total amount spent on three socks with tax with two decimal points
double socks_total_final = socks_total_temp/100; // the total amount spent on three socks with tax with two decimal points

double drinking_glasses_total = drinking_glasses_tax + drinking_glasses; // the total amount spent on six drinking glasses with tax
double drinking_glasses_total_temp = (int)(drinking_glasses_total*100); // the total amount spent on six drinking glasses with tax with two decimal points 
double drinking_glasses_total_final = drinking_glasses_temp/100; // the total amount spent on six drinking glasses with tax with two decimal points
double final_drinking_price = drinking_glasses_total_final + drinking_glasses;
double envelope_tax_total = envelope_tax + envelope; // the total amount spent on one envelope with tax
double envelope_total_temp = (int)(envelope_tax_total*100); // the total amount spent on one envelope with tax with two decimal points
double envelope_total_final = envelope_total_temp/100; // the total amount spent on one envelope with tax with two decimal points

double total_before_tax = socks + drinking_glasses + envelope;// the total amount spent before tax

double total_spent_tax = socks_tax + drinking_glasses_tax + envelope_tax;// the total amount spent on sales tax
double total_spent_temp = (int)(total_spent_tax*100); // the total amount spent on sales tax with two decimal points
double total_spent_final = total_spent_temp/100; // the total amount spent on sales tax with two decimal points

double total_after_tax = socks_tax_total + drinking_glasses_total + envelope_tax_total;// the total amount spent after tax
double total_after_tax_temp = (int)(total_after_tax*100); // total amount spent after tax with two decimal points 
double total_afer_tax_final = total_after_tax_temp/100; // total amount spent after tax with two decimal points

// print statement showing the cost of one sock and the tax on one sock
System.out.println("The cost of one sock is $"+sockCost+" and the sales tax on one sock is $"+one_sock_final);

// print statement showing the cost of one drinking glass and the tax on one drinking glass
System.out.println("The cost of one drinking glass is $"+drinking_glassCost+" and the sales tax on one drinking glass is $"+one_drinking_glass_tax_final); 

// print statement showing the cost of one envelope and the tax on one envelope
System.out.println("The cost of one envelope is $"+envelopeCost+" and the sales tax on one envelope is $"+one_envelope_tax_final);

// print statement for total cost of three socks with tax 
System.out.println("The cost of three socks with tax is $"+socks_total_final);

// print statement for the total cost of six drinking glasses with tax
System.out.println("The cost of six drinking glasses with tax is $"+ final_drinking_price);

// print statement for the total cost of one envelope with tax
System.out.println("The cost of one envelope with tax is $"+envelope_total_final);

// print statement for the total cost of all the items before tax
System.out.println("The total cost of all items before tax is $"+total_before_tax);

// print statement for the total cost of money spent on sales tax
System.out.println("The total cost spent on sales tax is $"+total_spent_final);

// print statement for the total amount spent with tax
System.out.println("The total cost spent of all items after tax is $"+total_afer_tax_final);

    }// closing the main method
}// closing the public class