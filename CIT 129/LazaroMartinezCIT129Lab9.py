#Lazaro Martinez
#CIT129-1004
#Date Completed: 11/03/23
#Time Taken: 50 minutes
#This program gets Total and Average temperatures for EACH and ALL rooms
#based on user input for number of rooms and readings and each temperature reading

#initialize variables for error proofing
total_temp = 0
total_total_temp = 0
#get user input for number of rooms. make sure the user enters 1 or more rooms
#additionally make sure the variable stores an integer using int()
#to be able to iterate through it with our for loop and range() setup
num_rooms = int(input("How many rooms?"))
while num_rooms <= 0:
    num_rooms = int(input("Invalid input. How many rooms?"))
#use a for loop with the range() function to 
#get a number of temperature readings for each room
for room in range(num_rooms):
    num_temp_readings = int(input("How many temperature recordings?"))
#assigned a new variable to use as a counter variable
#this way we can use num_temp_readings to calculate average later
#otherwise, num_temp_readings' stored value would be 0 later on
    counter = num_temp_readings
    while counter > 0:
        temp = int(input("What is the temperature?"))
        total_temp += temp
        counter -= 1
    avg_temp = total_temp / num_temp_readings
#display to user total and average temperature for EACH room formatted to two decimal points
    print("Total temperature:", format(total_temp, ".2f"))
    print("Average temperature:", format(avg_temp, ".2f"))
#new variable storing the total temperature for all rooms and readings
    total_total_temp += total_temp
#reset total_temp to 0 to get a fresh start for next room
    total_temp = 0
#new variable for the average temperature of all rooms combined
avg_avg_temp = total_total_temp / num_rooms
#display to user total and average temperature of ALL rooms formatted to two decimal points
print("Final Temperature Report")
print("The total temperature for all rooms:", format(total_total_temp, ".2f"))
print("The average temperature for all rooms:", format(avg_avg_temp, ".2f"))
#display a message based on where temperature falls for Cold, Okay or Hot
if avg_avg_temp < 40:
    print("Cold")
elif avg_avg_temp >= 40 and avg_avg_temp <= 80:
    print("Okay")
else:
    print("Hot")
