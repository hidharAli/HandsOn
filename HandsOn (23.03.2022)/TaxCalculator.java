package HandsOn;

class TaxCalculator
{
	String empName;
	double empSal;
	double calculatetax(String empName,boolean isIndian,double empSal)
	{
		this.empName=empName;
		this.empSal=empSal;
		try
		{
			if(! isIndian)
			{
				throw new Exception("CountryNotValidException");
			}
		}
			catch(Exception exception)
			{
				System.out.println("The employee should be an Indian citizen for calculating tax");
			}
		try
		{
			if(empName==null)
			{
				throw new Exception("EmployeeNameInvalid");
			}
		}
		catch(Exception exception2)
		{
			System.out.println("the employee name cannot be empty");
		}
		try
		{
			if((empSal>100000)&(isIndian))
			{
				double taxAmount = empSal *8/100;
				System.out.println("Tax Amount = "+taxAmount);
				return taxAmount;
			}
			else if(((50000<empSal)&&(empSal>100000))&(isIndian))
			{
				double taxAmount=empSal *6/100;
				System.out.println("Tax Amount ="+taxAmount);
				return taxAmount;
			}
			else if(((empSal>30000)&&(empSal<50000))&(isIndian))
			{
				double taxAmount =empSal *5/100;
				System.out.println("tax amount ="+taxAmount);
				return taxAmount;
			}
			else if(((empSal>10000)&&(empSal<30000))&(isIndian))
			{
				double taxAmount =empSal *4/100;
				System.out.println("tax amount ="+taxAmount);
				return taxAmount;
			}
			else
			{
				throw new Exception("TaxNotEligibleExceptioin");
			}
		}
		catch(Exception exception3)
		{
			System.out.println("The employee does not need to pay tax");
		}
		return empSal;
	}
}

class CalculatorSimulator 
{

	public static void main(String[] args)
	{
		TaxCalculator tax=new TaxCalculator();
		tax.calculatetax("Jack",true,56000d);

	}

}