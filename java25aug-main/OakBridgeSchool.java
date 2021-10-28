package com.niit.marksevaluation;
import java.util.*;

public class OakBridgeSchool
{
    // This function takes as input the marks of all subjects and returns a total marks of each of the students
    public int[] calculateTotalMarks(int [] math,int science[], int[] english, int[] language,int[] social)
    {
        int totalMarks[] = new int[math.length];
        for(int i=0; i<math.length;i++)
        {
            totalMarks[i] += (math[i] + science[i] + english[i] + language[i] + social[i]);
        }
        
        return totalMarks;
    }
    // This function takes as input the total marks of each student and return
    // the average total marks of each student
    public int[] calculateAverageTotalMarks(int[] totalMarks)
    {
        int averageTotalMarks[] = new int[totalMarks.length];
        for(int i=0; i<totalMarks.length;i++)
        {
            averageTotalMarks[i]= totalMarks[i]/5;
        }       

        return averageTotalMarks;
    }
    // This function takes as input the math marks and returns the average score by all students
    public int calculateAverageMathMarks (int[] math)
    {
        int total_math_marks =0;
        int average_math_marks =0;
        for(int i=0; i<math.length; i++)
        {
            total_math_marks+= math[i];
            average_math_marks = total_math_marks/math.length;
        }
       return average_math_marks;
    }
    // This function takes as input the science marks and returns the average score by all students
    public int calculateAverageScienceMarks (int[] science)
    {
        int total_science_marks =0;
        int average_science_marks =0;
        for(int i=0; i<science.length; i++)
        {
            total_science_marks+= science[i];
            average_science_marks = total_science_marks/science.length;
        }
       return average_science_marks;
        
    }
    // This function takes as input the social marks and returns the average score by all students
    public int calculateAverageSocialMarks (int[] social)
    {
        int total_social_marks =0;
        int average_social_marks =0;
        for(int i=0; i<social.length; i++)
        {
            total_social_marks+= social[i];
            average_social_marks = total_social_marks/social.length;
        }
       return average_social_marks;
    }
    // This function takes as input the language marks and returns the average score by all students
    public int calculateAverageLanguageMarks (int[] language)
    {
        int total_language_marks =0;
        int average_language_marks =0;
        for(int i=0; i<language.length; i++)
        {
            total_language_marks+= language[i];
            average_language_marks = total_language_marks/language.length;
        }
       return average_language_marks;
    }
    // This function takes as input the english marks and returns the average score by all students
    public int calculateAverageEnglishMarks (int[] english)
    {
       int total_english_marks =0;
        int average_english_marks =0;
        for(int i=0; i<english.length; i++)
        {
            total_english_marks+= english[i];
            average_english_marks = total_english_marks/english.length;
        }
       return average_english_marks;
    }
    // This function takes as input the total marks of each student and the student names
    // and returns the name os the top scorer
    public String findTopScorer(int[] totalMarks,String [] studentNames)
    {
        //return the name of  the top scorer , extract the name from the studentNames array
        String tempTopScorer = studentNames[0];
        int tempTopScorer_marks= totalMarks[0];
        for(int i=1;i<totalMarks.length;i++)
        {
                if(totalMarks[i]>tempTopScorer_marks)
                {
                    tempTopScorer_marks = totalMarks[i];
                    tempTopScorer = studentNames[i];
                }
            
        }
        return tempTopScorer;
    }
    // This function takes as input all the marks in subjects and returns
    // as an array of 1 and 0 the passed and failed student status
    // 1 - pass
    // 0 - fail
    public int[] isPassed(int [] math,int science[], int[] social, int[] language,int[] english)
    {
        int pass_or_fail[] = new int[math.length];
        for(int i=0;i<math.length;i++)
        {
            if(math[i]<35 || science[i]<35 || social[i]<35 || language[i]<35 || english[i]<35)
            {
                pass_or_fail[i]=0;
            }
            else
            {
                pass_or_fail[i]=1;
            }
        }
        return pass_or_fail;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of failed students who need to re appear for the exam
    public String[] listOfStudentsToReAppearForExam(int [] passFailStatus,String studentNames[])
    {
       String failed[] = new String[studentNames.length];
        int index =0;
        for(int i=0; i<passFailStatus.length;i++)
        {
            if(passFailStatus[i]==0)
            {
                failed[index]=studentNames[i];
                index++;
            }
        }
        String studentFailedExam[]=Arrays.copyOf(failed,index);
        return studentFailedExam;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of passed students

    public String[] listOfStudentsPassedTheExam(int [] studentIndex,String studentNames[])
    {
        String passed[] = new String[studentNames.length];
        int index =0;
        for(int i=0; i<studentIndex.length;i++)
        {
            if(studentIndex[i]==1)
            {
                passed[index]=studentNames[i];
                index++;
            }
        }
        String studentPassedExam[]=Arrays.copyOf(passed,index);
        return studentPassedExam;
    }
    // This function takes as input the average total marks of students
    // and returns the grade accordingly

    public char[] generateGrades(int [] averageTotalMarks)
    {
        char grade[] = new char[averageTotalMarks.length];
        for(int i=0; i<averageTotalMarks.length;i++)
        {
        if(averageTotalMarks[i]>=90)
        {
            grade[i] = 'A';
        }
        else if(averageTotalMarks[i]>=80)
        {
            grade[i] = 'B';
        }
        else if(averageTotalMarks[i]>=70)
        {
            grade[i] = 'C';
        }
        else if(averageTotalMarks[i]>=60)
        {
            grade[i] = 'D';
        }
        else if(averageTotalMarks[i]>=50)
        {
            grade[i] = 'E';
        }
        else
        {
           grade[i]= 'F'; 
        }
        
        }
        return grade;
    }

    //This function takes the total marks of students and roll numbers abd returns the roll nos
    // in sorted order of total marks from smallest score to highest score

    public int[] sortByTotalMarks(int[] totalMarks,int [] rollNos)
    {
        for(int i=0; i<rollNos.length; i++)
        {
            for(int j=0;j<rollNos.length-i-1;j++)
            {
                if(totalMarks[j]>totalMarks[j+1])
                {
                    int tempTotalMarks = totalMarks[j];
                    totalMarks[j] = totalMarks[j+1];
                    totalMarks[j+1] = tempTotalMarks;

                    int temprollNos = rollNos[j];
                    rollNos[j] = rollNos[j+1];
                    rollNos[j+1] = temprollNos;
                }
            }
        }
        return rollNos;
    }
}