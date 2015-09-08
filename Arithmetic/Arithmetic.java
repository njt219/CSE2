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
double total_before_tax = socks + drinking_glasses + envelope; //total cost of items before tax

double socks_tax = socks * PA_sales_tax + socks; //the total cost of socks with tax
double socks_tax_decimal = (int)Math.round(socks_tax * 100)/(double)100; //this produces the answer of socks with tax with only 2 decimal points

double drinking_glasses_tax = drinking_glasses * PA_sales_tax + drinking_glasses; //the tax on the purchase of 6 drinking glasses
double drinking_glasses_tax_decimal = (int)Math.round(drinking_glasses_tax * 100)/(double)100; //this produces the answer of drinking glasses with tax with only 2 decimal places

double envelope_tax = envelope * PA_sales_tax + envelope; //the tax on the purchase of 1 envelope
double envelope_tax_decimal= (int)Math.round(envelope_tax * 100)/(double)100; //this produces the answer of an envelope with tax with only 2 decimal places

double total_purchase = socks_tax + drinking_glasses_tax + envelope_tax;// this represents the total cost of the purchase with tax
double total_purchase_decimal = (int)Math.round(total_purchase * 100)/(double)100;//this will print the total purchase with only 2 decimal points

//this will print the cost of 3 socks with tax
System.out.println("The total cost of 3 socks with tax is "+socks_tax_decimal); 

//this will print the cost of 6 drinking glasses with tax
System.out.println("The total cost of 6 drinking glasses with tax is "+drinking_glasses_tax_decimal); 

//this will print the cost of 1 envelope with tax
System.out.println("The total cost of 1 envelope with tax is "+envelope_tax_decimal); 

//this will print the total of all goods before tax
System.out.println("The total cost of 3 socks, 6 drinking glasses and 1 envelope before tax is "+total_before_tax); 

//this will print the total cost of all goods after tax
System.out.println("The total cost of 3 socks, 6 drinking glasses and 1 envelope after tax is "+total_purchase_decimal);

    } //end of main method
} //end of public class