package payrollsystemtest;
public class PayRollSystemTest {

    public static void main(String[] args) {
        //upcasting 
        Employee firstEmployee = new SalariedEmployee("Nail","Rao","42-0923-2324",1000.00);
        Employee secondEmployee = new CommissionEmployee("Laima","Sanzarkheil","232-243234-24234",10000.00,0.07);
        Employee thirdEmployee = new BasePlusComissionEmployee("Kiran","Sheikh", "313-21242-24234", 5000.00 , 0.08 , 500.00 );
        Employee fourthEmployee = new HourlyEmployee( "John" , "Keit","234-2343-23235" , 17.23 , 30.50 );
        // polymorphism: calling toString() and earning() on Employee’s reference
        System.out.println(firstEmployee);
        System.out.printf("Salaried Employee's earning: %.2f%n", firstEmployee.earning());
        System.out.println("\n"+secondEmployee);
        System.out.printf("Commission Employee's earning: %.2f%n", secondEmployee.earning());
        System.out.println(thirdEmployee);
        // performing downcasting to access & raise base salary
        //Syntax: downClassName obj = (downClassName) upCastedObj;
        BasePlusComissionEmployee currentEmployee = (BasePlusComissionEmployee) thirdEmployee;
        
        double oldBS = currentEmployee.getBS();
        
        System.out.println( "Old base salary: " + oldBS) ;
        currentEmployee.setBS(1.10 * oldBS);
        System.out.println("New base salary with 10% increase is: "+ currentEmployee.getBS());
        System.out.printf("Third Employee's earning: %.2f%n", thirdEmployee.earning());
       
        System.out.println(fourthEmployee);
        System.out.printf("Hourly Employee's earning: %.2f%n", fourthEmployee.earning() );
   }
    
}
