

public class Gnome {
		
		private void swap(Job b[],int index) {
			    Job temp=b[index];
			    b[index]=b[index-1];
			    b[index-1]=temp;
	}
		
		public void gnomeSort(Job[] a) {
			    int temp=0;
			    while(temp<a.length&temp>=0) {
			     
			        if(temp==0 || a[temp].get_Salary()>=a[temp-1].get_Salary() ) {
			            temp=temp+1;
			        }
			        else {
			            swap(a,temp);
			            temp=temp-1;	    
			    }
			    }
		}
}