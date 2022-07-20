package finals;

public abstract class testFinal {
	
	final double pi =3.14;
	// cannot do this because pi is final
	// pi = 2.4 ;
	
	// if calcArea() is made final then cannot extend it
	abstract void calcArea();

}
