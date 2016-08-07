package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;

public class Animal2Test {
	public static void main(String args[]){
		Animal2 animal = new Animal2("Edi",2,"kuş");
		System.out.println(animal.getName() + " 'nin yaşı :" +animal.getAge() + " türü :" + animal.getType());
		animal.setName("Sarışın");
		animal.setAge(4);
		animal.setType("kedi");
		System.out.println(animal.getName() + " 'nin yaşı :" + animal.getAge() + " türü :" + animal.getType());
		System.out.println(animal.toString());
		
		ArrayList erreyList = new ArrayList();
		erreyList.add(animal);
		
		for(int i=0;i<erreyList.size();i++)
		{
			System.out.println(erreyList.get(i));
		}
	}

}
