public class TalDateTester {
    public static void main(String []args) {
        // tester for date
        String defDate = ("01/01/2000");
        System.out.println("\n\n*****TESTING CONSTRUCTOR******");
        System.out.println("setting valid date not leap: 09-11-2022 expected");
        Date d1 = new Date (9, 11, 2022); // valid date not leap
        System.out.println((d1.toString().equals("09/11/2022") ? "\t****TEST PASSED****" : "\t****TEST FAILED****"));
        System.out.println("DAY:"+d1.getDay());
        System.out.println("MONTH:"+d1.getMonth());
        System.out.println("YEAR:"+d1.getYear());
        System.out.println("************************");
        System.out.println("setting year divided evenly by 4 but not leap");
        Date d17 = new Date(29,02,1700);
        System.out.print(d17);
        System.out.print((d17.toString().equals(defDate)) ? "\t****TEST PASSED****\n" : "\t****TEST FAILED****\n" );
        Date d18 = new Date(29,02,2300);
        System.out.print(d18);
        System.out.print((d18.toString().equals(defDate)) ? "\t****TEST PASSED****\n" : "\t****TEST FAILED****\n" );
        Date d19 = new Date(28,02,1900);
        System.out.print(d19);
        System.out.print((d19.toString().equals("28/02/1900")) ? "\t****TEST PASSED****\n" : "\t****TEST FAILED****\n" );
        System.out.println("************************");
        System.out.println("setting valid date leap: 15-02-2024 expected");
        Date d2 = new Date (15, 2, 2024); // valid date leap
        System.out.print((d2.toString()));
        System.out.print((d2.toString().equals("15/02/2024")) ? "\t****TEST PASSED****\n" : "\t****TEST FAILED****\n" );
        System.out.println("************************");
        System.out.println("setting invalid month default expected: 01-01-2000");
        Date d3 = new Date (9, 14, 2022); // invalid month
        System.out.print(d3);
        System.out.print((d3.toString().equals(defDate)) ? "\t***TEST PASSED***\n" : "\t***TEST FAILED***\n");
        System.out.println("************************");
        System.out.println("setting invalid day in leap default expected");
        Date d4 = new Date (30, 2, 2022); // invalid day+leap
        System.out.print(d4);
        System.out.print((d4.toString().equals(defDate)) ? "\t***TEST PASSED***\n" : "\t***TEST FAILED***\n");
        System.out.println("************************");
        System.out.println("setting invalid year default expected");
        Date d5 = new Date (15, 2, -100); // invalid year
        System.out.print(d5);
        System.out.print((d5.toString().equals(defDate)) ? "\t***TEST PASSED***\n" : "\t***TEST FAILED***\n");
        System.out.println("************************\n\n");   
        System.out.println("*****TESTING FOR ALIASING******");
        Date d10 = new Date (31, 1, 1467);
        Date d11 = new Date(d10);
        d11.setYear(1990);
        System.out.println(((d10.getYear()==1467) ? "\t***TEST PASSED**\n" : "\t***TEST FAILED YEAR 1467 EXPECTED**\n"));
        System.out.println("*****TESTING SETTERS******");
        System.out.println("**WAS:"+d1);
        d1.setDay(15);
        d1.setMonth(5);
        d1.setYear(2024);
        System.out.println("**NOW:"+d1+" **EXPECTED: 15/05/2024\n");
        System.out.println("**WAS:"+d2+" **SETTING LEAP FEB DAY WITH NOT LEAP YEAR**");
        d2.setDay(29);
        d2.setYear(2001);
        System.out.println("**NOW:"+d2+" ** EXPECTED 29/02/2024\n");
        System.out.println("**WAS:"+d3+" **SETTING INVALID DAY IN MONTH YEAR**");
        d3.setMonth(11);
        d3.setDay(31);
        System.out.print(d3);
        System.out.println((d3.toString().equals("01/11/2000") ? "\t****TEST PASSED EXPECTED: 01/11/2000****" : "\t****TEST FAILED EXPECTED: 01/11/2000****" ));
        System.out.println("\n\n*****TESTING BEFORE AFTER******");
        System.out.println("IS "+d3+" BEFORE "+d2+"? >> "+ d3.before(d2)+(((d3.before(d2)==true) ? "\tTEST PASSED" : "\tTEST FAILED")));
        System.out.println("IS "+d3+" BEFORE "+d3+"? >> "+ d3.before(d3) +(((d3.before(d3)==false) ? "\tTEST PASSED" : "\tTEST FAILED")) );
        System.out.println("IS "+d2+" AFTER "+d3+"? >> "+ d2.after(d3) +(((d2.after(d3)==true) ? "\t\tTEST PASSED" : "\tTEST FAILED")) );
        d5.setDay(31);
        d5.setMonth(12);
        d5.setYear(2022);
        d4.setDay(1);
        d4.setMonth(1);
        d4.setYear(2023);
        System.out.println("IS "+d4+" BEFORE "+d5+"? >> "+ d4.before(d5) +(((d4.before(d5)==false) ? "\tTEST PASSED" : "\tTEST FAILED")) );
        System.out.println("IS "+d5+" AFTER "+d4+"? >> "+ d5.after(d4) +(((d5.after(d4)==false) ? "\tTEST PASSED" : "\tTEST FAILED")) );
        System.out.println("IS "+d4+" AFTER "+d4+"? >> "+ d4.after(d4) +(((d4.after(d4)==false) ? "\tTEST PASSED" : "\tTEST FAILED")));
        
        System.out.println("\n\n*****TESTING CALCULATE DIFFERRENCE******");
        d5.setYear(2024);
        d5.setDay(29);
        d5.setMonth(2);
        d4.setDay(10);
        d4.setMonth(11);
        d4.setYear(2022);
        System.out.println("FROM 29/02/2024 TILL 10/11/2022 THERE IS: "+d4.difference(d5)+" DAYS");
        System.out.println((d4.difference(d5)==476) ? "\t***TEST PASSED (476)***" : "\t***TEST FAILED (EXPECTED 476)***");
        System.out.println("\n*****TESTING TOMORROW******");
        d3.setMonth(12);
        d3.setDay(31);
        d3.setYear(2022);
        System.out.println("****TODAY IS:"+d5+" TOMMORROW IS: "+d5.tomorrow() + ((d5.tomorrow().toString().equals("01/03/2024")) ? "\t***TEST PASSED***" : "\t***TEST FAILED***") );
        d4.setDay(30);
        System.out.println("****TODAY IS:"+d4+" TOMMORROW IS: "+d4.tomorrow() + ((d4.tomorrow().toString().equals("01/12/2022")) ? "\t***TEST PASSED***" : "\t***TEST FAILED***") );
        System.out.println("****TODAY IS:"+d3+" TOMMORROW IS: "+d3.tomorrow() + ((d3.tomorrow().toString().equals("01/01/2023")) ? "\t***TEST PASSED***" : "\t***TEST FAILED***") );
    }
}