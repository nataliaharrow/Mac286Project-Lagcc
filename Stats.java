import java.text.DecimalFormat;

public class Stats {
public int numberOfTrades, numberLong, numberShort, numberWinners, numberLosers;
public int longWinners, longLosers, shortWinners, shortLosers;
public int numberDays, numberLongDays, numberShortDays;
double totalWinnings, totalLoss, totalLongWinnings, totalLongLoss, totalShortWinnings;
double totalShortLoss;


public Stats() {
numberOfTrades = numberLong = numberShort = numberWinners = numberLosers = 0;
longWinners = longLosers = shortWinners = shortLosers = 0;
numberDays = numberLongDays = numberShortDays = 0;
totalWinnings = totalLoss = totalLongWinnings = totalLongLoss = totalShortWinnings = 0.0;
totalShortLoss = 0.0;

}

public String toString() {

if (numberOfTrades == 0)
	numberOfTrades = 1;
if (numberLongDays == 0)
	numberLongDays = 1;
if (numberShortDays == 0)
	numberShortDays = 1;
 if (numberOfTrades == 0)
	numberOfTrades = 1; 

DecimalFormat df = new DecimalFormat("#0.00");

double AveragePLpercent = (totalWinnings + totalLoss) / numberOfTrades;
double AveragePLLong = (totalLongWinnings + totalLongLoss)/numberLong;
double AveragePLShort = (totalShortWinnings + totalShortLoss) /numberShort;
double AverageHoldingPeriod = (double)numberDays/numberOfTrades;
double PercentWinners = (double)numberWinners/numberOfTrades*100.0;
double PercentLongwinners = (double)longWinners/numberLong * 100.0;
double PercentShortwin = (double)shortWinners/numberShort*100.0;

String s = "NumofTrades:"+numberOfTrades +"\tNumLong:" + numberLong + "\t NumShort:"+ numberShort+"\tWinners:" + df.format(PercentWinners)+"%" 
			+"\tAvrgPL:" +df.format(AveragePLpercent)+"%" + "\tAvrgHoldPeriod:"+df.format(AverageHoldingPeriod) +"\tLongwinners:" +df.format(PercentLongwinners)+"%"+
			"\tAvrPLLong:"+df.format(AveragePLLong) + "\tShortwinners:" + df.format(PercentShortwin)+"%" +"\tAvrgPLShort:" + df.format(AveragePLShort);

			return s;

	}


//this is use for writing to CSV
public String toString2() {


	if (numberOfTrades == 0)
		numberOfTrades = 1;
	if (numberLongDays == 0)
		numberLongDays = 1;
	if (numberShortDays == 0)
		numberShortDays = 1;
	 if (numberOfTrades == 0)
		numberOfTrades = 1; 

DecimalFormat df2 = new DecimalFormat("#0.00");

	
	
double AveragePLpercent = (totalWinnings + totalLoss) / numberOfTrades;
double AveragePLShort =(totalShortWinnings + totalShortLoss ) / numberShort;
double AveragePLLong = (totalLongWinnings + totalLongLoss) /numberLong;
double AverageHoldingPeriod = (double)numberDays/numberOfTrades;
double PercentWinners = (double)numberWinners/numberOfTrades*100.0;
double PercentLongwinners = (double)longWinners/numberLong * 100.0;
double PercentShortwin = (double)shortWinners/numberShort*100.0;

	


String s =numberOfTrades + "," + numberLong+ "," + numberShort + "," + df2.format(PercentWinners)+"%" + "," +df2.format(AveragePLpercent)+"%"+ "," + AverageHoldingPeriod +"," 
		+df2.format(PercentLongwinners)+"%" + "," + df2.format(AveragePLLong) +","+df2.format(PercentShortwin)+"%"+ "," + df2.format(AveragePLShort);
	

			return s; 
		}
	

}
