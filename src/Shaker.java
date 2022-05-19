

public class Shaker {
	private boolean swapped=false;
	private void swap(Job[] b,int i) {
		Job temp = b[i];
		b[i]=b[i+1];
		b[i+1]=temp;
	}
	
	public void shakerSort(Job[] a) {
		do {
			swapped=false;
			for(int i = 0 ; i<a.length-1 ; i++) {
				if(a[i].get_Salary()>a[i+1].get_Salary()) {
					this.swap(a, i);
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
			swapped=false;
			
			for(int i = a.length-2 ; i>=0 ; i--) {
				if(a[i].get_Salary()>a[i+1].get_Salary()) {
					this.swap(a, i);
					swapped=true;
				}
			}
			
			
		}while(swapped);
		
		
		
	}
}
