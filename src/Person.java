public class Person {
private Job job;
private Education edu=new Education();
private int i=10;
 
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
	if(i>=0){
	this.edu = e;
	i--;
	}
}

public Person(){
   
}
public String toString(){
	return job.toString()+"\n"+edu.toString();
}
}
