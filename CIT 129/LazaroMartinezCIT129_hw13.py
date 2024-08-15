#Lazaro Martinez
#CIT129-1004
#Date: 11/28/23
#Time Taken: ~2 hours
#This program uses lists to gather and display payment information
#on a user given amount of employees
#It asks the user for employee Last Name, Hours Worked and Pay Rate

def main():
    #get user input for number of employees, store as an integer that we'll use to iterate through with range()
    numEmployees = int(input("Enter number of employees:"))
    #validation loop to get 1-15 employees
    while numEmployees <= 0 or numEmployees > 15:
        numEmployees = int(input("Invalid Entry. Enter number of employees:"))
    
    #initializing lists, one with strings and the rest with numbers
    #the amount of elements in the lists will be determined by the amount of employees
    #also initialized variable for total amount of money
    lastName = [""] * numEmployees
    hoursWorked = [0] * numEmployees
    payRate = [0] * numEmployees
    regularPay = [0] * numEmployees
    overtimePay = [0] * numEmployees
    totalPay = [0] * numEmployees
    totalPayout = 0

    #for loop and the heart of our program
    #fill out our lists with user inputs 
    for i in range(numEmployees):
        lastName[i] = input("Enter Last Name:")
        hoursWorked[i] = float(input("Enter Hours Worked:"))
        payRate[i] = float(input("Enter Pay Rate:"))
        #calculate pay without overtime
        if hoursWorked[i] <= 35:
            regularPay[i] = hoursWorked[i] * payRate[i]
            overtimePay[i] = 0
        #calculate pay with overtime
        elif hoursWorked[i] > 35:
            #first 35hrs are hours * rate
            regularPay[i] = 35 * payRate[i]
            #the rest are hours * (triple rate)
            overtimePay[i] = (hoursWorked[i] - 35) * (payRate[i] * 3)
        #calculate how much the employee is due
        totalPay[i] = regularPay[i] + overtimePay[i]
        #calculate accumulator for total amount of dollars for later average calculation
        totalPayout += totalPay[i]
    #calculate average
    avgPay = totalPayout / numEmployees
    
    #display headers
    print("EMPLOYEE REPORT 01/01/1011")
    print("Name   Hours Worked   Pay Rate")
    #display from our created lists name, hours, rate
    for i in range(numEmployees):
        print(lastName[i], format(hoursWorked[i], ".2f"), format(payRate[i], ".2f"), sep = "       ")
    #display headers
    print("FINAL REPORT 01/01/1011")
    print("Name   Hours Worked   Pay Rate   Regular Pay   Overtime Pay   Total Pay")
    #from our lists, display all the data we gathered and calculated, formatted
    for i in range(numEmployees):
        print(lastName[i], format(hoursWorked[i], ".2f"), format(payRate[i], ".2f"), format(regularPay[i], ".2f"), format(overtimePay[i], ".2f"), format(totalPay[i], ".2f"), sep = "       ")
    #display total amount of dollars paid out and average per employee
    print("Total pay for all employees =", format(totalPayout, ".2f"))
    print("Average pay for all employees =", format(avgPay, ".2f"))

main()