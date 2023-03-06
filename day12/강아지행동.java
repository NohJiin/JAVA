package 부품사용하기;

import 부품만들기.강아지;

public class 강아지행동 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		dog1.name = "보리";
		dog1.age = 2;
		
		dog1.age(dog1.name, dog1.age);
		dog1.train(dog1.name);
		
		강아지 dog2 = new 강아지();
		dog2.name = "까망";
		dog2.age = 1;
		
		dog2.age(dog2.name, dog2.age);
		dog2.train(dog2.name);
	}

}