public class Person {
private Job job;
private Education edu=new Education();
 
public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
}
public Education getEdu() {
	return edu;
}
public void setEdu(Education e) {
	
	this.edu = e;
	
}

public Person(){
   
}
public String toString(){
	return job.toString()+"\n"+edu.toString();
}
}
