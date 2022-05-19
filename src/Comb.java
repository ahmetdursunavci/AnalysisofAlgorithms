

public class Comb {
	
		private void swap(Job b[],int i,int j) {
		    Job temp=b[i];
		    b[i]=b[j];
		    b[j]=temp;
	}
		
		public void combSort(Job a[]) {
			int gap = a.length;
			double shrink = 1.3;
			boolean sorted=false;
			
			while(sorted==false) {
				gap=(int) ((int)gap/shrink);
				if(gap<=1) {
					gap=1;
					sorted=true;
				}
				int i = 0;
				
				while(i+gap<a.length) {
					if(a[i].get_Salary()>a[i+gap].get_Salary()) {
						swap(a,i,i+gap);
						sorted=false;
					}
					i++;
				}
				
				
			}
			
			
		}
	
}
