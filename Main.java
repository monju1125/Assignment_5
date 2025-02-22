//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nPart 1: Printing Decrement Order Numbers");
        for (int i = 10; i >0; i--) {
            System.out.print(i + "  ");
        }
        System.out.println("\n\nPart 2: Printing Each Students");
        String[ ] students = {"John", "Shen  ", "Labib", "Eric", "Ken", "Williams", "Patrick", "Xu", "Shan", "Lian", "Pedro" };
        System.out.println("Students List:");
        getStudents(students);
        String[] biologyStudents = {"John", "Shen  ", "Labib", "Eric"};
        String[] javaStudents = { "Ken", "Williams", "Patrick","Xu", "Shan", "Lian", "Pedro"};
        System.out.println("\n\nBiology Students:");
        getStudents(biologyStudents);
        System.out.println("\n\nJava Students:");
        getStudents(javaStudents);
        System.out.println("\n\nBonus Part: Exploring Advanced Java Students Grade on Canvas");
        String[] advancedJavaStudents = { "Xu", "Shan", "Lian", "Pedro" };
        double[] Grades = {3.4, 3.2, 4.0, 3.9};
        getStudentsGrades(advancedJavaStudents, Grades, 1);
    }
    public  static void getStudents(String[] arr){
        for (int i = 0 ; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
        }
    }
    public static void getStudentsGrades(String [] arr, double[] Grades, int index){
        System.out.println(arr[index] + " grade: " +  Grades[index]);
    }
}