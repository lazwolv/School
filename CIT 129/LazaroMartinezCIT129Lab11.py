#Lazaro Martinez
#CIT129-1004
#Date: 11/17/23
#Time taken: 1 hour
#This program provides the user with a list of choices as well as an
#option to exit the program. The user can select to process temperature
#readings to determine if it's Cold, Hot or just right. The user can also
#choose to calculate the amoung of gallons of water in a pool
#by providing its dimensions.

#define the meny function that shows the user choices as well as way out of the program
def menu():
    print("Enter 1 to process temperature readings.")
    print("Enter 2 to calculate amount of water in a pool.")
    print("Enter 3 to exit.")
    #get user input for choice, in this case an integer
    choice = int(input())
    return choice

#get user input for amount of temperature radings and validate using a loop
#we want 1-10 readings
def getNumTemps():
    numReading = int(input("How many temperature readings?"))
    while numReading <= 0 or numReading > 10:
        numReading = int(input("Invalid entry. How many temperature readings?"))
    return numReading

#get user input for temperature and display a message based on user input
def displayMessage(numReading):
    #with for...range() we can get multiple temperatures 
    #based on how many readings the user chose to have
    for i in range(numReading):
        temp = int(input("What is the temperature?"))
        if temp < 40:
            print("Cold")
        elif 40 <= temp <= 80:
            print("Okay")
        elif temp > 80:
            print("Hot")

#calculate gallons of water in a pool
def getWater(length, width, depth):
    gallonsWater = length * width * depth * 7.48
    return gallonsWater

#our program's main function calls the other functions 
#based on input for choice of process.
def main():
    #assign a value to choice to compare to
    choice = menu()
    #continue to run the program until the user decides to exit out
    while choice != 3:
        #process temperature readings if the user chooses 1
        if choice == 1:
            num_temps = getNumTemps()
            displayMessage(num_temps)
        #calculate amount of water if the user chooses 2
        elif choice == 2:
            amount_water = getWater(float(input("What is the length of the pool:")), width = float(input("What is the width of the pool:")), depth = float(input("What is the depth of the pool:")))
            print("Gallons of water:", format(amount_water, ".2f"))
        #if the user enters anything other than 1, 2 or 3, restarts
        else:
            print("Invalid choice. Try again.")
        choice = menu()
#calls our main function
main()