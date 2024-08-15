#Lazaro Martinez
#CIT129-1004
#Date: 11/21/23
#Time Taken: ~ 1 hour
#This program gives the user several options including how to exit the program
#The user can convert pounds to kilograms, gallons to liters,
#calculate bank fees for checks or amount of taxes due all based on user input

#first function shows the user a list or "menu" of options and stores their input
def menu():
    print("Enter 1 to convert weight.")
    print("Enter 2 to convert volume.")
    print("Enter 3 to determine bank fees.")
    print("Enter 4 to determine income tax.")
    print("Enter 5 to exit.")
    #get user input as an integer
    choice = int(input())
    return choice
    
#second function converts pounds into kilograms
def convertWeight(pounds):
    kilograms = pounds * .454
    return kilograms

#third function converts gallons into liters
def convertVolume(gallons):
    liters = gallons * 3.78
    return liters

#fourth function calculates a bank fee based on amount of checks
#since there is a discount on volume, we used if statements for different calculations
def checkFee(numChecks):
    if numChecks < 20:
        fee = .09 * numChecks + 8
    elif 20 <= numChecks <= 39:
        fee = .07 * numChecks + 8
    elif 40 <= numChecks <= 59:
        fee = .06 * numChecks + 8
    elif numChecks >= 60:
        fee = .05 * numChecks + 8
    return fee

#fifth function has a lot more different calculations 
#based on income brackets and filing status
def TaxCalculator(income, filingStatus):
    #initialized variable for cases where income is 0 (error proofing)
    tax = 0
    if 0 < income <= 50000:
        if filingStatus == "married":
            tax = .05 * income
        elif filingStatus == "single":
            tax = .07 * income
    elif 50000 < income <= 100000:
        if filingStatus == "married":
            tax = 2500 + .08 * (income - 50000)
        elif filingStatus == "single":
            tax = 2500 + .12 * (income - 50000)
    elif income > 100000:
        if filingStatus == "married":
            tax = 6000 + .10 * (income - 100000)
        elif filingStatus == "single":
            tax = 6000 + .15 * (income - 100000)
    return tax

#sixth and main function of our program
#this function will execute the rest of the program as needed
def main():
    #prompt the user with the list of options
    choice = menu()
    #program exits if the user chooses 5
    while choice != 5:
        #execution for 1
        if choice == 1:
            #get user input for pounds
            pounds = float(input("Enter pounds:"))
            #store the function and its calculations into a new variable for future use
            kilograms = convertWeight(pounds)
            #display formatted date to the user
            print("Weight in Kg:", format(kilograms, ".2f"))
        #execution for 2
        elif choice == 2:
            #get user input for gallons
            gallons = float(input("Enter gallons:"))
            #store the function and its calculations into a new variable for future use
            liters = convertVolume(gallons)
            #display formatted date to the user
            print("Weight in Liters:", format(liters, ".2f"))
        #execution for 3
        elif choice == 3:
            #get user input for amount of checks
            numChecks = int(input("Enter amount of checks:"))
            #validation loop for amount of checks to be at least 1
            while numChecks <= 0:
                print("Invalid Amount. Try Again.")
                numChecks = int(input("Enter amount of checks:"))
            #store the function and its calculations into a new variable for future use
            fee = checkFee(numChecks)
            #display formatted date to the user
            print("Bank fees: $", format(fee, ".2f"), sep = "")
        #execution for 4
        elif choice == 4:
            #get user input for income
            income = float(input("Enter income:"))
            #validation loop for income to be at least 0
            while income < 0:
                print("Invalid Amount. Try Again.")
                income = float(input("Enter income:"))
            #get user input for filing status
            filingStatus = input("Enter your filing status (married or single, case sensitive)")
            #validation loop to get either "married" or "single" and nothing else
            #trickier with strings
            while filingStatus != "married" and filingStatus != "single":
                print("Invalid Filing Status. Try Again.")
                filingStatus = input("Enter your filing status (married or single, case sensitive)")
            #store the function and its calculations into a new variable for future use
            tax = TaxCalculator(income, filingStatus)
            #display formatted date to the user
            print("Taxes due: $", format(tax, ".2f"), sep = "")
        #in case anything outside of 1-5 is entered, asks for a choice again
        else:
            print("Invalid choice. Try again.")
        choice = menu()

#main function call
main()