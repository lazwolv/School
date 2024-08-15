def getStudents():
    numStudents = int(input("Enter the number of students: "))
    while numStudents <= 0:
        numStudents = int(input("Enter the number of students: "))
    return numStudents

def getData(numStudents):
    name = [""] * numStudents
    score = [0] * numStudents
    totalScore = 0
    highestScore = 0
    
    for i in range(numStudents):
        name[i] = input("Enter the name of student: ")
        score[i] = int(input("Enter the score of student: "))
        
        totalScore += score[i]
    
        if score[i] > highestScore:
            highestScore = score[i]

    avgScore = totalScore / numStudents

    print("***Grade Report***")

    for i in range(numStudents):
        print(name[i], format(score[i], ".2f"))
    
    print("Average Score:", format(avgScore, ".2f"))
    print("Highest Score:", format(highestScore, ".2f"))

    flag = 0
    while flag == 0:
        flag = 1
        i = 0
        while i <= (numStudents - 2):
            if score[i] > score[i+1]:
                temp1 = score[i]
                temp2 = name[i]
                score[i] = score[i+1]
                name[i] = name[i+1]
                score[i+1] = temp1
                name[i+1] = temp2
                flag = 0
            i = i + 1

    for i in range(numStudents):
        print(name[i], format(score[i], ".2f"))

#Ask the user for the name of a student and display their score. If the name is not in the list, issue an error message.
    nameScore = input("Enter name to search for score:")
    for i in range(numStudents):
        if nameScore in name[i]:
            print(nameScore + " scored: " + score[i])
        else:
            print("Error")
main()