def getEmployees():
    numEmployees = int(input("Enter number of employees:"))
    while numEmployees <= 0 or numEmployees > 15:
        numEmployees = int(input("Invalid Entry. Enter number of employees:"))
    return numEmployees

def getLastName(numEmployees):
    lastName = [""] * numEmployees
    for i in range(numEmployees):
        lastName[i] = input("Enter Last Name:")
    return lastName

def getHoursWorked(numEmployees):
    hoursWorked = [0] * numEmployees
    for i in range(numEmployees):
        hoursWorked[i] = float(input("Enter Hours Worked:"))
    return hoursWorked

def getPayRate(numEmployees):
    payRate = [0] * numEmployees
    for i in range(numEmployees):
        payRate[i] = float(input("Enter Pay Rate:"))
    return payRate

def calculateRegularPay(hoursWorked, payRate, numEmployees):
    regularPay = [0] * numEmployees
    for i in range(numEmployees):
        if hoursWorked[i] <= 35:
            regularPay[i] = hoursWorked[i] * payRate[i]
    return regularPay

def calculateOvertimePay(hoursWorked, payRate, numEmployees):
    overtimePay = [0] * numEmployees
    for i in range(numEmployees):
        if hoursWorked[i] > 35:
            overtimePay[i] = (35 * payRate[i]) + ((hoursWorked[i] - 35) * (payRate[i] * 3))
    return overtimePay

def calculateTotalPay(regularPay, overtimePay, numEmployees):
    totalPay = [0] * numEmployees
    for i in range(numEmployees):
        totalPay[i] = regularPay[i] + overtimePay[i]
    return totalPay

def main():
    numEmployees = getEmployees()
    lastName = getLastName(numEmployees)
    hoursWorked = getHoursWorked(numEmployees)
    payRate = getPayRate(numEmployees)
    regularPay = calculateRegularPay(hoursWorked, payRate, numEmployees)
    overtimePay = calculateOvertimePay(hoursWorked, payRate, numEmployees)
    totalPay = calculateTotalPay(regularPay, overtimePay, numEmployees)

    print("EMPLOYEE REPORT 01/01/1011")
    print("Name    Hours Worked    Pay Rate")
    for i in range(numEmployees):
        print(lastName[i] + "    " + format(hoursWorked[i], ".2f") + "    " + format(payRate[i], ".2f"))
    print("FINAL REPORT 01/01/1011")
    print("Name    Hours Worked    Pay Rate    Regular Pay    Overtime Pay    Total Pay")
    for i in range(numEmployees):
        print(lastName[i] + "    " + format(hoursWorked[i], ".2f") + "    " + format(payRate[i], ".2f") + "    " + format(regularPay[i], ".2f") + "    " + format(overtimePay[i], ".2f") + "   " + format(totalPay[i], ".2f"))


main()