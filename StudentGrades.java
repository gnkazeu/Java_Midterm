import java.util.HashMap;

public class StudentGrades {
    HashMap<String, Double> grades = new HashMap<>();

    // Constructor to initialize with 10 students
    public StudentGrades() {
        grades.put("Mamie", 5.3);
        grades.put("Lin", 93.5);
        grades.put("Bob", 72.0);
        grades.put("Evra", 90.3);
        grades.put("Michael", 28.0);
        grades.put("John", 30.5);
        grades.put("Grace", 45.0);
        grades.put("Hannah", 26.5);
        grades.put("Helene", 10.0);
        grades.put("Paul", 90.0);
    }

    // Method that handles all required operations
    public void search(String nameToSearch) {
        System.out.println(" Initial Student Grades ");
        print_all();

        System.out.println(" Searching for student: " + nameToSearch );
        if (grades.containsKey(nameToSearch)) {
            System.out.println(nameToSearch + "'s Percentage Score: " + grades.get(nameToSearch));
        } else {
            System.out.println("Student " + nameToSearch + " is missing from the list.");
        }

        System.out.println("\n Removing student: " + nameToSearch);
        if (grades.containsKey(nameToSearch)) {
            grades.remove(nameToSearch);
            System.out.println(nameToSearch + " has been removed.");
        } else {
            System.out.println("Student " + nameToSearch + " not found. Cannot remove.");
        }

        System.out.println("Updated Student Grades");
        print_all();
    }

    private void print_all() {
        for (String student : grades.keySet()) {
            System.out.println(student + ": " + grades.get(student) + "%");
        }
    }

    public static void main(String[] args) {
            StudentGrades student_grade = new StudentGrades();
    
            // Example usage: Search for "Lin" 
            student_grade.search("Lin");
        }  
}
