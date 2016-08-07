package tr.org.linux.kamp2016.helloworld;

public class Animal2 {
	private String name;
	private int age;
	private String type;
	public Animal2(String name, int age, String type){
		this.name = name;
		if(age <= 100)
			{this.age = age;}
		this.type = type;
		
		
		}
	
	public String getName(){
			return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getType(){
		return type;
		
	}
	
	public void setName(String name){
		this.name= name;
		
	}
	public void setAge(int age){
		this.age = age;
		if(age <= 100)
		{this.age = age;}
		
		
	}
	
	@Override
	public String toString() {
		return "Animal2 [name=" + name + ", age=" + age + ", type=" + type
				+ "]";
	}

	public void setType(String type){
		this.type = type;
	}
	

}
