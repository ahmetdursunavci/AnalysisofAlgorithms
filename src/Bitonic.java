

public class Bitonic {
	private void compAndSwap(Job[] a, int i, int j, int dire) {
		
		if((dire==1&&a[i].get_Salary()>a[j].get_Salary())||(dire==0&&a[j].get_Salary()>a[i].get_Salary())) {
		
			Job temp=a[i];
			a[i]=a[j];
			a[j]=temp;
	
		}
	
		}
	
	private void bitonicMerge(Job[] a, int low, int cnt, int dire) {
		
		if(cnt>1) {
			int k = cnt/2;
			for(int i = low ; i<low+k ; i++) {
		
				this.compAndSwap(a, i, i+k, dire);
			}
		
			bitonicMerge(a,low,k,dire);
			bitonicMerge(a,low+k,k,dire);
			
		}
		else {
			
		}
		
	}
	public void bitonicSort(Job[] a, int low, int cnt, int dire) {
		if(cnt>1) {
			int k=cnt/2;
			
	
			bitonicSort(a,low,k,1);
		
			bitonicSort(a,low+k,k,0);
		
			bitonicMerge(a,low,cnt,dire);
			
		}
	}
}
