package z19getComfortWithLambdaExp2;

public class Runner {

	public void usingClassicalWay () {
		
		IPanchayat panchayat=new PanchayatImp();
		System.out.println("Classical Way: " + panchayat.interrogate("What is ur name?"));
		
	}
	public void anonymousClass() {
		IPanchayat panch=new IPanchayat() {
			public String interrogate(String question) {
			return "Hey " +question;
			}
		};
		System.out.println("anonymousClass : " + panch.interrogate("What is your name"));
	}
	
	public void usingLambda() {
//		IPanchayat pancha=(String question)->{return "Hey" + question;};
//		above statement is written as 
		IPanchayat pancha=question->"Hey " + question;
		System.out.println("from lambda class: " +pancha.interrogate("What is your name ?"));
	}
	
	
	
	
	public static void main(String[] args) {
		Runner run=new Runner();
		run.usingClassicalWay();
		run.anonymousClass();
		run.usingLambda();
	}
}
