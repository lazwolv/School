#Lazaro Martinez
#CIT129-1004
#Date: 12/02/23
#Time Taken: 1.5 hours
#This program calculates and displays sales data for a dealership
#based on a number of dealers and their sales.

def getDealers():
    #get from user number of dealers and validate using a loop (1-20 dealers)
    numDealers = int(input("How many dealers are there? "))
    while numDealers < 1 or numDealers > 20:
        numDealers = int(input("How many dealers are there? "))

    #initialize our lists and variables
    names = [""] * numDealers
    sales = [0] * numDealers
    commission = [0] * numDealers
    totalSales = 0
    totalCommission = 0
    
    for i in range(numDealers):
        #get names and sales of dealers to fill our lists
        names[i] = input("Enter dealer name: ")
        sales[i] = float(input("Enter dealer sales: "))
        #make sure sales is 0 or more
        while sales[i] < 0:
            sales[i] = float(input("Invalid. Enter dealer sales: "))
        #calculate commissions based on sales brackets
        if sales[i] > 0 and sales[i] <= 5000:
            commission[i] = sales[i] * 0.10
        elif sales[i] > 5000 and sales[i] <= 15000:
            commission[i] = sales[i] * 0.15
        else:
            commission[i] = sales[i] * 0.20
        
        #total accumulators for sales and commissions
        totalSales += sales[i]
        totalCommission += commission[i]
    #calculate average sales
    averageSales = totalSales / numDealers

    #initialize our highest and lowest variables
    highestSales = sales[0]
    lowestSales = sales[0]

    for sale in sales:
        #get highest value in our list
        if sale > highestSales:
            highestSales = sale
        #get lowest value in our list
        elif sale < lowestSales:
            lowestSales = sale

    #display data that we acquired, calculated and formatted
    print("Total Sales: $", format(totalSales, ".2f"), sep="")
    print("Highest Sales: $", format(highestSales, ".2f"), sep="")
    print("Lowest Sales: $", format(lowestSales, ".2f"), sep="")
    print("Average Sales: $", format(averageSales, ".2f"), sep="")
    print("Total Commission: $", format(totalCommission, ".2f"), sep="")

    #display headers
    print("DEALER REPORT")
    print("Dealers  " + " Sales  " + "    Commission")
    #display names, sales and commissions in a tabular format
    for i in range(numDealers):
        print(names[i], "$" + format(sales[i], ".2f"), "$" + format(commission[i], ".2f"), sep="      ")
    
    #sort our lists elements in ascending order (low to high) using a sorting algorithm
    flag = 0
    while flag == 0:
        flag = 1
        i = 0
        while i <= (numDealers - 2):
            if commission[i] > commission[i+1]:
                #used temporary variables to store the previous values before we replaced them
                temp1 = commission[i]
                temp2 = sales[i]
                temp3 = names[i]
                #if condition is True, rotate elements
                commission[i] = commission[i+1]
                sales[i] = sales[i+1]
                names[i] = names[i+1]
                commission[i+1] = temp1
                sales[i+1] = temp2
                names[i+1] = temp3
                flag = 0
            i += 1

    #display headers
    print("DEALER REPORT - Ordered by commission")
    print("Dealers  " + " Sales  " + "    Commission")
    #display names, sales and commissions in a tabular format in ascending order (low to high)
    for i in range(numDealers):
        print(names[i], "$" + format(sales[i], ".2f"), "$" + format(commission[i], ".2f"), sep="      ")

    #get name from user and search for related sales and commissions in our lists using an algorithm
    findName = input("Enter name to search for sales and commission:")
    found = 0
    i = 0
    while found == 0 and i < numDealers:
        if findName == names[i]:
            found = 1
        i += 1
    if found == 1:
        print(findName, "Sales:", format(sales[i-1], ".2f"), "Commission:", format(commission[i-1], ".2f"))
    else:
        print("I cannot find records for:", findName)
    

getDealers()