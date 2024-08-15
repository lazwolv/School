#Lazaro Martinez
#CIT129-1004
#Date: 12/01/23
#Time Taken: 2-3 hours (the sorting and searching took me a while to figure out)
#This program asks the user for the number of students,
#then asks for the name and score of each student.
#user input is stored in two lists that we can use
#to find the average score, highest score. It sorts the list,
#and we are able to search for a specific name and score later.


def main():
    #get number of students from user
    numStudents = int(input("Enter the number of students: "))
    #validation loop, we want 1-10 students
    while numStudents <= 0 or numStudents > 10:
        numStudents = int(input("Invalid. Enter the number of students: "))
    
    #initialize listst and needed variables
    name = [""] * numStudents
    score = [0] * numStudents
    totalScore = 0
    highestScore = 0

    #get name and score from user and store in lists
    for i in range(numStudents):
        name[i] = input("Enter the name of student: ")
        score[i] = int(input("Enter the score of student: "))
        
        #accumulation variable to calculate average later
        totalScore += score[i]

        #go through each element of our list to find the highest value
        if score[i] > highestScore:
            highestScore = score[i]
    #calculate average
    avgScore = totalScore / numStudents

    #print header
    print("***Grade Report***")

    #print our filled lists
    for i in range(numStudents):
        print(name[i], format(score[i], ".2f"))
    
    #print our calculated average and found highest scores
    print("Average Score:", format(avgScore, ".2f"))
    print("Highest Score:", format(highestScore, ".2f"))

    #print header
    print("***Sorted Grade Report***")

    #sort our lists elements in ascending order (low to high)
    #used a sorting algorithm
    flag = 0
    while flag == 0:
        flag = 1
        i = 0
        while i <= (numStudents - 2):
            if score[i] > score[i+1]:
                #used temporary variables to store the previous values before we replaced them
                temp1 = score[i]
                temp2 = name[i]
                score[i] = score[i+1]
                name[i] = name[i+1]
                score[i+1] = temp1
                name[i+1] = temp2
                flag = 0
            i += 1

    #print our sorted lists
    for i in range(numStudents):
        print(name[i], format(score[i], ".2f"))

    #get user input for a name to find their score if name is in our list of names
    #used a searching algorithm
    nameScore = input("Enter name to search for score:")
    found = 0
    i = 0
    while found == 0 and i < numStudents:
        if nameScore == name[i]:
            found = 1
        i += 1
    if found == 1:
        print("Found", nameScore, "at index", i-1, "with a score of:", format(score[i-1], ".2f"))
    else:
        print("I cannot find the test score for:", nameScore)
    
main()