
	/**
	 * 
	 * @author <Chase Goodband>
	 * @version<10/04/2019>
	 *
	 */
	public class country {
		private String Name;
		private String Code;
		private String Capital;
		private long Population;
		private double GDP;
		private int  HappinessRank;
		private double GDPpercap;
		
		public country(String Name, String Code, String Capital, long population, double GDP, int happRank) {     //constructor
			this.Name = Name;
			this.Code = Code;
			this.Capital = Capital;
			this.Population = population;
			this.GDP = GDP;
			this.HappinessRank = happRank;
			}
		
		public String getName() {      //get method
			return Name;
		}
		
		public String getCode() {       //get method
			return Code;
		}
		
		public String getCapital() {       //get method
			return Capital;
		}
		
		public long getPopulation() {     //get method
			return Population;
		}
		
		public double getGDP() {            //get method
			return GDP;
		}
		
		public int getHappinessRank() {               //get method
			return HappinessRank;
		}

		public void setName(String Name) {       //set method
			this.Name = Name;
		}
		
		public void setCode(String Code) {       //set method
			this.Code = Code;
		}
		
		public void setCapital(String Capital) {             //set method
			this.Capital = Capital;
		}
		
		public void setPopulation(long Population) {                 //set method
			this.Population = Population;
		}
		
		public void setGDP(double GDP) {                              //set method
			this.GDP = GDP;
		}
		
		public void setHappinessRank(int HappinessRank) {                  //set method
			this.HappinessRank = HappinessRank;
		}
		
		
		public double getGDPPerCapita() {
			return GDP / Population;
		}
		public void compare(country c) {
			
			
		}

//		public void print() {                                              // print country method 
//			System.out.println("Name:"+                Name);
//			System.out.println("Code:"+                Code);
//			System.out.println("Capital:"+             Capital);
//			System.out.println("Population:"+          Population);
//			System.out.println("GDP:"+                 GDP);
//			System.out.println("Happiness Rank:"+      HappinessRank);
//		}
//		
		

		public void print() { 
			System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", getName(), getCode(), getCapital(), getPopulation(), getGDP(), getHappinessRank());
		}
	}

