

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Avarage avg = new Avarage();
		WorstCase wc= new WorstCase();
		double[] db = avg.avgCalculation(1024);
	//	double[] db = wc.WorstCaseCalculation(4096);	   //You can call cases here with the inputs
	
	System.out.printf("gnome:%.3f\n",db[0]);
	System.out.printf("bitonic:%.3f\n",db[1]);
	System.out.printf("comb:%.3f\n",db[2]);
	System.out.printf("stooge:%.3f\n",db[3]);
	System.out.printf("shaker:%.3f\n",db[4]);
	
	}
}

