import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String employeeName = "null";

        Double midYearEvalTechnical, endYearEvalTechnical, workProjectTechnical, finalScoreTechnical ,avgTechnical;
        Double midYearEvalDiscipline, endYearEvalDiscipline, workProjectDiscipline, finalScoreDiscpline, avgDiscipline;

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.println("TECHNICAL SKILLS EVALUATION");
        System.out.println("Enter the score for the following parameters (0-100)");
        System.out.print("Technical skilss - Mid Year Evaluation: ");
        midYearEvalTechnical = sc.nextDouble();
        System.out.print("Technical skilss - end Year Evaluation: ");
        endYearEvalTechnical = sc.nextDouble();
        System.out.print("Technical skilss -  Work project: ");
        workProjectTechnical = sc.nextDouble();
        
        finalScoreTechnical = (midYearEvalTechnical * 0.3) + (endYearEvalTechnical * 0.4) + (workProjectTechnical * 0.3);
        
        System.out.println("WORK DISCIPLINE EVALUATION");
        System.out.print("Work discipline - Mid Year Evaluation: ");
        midYearEvalDiscipline = sc.nextDouble();
        System.out.print("Work discpiline - end Year Evaluation: ");
        endYearEvalDiscipline = sc.nextDouble();
        System.out.print("Work discipline -  Work project: ");
        workProjectDiscipline = sc.nextDouble();
        
        finalScoreDiscpline = (midYearEvalDiscipline * 0.3) + (endYearEvalDiscipline * 0.4) + (workProjectDiscipline * 0.3);

        if(finalScoreTechnical >= 60){
            System.out.println(employeeName + " Passed the technical skills evaluation with a score of " + finalScoreTechnical);

        }else{
            System.out.println(employeeName + " Did not pass the technical skills evaluation with a score of " + finalScoreTechnical);
        }

        if(finalScoreDiscpline >= 60){
            System.out.println(employeeName + " Passed the technical skills evaluation with a score of " + finalScoreDiscpline);

        }else{
            System.out.println(employeeName + " Did not pass the technical skills evaluation with a score of " + finalScoreDiscpline);
        }

        //Promotion criteria
        if(finalScoreTechnical >= 70 && finalScoreDiscpline >= 70){
            System.out.println(employeeName + " is eligible for promotion");
        }else{
            System.out.println(employeeName + " is not eligible for promotion");
        }
        sc.close();
    }
}