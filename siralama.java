package develop;
import java.util.*;
public class siralama {
	public  int[] kabarcik(int[] a)
	{
	int temp;
	for (int k = 1; k < 10; k++)
	for (int i = 0; i < 10 - k; i++)
	if (a[i] > a[i+1])
	{
	temp = a[i];
	a[i] = a[i + 1];
	a[i + 1] = temp;
	}
	return a; 
	}
	
	public int [] secerek(int [] A)
	  {
	    int gecici;
	    int min;

	    for(int i=0; i < 10; i++)
	    {
	      min=i;

	      for(int j=i; j < 10; j++)
	      {
	        if (A[j] < A[min]){

	          min=j;
	        }

	      }
	        gecici=A[i];
	        A[i]=A[min];
	        A[min]=gecici;
	    }
	    return A;
	  }
	
	
}
