#Lazaro Martinez
#CIT129-1004
#Date Completed: 11/07/23
#Time Taken: 1.5 hours
#This program calculates total and average rainfall (in inches)
#based on user input for amount of years, months and a rainfall 
#recording for each month (in inches)

#variable initialization
total_inches = 0
total_inches_full_period = 0
total_num_months = 0
#user input for password with validation loop using "python" as the password
password = input("Enter password:")
while password != "python":
    password = input("Incorrect. Try again:")
#user input for amount of years with validation loop to get a positive amount of years
num_years = int(input("Enter the number of years (at least 1) with recorded amount of rainfall:"))
while num_years <= 0:
    num_years = int(input("Enter the number of years (at least 1) with recorded amount of rainfall:"))
#for loop with range() function to get an amount of months for each year
for year in range(num_years):
    num_months = int(input("Enter number of months (at least 1) you would you like to enter amount of rainfall for:"))
#accumulates total amount of months
    total_num_months += num_months
#validation loop to get a positive amount of months
    while num_months <= 0:
        num_months = int(input("Enter number of months (at least 1) you would you like to enter amount of rainfall for:"))
#for loop with range() function to get rainfall readings for each month
    for month in range(num_months):
        amt_rainfall = float(input("Enter amount of rainfall:"))
#accumulates amount of rainfall inches
        total_inches += amt_rainfall
#calculates average inches of rainfall
        avg_inches = total_inches / num_months
#prints the acquired information formatted to two decimal points
#I used "year + 1" to get an incrementing year number on the displayed data
#not sure if this was required but the Test Run seemed to do it so I tried to replicate it
#It took me a while to figure out and a cigarette break
#I couldn't figure it out for the months to show the same way
    print("Total rainfall (in inches) for year", year + 1, format(total_inches, ".2f"))
    print("Number of months:", format(num_months, ".2f"))
    print("Average ranfall (in inches) for year", year + 1, format(avg_inches, ".2f"))
#accumulates total rainfall inches for the possible multiple years
    total_inches_full_period += total_inches
#resets the variable to 0 to get fresh data on the subsequent year
    total_inches = 0
#calculates average rainfall for all the months with readings
avg_inches_full_period = total_inches_full_period / total_num_months
#print a "FINAL REPORT" with full period data
print("FINAL REPORT")
print("Total number of months with collected rainfall:", total_num_months)
print("Total inches of rain over the entire period:", format(total_inches_full_period, ".2f"))
print("Average rainfall over the entire period:", format(avg_inches_full_period, ".2f"))
#this one was fun