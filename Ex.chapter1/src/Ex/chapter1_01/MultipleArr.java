package Ex.chapter1_01;

public class MultipleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[][] = {{80,90,96},{76,88}};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[0][0]);
		System.out.println(scores[1][0]);
		
		
		int classsum = 0;
		int classsum2 = 0;
		
		
		
		for(int i=0; i<scores[0].length; i++){
			classsum +=scores[0][i];
		}
		for(int i=0; i<scores[1].length; i++){
			classsum2 +=scores[1][i];
		}
		double classarg = classsum / scores[0].length;
		double classarg2 = classsum2 / scores[1].length;
		double classarg3 = (classsum2 + classsum)  / (scores[1].length +scores[0].length) ;
		int classsum3 = classsum2 + classsum;
		System.out.println(classsum +"  " +classarg);
		System.out.println(classsum2 +"  " +classarg2);
		System.out.println(classsum3 +"  " +classarg3);
	}

}
