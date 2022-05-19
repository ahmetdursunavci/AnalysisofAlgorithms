

import java.util.Random;

public class WorstCase {

	String[] name = {"Engineer","Doctor","Teacher","Developer","Siber Security"};
	Gnome g = new Gnome(); //0
	Bitonic b = new Bitonic(); //1
	Comb c = new Comb(); //2
	Stooge st = new Stooge(); //3
	Shaker sh = new Shaker(); //4
	Random r = new Random();
	double[] db = new double[5];
	public double[] WorstCaseCalculation(int a) { 
		Job[] avg2048g = new Job[a];
		Job[] avg2048b = new Job[a];
		Job[] avg2048c = new Job[a];
		Job[] avg2048st = new Job[a];
		Job[] avg2048sh = new Job[a];
		int order = 0;
		for(int i = a-1 ; i>=0 ; i--) { //descending 
			String str = name[r.nextInt(5)];
			avg2048g[order]= new Job(str,i);
			avg2048sh[order]= new Job(str,i);
			order++;
		}
		long startTimeG=System.nanoTime();
		g.gnomeSort(avg2048g);
		long endTimeG=System.nanoTime();
		db[0]=(double)(endTimeG-startTimeG)/1000000;
		
		long startTimeSh=System.nanoTime();
		sh.shakerSort(avg2048sh);
		long endTimeSh=System.nanoTime();
		db[4]=(double)(endTimeSh-startTimeSh)/1000000;
		for(int i = 0 ; i<a ; i++) { // random inputs
			int number = r.nextInt(10000);
			String str = name[r.nextInt(5)];
			avg2048b[i]= new Job(str,number);
			avg2048c[i]= new Job(str,number);
			avg2048st[i]= new Job(str,number);
		}
		long startTimeB=System.nanoTime();
		b.bitonicSort(avg2048b, 0, a, 1);
		long endTimeB=System.nanoTime();
		db[1]=(double)(endTimeB-startTimeB)/1000000;
		long startTimeC=System.nanoTime();
		c.combSort(avg2048c);
		long endTimeC=System.nanoTime();
		db[2]=(double)(endTimeC-startTimeC)/1000000;
		
		long startTimeSt=System.nanoTime();
		st.stoogeSort(avg2048st, 0, a-1);
		long endTimeSt=System.nanoTime();
		db[3]=(double)(endTimeSt-startTimeSt)/1000000;
		
		
		return db;
		}
	
	
	
}
