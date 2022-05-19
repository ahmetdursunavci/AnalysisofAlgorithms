

public class Stooge {
	
	public void stoogeSort(Job[] a , int i , int j) {
		if(a[i].get_Salary()>a[j].get_Salary()) {
		
			Job temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		if(j-i+1>2) {
			
			int div = (j-i+1)/3;
			
			this.stoogeSort(a, i, j-div);
			this.stoogeSort(a, i+div, j);
			this.stoogeSort(a, i, j-div);
			
			
		}
		
		
		
	}
}
