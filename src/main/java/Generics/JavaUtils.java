package Generics;

import java.util.Random;

public class JavaUtils {
public int randomValue(){
	Random random=new Random();
	int count = random.nextInt(1000);
	return count;
}
}
