public class CompositionBasics {
public static void main(String[] args) {
Person bobby = new Person();
Job engineer=new Job();
Education edu=new Education();
edu.setSchool("Bryan Elementary",1988);
edu.setSchool("Montgomory", 1994);


engineer.setRole("engineer");
engineer.setSalary(5000);

bobby.setJob(engineer);
bobby.setEdu(edu);


System.out.println(bobby.toString());
}
}