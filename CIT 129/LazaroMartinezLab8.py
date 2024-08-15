#Lazaro Martinez
#CIT129-1004
#Lab8
#Date Completed: 10/27/23
#Time Taken: 2 hours

#initiate a list with the correct color choices
#initiate "new_color" variable to avoid an empty variable syntax error
primary_colors = ["red", "blue", "yellow", "black", "white"]
new_color = ""
#get valid user input for the primary colors to mix
#used .casefold() function for case insensitive strings
#validate with our previously created list for correct colors
color1 = input("Enter a primary color to mix: ").casefold()
if color1 not in primary_colors:
    print("Invalid color 1.")
else:
    color2 = input("Enter another primary color to mix: ").casefold()
    if color2 not in primary_colors:
        print("Invalid color 2.")
    else:
#if user inputs two colors correctly,
#display a new color to our user based on their mix
        if color1 == "red" and color2 == "blue":
            new_color = "purple"
        elif color1 == "blue" and color2 == "red":
            new_color = "purple"
        elif color1 == "red" and color2 == "yellow":
            new_color = "orange"
        elif color1 == "yellow" and color2 == "red":
            new_color = "orange"
        elif color1 == "blue" and color2 == "yellow":
            new_color = "green"
        elif color1 == "yellow" and color2 == "blue":
            new_color = "green"
        elif color1 == "black" and color2 in ["red", "blue", "yellow"]:
            new_color = "black"
        elif color1 in ["red", "blue", "yellow"] and color2 == "black":
            new_color = "black"
        elif color1 == "white" and color2 in ["red", "blue", "yellow"]:
            new_color = "light " + color2
        elif color1 in ["red", "blue", "yellow"] and color2 == "white":
            new_color = "light " + color1
        elif color1 == "red" and color2 == "red":
            new_color = "red"
        elif color1 == "blue" and color2 == "blue":
            new_color = "blue"
        elif color1 == "yellow" and color2 == "yellow":
            new_color = "yellow"    
        else:
            new_color = ""
#display our newly mixed color to our user
        print(new_color)