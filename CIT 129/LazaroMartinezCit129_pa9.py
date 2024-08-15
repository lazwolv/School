#Lazaro Martinez
#CIT129-1004
#Date Completed: 10/31/23
#Time Taken: 2 hours
#This program processes body fat calculations for Male or Female

#get gender input
gender = input("Enter 'Male' or 'Female', for your gender in the exact form shown here.")
#validate input for gender
if gender != 'Male' and gender != 'Female':
    print("Invalid input. Program will now terminate.")
else:
#if Female is input correctly, calculate the body fat percentage
#based on user inputs for weight, wrist, waist , hip and forearm
    if gender == "Female":
        weight = int(input("What is your current weight?"))
#validate 0 < weight < 1000
        if weight > 1000 or weight <= 0:
            print("Invalid input. Program will now terminate.")
        else:
            print("Weight:", weight)
            wrist = int(input("What is your wrist measurement?"))
            print("Wrist:", wrist)
            waist = int(input("What is your waist measurement?"))
            print("Waist:", waist)
            hip = int(input("What is your hip measurement?"))
            print("Hip:", hip)
            forearm = int(input("What is your forearm measurement?"))
            print("Forearm:", forearm)
            A1 = (weight * .732) + 8.987
            print("A1:", format(A1, ".3f"))
            A2 = wrist / 3.14
            print("A2:", format(A2, ".3f"))
            A3 = waist * .157
            print("A3:", format(A3, ".3f"))
            A4 = hip * .249
            print("A4:", format(A4, ".3f"))
            A5 = forearm * .434
            print("A5:", format(A5, ".3f"))
            B = A1 + A2 - A3 - A4 + A5
            print("B:", format(B, ".3f"))
            body_fat = weight - B
            print("Your bodyfat is", format(body_fat, ".3f"))
            body_fat_percent = body_fat * 100 / weight
            print("Your body fat percentage is " + format(body_fat_percent, ".3f"))
#display a message based on the body fat percent
            if body_fat_percent <= 0:
                print("An error situation")
            elif body_fat_percent > 0 and body_fat_percent < 44:
                print("OK")
            elif body_fat_percent >= 44 and body_fat_percent < 79:
                print("FINE")
            elif body_fat_percent > 79:
                print("NOTHING we can do!")
    else:
#if Male is input correcly, calculate body fat percentage
#based on weight and waist input
        if gender == "Male":
            weight = int(input("What is your current weight?"))
#validate 0 < weight < 1000
            if weight > 1000 or weight <= 0:
                print("Invalid input. Program will now terminate.")
            else:
                print("Weight:", weight)
                waist = int(input("What is your waist measurement?"))
                print("Waist:", waist)
                A1 = (weight * 1.082) + 94.42
                print("A1:", format(A1, ".3f"))
                A2 = waist * 4.15
                print("A2:", format(A2, ".3f"))
                B = A1 - A2
                print("B:", format(B, ".3f"))
                body_fat = weight - B
                print("Your bodyfat is", format(body_fat, ".3f"))
                body_fat_percent = body_fat * 100 / weight
                print("Your body fat percentage is " + format(body_fat_percent, ".3f"))
#display a message based on the body fat percent
                if body_fat_percent <= 0:
                    print("An error situation")
                elif body_fat_percent > 0 and body_fat_percent < 44:
                    print("OK")
                elif body_fat_percent >= 44 and body_fat_percent < 79:
                    print("FINE")
                elif body_fat_percent > 79:
                    print("NOTHING we can do!")