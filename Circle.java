package programming;

public class Circle extends AbstractClass {
	  private final double radius;
	   // final double pi = Math.PI;

	    
	    public void setSides(){
	    	System.out.println("no sides");
	    }
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	
	    public double calculateArea() {
	    	double d1=pi * Math.pow(radius, 2);
	    	 System.out.println(d1);
	        return d1;
	    }

	    public double calculatePerimeter() {
	        double d= 2 * pi * radius;
	        System.out.println(d);
	        return d;
	       
	    }
	    
	    public static void main(String args[]){
	    	 Circle c=new Circle(2);
	    	 c.setSides();
	    	 c.calculateArea();
	    	 c.calculatePerimeter();
	    	
	    }
	    
	}


