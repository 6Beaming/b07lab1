public class Polynomial{
	double[] A;		//coefficients
	public Polynomial(){
		A = new double[1];
		A[0] = 0.0;
	}
	public Polynomial(double[] B) {
		A = new double[B.length];
		for(int i=0;i<B.length;i++) {
			A[i]=B[i];
		}
	}
	public Polynomial add(Polynomial C) {
		Polynomial result;
		if (this.A.length > C.A.length) {
			result = new Polynomial(this.A); //copy the data
			for (int i=0;i< C.A.length;i++)
				result.A[i] += C.A[i]; // add the other data
		}
		else {
			result = new Polynomial(C.A);
			for (int i=0;i< this.A.length;i++)
				result.A[i] += this.A[i];
		}
		return result;
	}
	public double evaluate(double x) {
		double result = 0.0;
		for (int i=0; i<A.length;i++)
			result += A[i] * Math.pow(x, i); // coefficient * x^i
		return result;
	}
	public boolean hasRoot(double x) {
		return evaluate(x)==0;
	}
}
