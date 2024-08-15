#Lazaro Martinez
#CIT129-1004
#Date Completed: 11/10/23
#Time Taken: 1 hour
#This program:
# a. displays my name multiple times based on user input
# b. displays a message based on user input for temperature readings 
# c. displays the present and future values of an investment based on user inputs

#answer for part "a" of the Lab
def displayTimes(numTimes):
    #use a for loop with range() for iteration
    for number in range(numTimes):
        print("Lazaro")
#use input() so the user can decide how many times to print the name
displayTimes(numTimes = int(input("Enter number of times to display your name:")))

#answer for part "b" of the Lab
def processTemps(numReadings):
    #use a while loop with a counter that decrements by 1
    #I think I could have used a for loop with range() also 
    #but not sure what's best
    while numReadings > 0:
        #the user will get prompted for a temperature as long as numReadings is still > 0
        temp = int(input("What is the temperature in degrees Fahrenheit?"))
        #display a message based on the temperature
        if temp < 40:
            print("Cold")
        elif temp >= 40 and temp <=80:
            print("Okay")
        elif temp > 80:
            print("Hot")
        #counter variable
        numReadings -= 1
#call the function and prompt the user for a number of readings using input()
processTemps(numReadings = int(input("How many temperature readings?")))

#answer for part "c" of the Lab
def futureValue():
    #get present value of investment
    P = float(input("Enter the present value of the investment:"))
    #get yearly interest rate
    year_interest_rate = float(input("Enter the yearly interest rate:"))
    #get number of years
    num_years = int(input("Enter the number of years:"))
    #convert yearly interest rate to monthly
    i = year_interest_rate / 100 / 12
    #convert number of years to months
    t = num_years * 12
    #calculate future value
    F = P * (1 + i)**t
    #display Present and Future values formatted to two decimal points
    print("Present Value: $", format(P, ".2f"), sep = "")
    print("Future Value: $", format(F, ".2f"), sep = "")
#call our function
futureValue()