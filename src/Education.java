
public class Education {
	private String school="";
	public String getSchool() {
		return school;
	}

	public void setSchool(String school,int years) {
		this.school += school+"   "+years+"\n";
	}

	

public String toString(){
	return school;
}
}
