package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
		String ord[] = name.split("\\s+");
                // ett mellanslag ger två ord därav behöver vi inte addera 1
		int antaletnamn = ord.length;
		int summa = antaletnamn + age;
		
		while(summa >= 10){
			summa -= 7;
		}
        //TODO: calculate A
        return summa;
    }

    public int calculateB() {
		int antaltecken = location.length();
		int summa = antaltecken + income;
		
		while (summa >= 10){
			summa -= 7;
		}
		
        //TODO: calculate B
        return summa;
    }

    public int calculateC() {
		int summa = calculateA() + calculateB();
		summa = summa - height;
		
		while(summa <= 0){
			summa += 10;
		}
        //TODO: calculate C
        return summa;
    }

    public int calculateD() {
		int summa = calculateA();
		if (calculateA() > 5){
			summa += calculateB();
		} 
		// om calc a Ã¤r lika med 5 eller under
		else{
			summa += calculateC();
                }
		summa -= income;
		while(summa < 0) {
			summa += 10;
		}
        //TODO: calculate D
        return summa;
    }

    public int calculateE() {
		//tagit kundens Ã¥lder
		double summa = age;
		summa = summa * income * income * height;
		summa = Math.sqrt(summa);
		
		while(summa > 10){
			summa = summa/2;
		}
        //TODO: calculate E
        return (int)Math.round(summa);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
