
package inheritance_odev;

public class Main {
    public static void main(String[] args) {
        Student ogrenci1 = new Student();
        ogrenci1.setFirstName("Mert");
        ogrenci1.setLastName("Yilmaz");
        ogrenci1.setEmail("ornek@gmail.com");
        ogrenci1.setPassword("12345");
        ogrenci1.setUserId(1);
        ogrenci1.setMyCourses("Java");
        ogrenci1.setCompleted(15);
        
       StudentManager studentmanager = new StudentManager();
       studentmanager.add(ogrenci1);
       
        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setEmail("engindemirog@gmail.com");
        instructor1.setPassword("12345");
        instructor1.setUserId(2);
        instructor1.setGivenCourses("Java");
        
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        
        
        
        
    }
}
