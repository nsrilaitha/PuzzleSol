
public class SumConsecutiveNumber 
{ 
	
	static int countConsecutive(int GivenNum)
	{
		int count = 0;
		for (int NextVal = 1; NextVal * (NextVal + 1) < 2 * GivenNum; L++)
		{
			float calcLF = (float) ((1.0 * GivenNum-(NextVal * (NextVal + 1)) / 2) / (NextVal + 1));
			if (calcLF-(int)calcLF == 0.0) 
			count++;	 
		}
		return count;
	}
	
	public static void main(String[] args) {
		int GivenNum = 15;
		System.out.println(countConsecutive(GivenNum));
		GivenNum = 10;
		System.out.println(countConsecutive(GivenNum));
	}
}

