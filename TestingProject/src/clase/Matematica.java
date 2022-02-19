package clase;

public class Matematica {

	public int suma(int param1, int param2) {
		return param1 + param2;
	}

	public double raport(int numarator, int numitor) {
		if (numitor != 0)
			return (double) numarator / (double) numitor;
		else
			throw new IllegalArgumentException("Numitorul este 0!");
	}

	public boolean esteNumarPar(int numar) {
		return numar % 2 == 0;
	}
}
