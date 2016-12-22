package ntou.cs.sorter;

public class MySorter
{
	public void sort (double[] d)
	{
		for (int i = 0; i < d.length - 1; i++)
		{
			for (int j = 0; j < d.length - i - 1; j++)
			{
				if (d[j] > d[j + 1])
				{
					swap(d, j, j + 1);
				}
			}
		}
	}

	public void swap (double d[], int k, int s)
	{
		double temp = d[k];
		d[k] = d[s];
		d[s] = temp;
	}
}
