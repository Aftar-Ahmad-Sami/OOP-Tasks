	
	public class BillCalculator {
		
		double calculateBasicBill(double unit) {
			double basicbill;
			if(unit<=199)
			{
				basicbill = unit*1.20;
			}
			else if(200<=unit && unit<400)
			{
				basicbill = unit*1.50;
			}
			else if(400<=unit && unit<600)
			{
				basicbill = unit*1.80;
			}
			else
			{
				basicbill = unit*2.00;
			}
			return basicbill;
		}
		
		double calculateSurcharge(double BasicBill) {
			double charge=0;
			if(BasicBill>400)
			{
				charge = 0.15*BasicBill;
			}
			else if(BasicBill<100)
			{
				charge = 100-BasicBill;
			}
			return charge;
		}
		
		double getTotalBill(double unit)
		{
			double BasicBill = calculateBasicBill(unit);
			double Surcharge = calculateSurcharge(BasicBill);
			return BasicBill + Surcharge;
		}
	}

	
	