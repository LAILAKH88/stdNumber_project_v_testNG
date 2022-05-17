package stdNumber_project;

public class StdNumberV2 {
	public Boolean checkStdNum(int stdNum) {
		if (stdNum <= 0) 
			return false;
		else {
			int length=String.valueOf(stdNum).length();
			if (length != 9 )
				return false;
			else {
				Character firstDigit=String.valueOf(stdNum).charAt(0);
				if (!( firstDigit.equals('2') || firstDigit.equals('1')))	
					return false;
				else { 
					int addYear = Integer.parseInt(Integer.toString(stdNum).substring(1, 5));
					if(addYear <= 2010 ) //modification
						return false;
					else
						return true;
				}
			}	
		}
	}
}
