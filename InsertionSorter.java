/**
	This class sorts an array, using the insertion sort
	algorithm
*/
public class InsertionSorter
{
	/**
		Constructs an insertion sorter
		@param anArray the array to sort
	*/
	public InsertionSorter(int[] anArray)
	{
		a = anArray;
	}

	/**
		Sorts the array managed by this insertion sorter
	*/

	public void sort()
	{
		for (int i = 1; i < a.length; i++)
		{
			int next = a[i];
			//find the insertion location
			//move all larger elements up
			int j = i;
			while (j > 0 && a[j - 1] > next)
			{
				a[j] = a[j - 1];
				j--;
			}
			//insert the element
			a[j] = next;
		}
	}

	private int[] a;
}