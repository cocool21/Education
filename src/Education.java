
public class Education {
	private String school="";
	private int i=10;
	public String getSchool() {
		return school;
	}

	public void setSchool(String school,int years) {
		if(i>0){
		this.school += school+"   "+years+"\n";
		i--;
		}
		else{
			
		}
	}

	

public String toString(){
	return school;
}
}
