#Lazaro Martinez
#CIT129-1004
#Date: 11/24/23
#Time taken: 1.5 hours
#This program calculates and displays total and average scores for a user input amount of students.
#Then it displays the lowest and highest scores.

def gradeReport():
    #get user input for number of students
    num = int(input("How many students?"))
    #validation loop, we want 1-20 students
    while num <= 0 or num > 20:
        num = int(input("Invalid Entry. How many students?"))
    #initialized our empty lists, one contains names(empty strings) and the other scores(zeroes)
    #the amount of items in our list will be determined by the number of students
    name = [""] * num
    score = [0] * num
    #fill our lists with user input for names and scores
    for i in range(num):
        name[i] = input("What is the student's name?")
        score[i] = float(input("What was their test score?"))
    #display message to user, this will act as our header
    print("***Grade Report***")
    #display one name and score per line, going through each index
    for i in range(num):
        print(name[i], score[i])
    #initialize variable that we'll use for score accumulation
    sumScores = 0
    #add every value of our list to said variable
    for i in range(num):
        sumScores += score[i]
    #display formatted data to user
    print("The total score is:", format(sumScores, ".2f"))
    #calculate and display average
    avgScore = sumScores / num
    print("The average score is:", format(avgScore, ".2f"))
    #initialize new variables for lowest and highest scores using index 0 on our list
    #and iterating all the way through it until we confirm lowest and highest values
    lowestScore = score[0]
    highestScore = score[0]
    for number in score:
        if number < lowestScore:
            lowestScore = number
        if number > highestScore:
            highestScore = number
    #display acquired data
    print("The lowest score is:", format(lowestScore, ".2f"))
    print("The highest score is:", format(highestScore, ".2f"))

#defined a main function in case Professor still wants the program to run through it
#thought it was unnecessary but I've lost points over more trivial stuff before
def main():
    gradeReport()

main()