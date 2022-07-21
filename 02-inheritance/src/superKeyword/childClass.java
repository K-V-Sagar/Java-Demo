package superKeyword;

public class childClass extends parentClass {
	
	int c,d;
	
	childClass(){
		
	}
	
	childClass(int p,int q){
		this.c=p;
		this.d=q;
	}
	
	childClass(int a1, int a2, int a3, int a4){
		super(a1,a2); //calls the super class
		this.c=a3;
		this.d=a4;
	}

}
