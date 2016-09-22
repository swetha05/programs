package programming;

public class TestMonth {


		Month month;
		
		 public TestMonth(Month month) {
		        this.month = month;
		    }
		    
		    public void test() {
		        switch (month) {
		            case january:
		                System.out.println("january .");
		                break;
		                    
		            case february:
		                System.out.println("february");
		                break;
		                         
		            case march:
		                System.out.println("Wmarch.");
		                break;
		                        
		            case april:
		                System.out.println("april");
		                break;
		            case june:
		                System.out.println("june");
		                break;
		                default:
		                	System.out.println("hello");
		                	
		        }
		    }
		    
		    public static void main(String[] args) {
		    	TestMonth firstDay = new TestMonth(Month.january);
		        firstDay.test();
		        TestMonth thirdDay = new TestMonth(Month.february);
		        thirdDay.test();
		        TestMonth fifthDay = new TestMonth(Month.march);
		        fifthDay.test();
		        TestMonth sixthDay = new TestMonth(Month.april);
		        sixthDay.test();
		        TestMonth seventhDay = new TestMonth(Month.june);
		        seventhDay.test();
		    }
		

	}


