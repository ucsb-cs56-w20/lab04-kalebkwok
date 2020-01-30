package edu.ucsb.cs56.ratcalc.model;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class RationalTest {

    private Rational r_5_15;
    private Rational r_24_6;
    private Rational r_3_7;  
    private Rational r_13_4;
    private Rational r_20_25;
    private Rational r_25_20;
    private Rational r_0_1; 
    
    @Before public void setUp() {
	r_5_15 = new Rational(5,15);
	r_24_6 = new Rational(24,6);
	r_3_7  = new Rational(3,7);
	r_13_4 = new Rational(13,4);
	r_20_25 = new Rational(20,25);
	r_0_1 = new Rational(0,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_denom_zero() {
	Rational r = new Rational(1,0);
    }
    
    @Test
    public void test_getNumerator_20_25() {
	assertEquals(4, r_20_25.getNumerator());
    }
    
    @Test
    public void test_getNumerator_13_4() {
	assertEquals(13, r_13_4.getNumerator());
    }
    
    @Test
    public void test_getDenominator_20_25() {
	assertEquals(5, r_20_25.getDenominator());
    }
    
    @Test
    public void test_getDenominator_13_4() {
	assertEquals(4, r_13_4.getDenominator());
    }

    @Test
    public void test_toString_5_15() {
	assertEquals("1/3",r_5_15.toString());
    }

    @Test
    public void test_toString_24_6() {
	assertEquals("4",r_24_6.toString());
    }

    @Test
    public void test_toString_3_7() {
	assertEquals("3/7",r_3_7.toString());
    }
    
    @Test
    public void test_toString_20_25() {
	assertEquals("4/5",r_20_25.toString());
    }

    @Test
    public void test_toString_0_1() {
	assertEquals("0",r_0_1.toString());
    }

    @Test
    public void test_gcd_5_15() {
	assertEquals(5, Rational.gcd(5,15));
    }

    @Test
    public void test_gcd_15_5() {
	assertEquals(5, Rational.gcd(15,5));
    }

    @Test
    public void test_gcd_24_6() {
	assertEquals(6, Rational.gcd(24,6));
    }

    @Test
    public void test_gcd_17_5() {
	assertEquals(1, Rational.gcd(17,5));
    }
    
    @Test
    public void test_gcd_1_1() {
	assertEquals(1, Rational.gcd(1,1));
    }

    @Test
    public void test_gcd_20_25() {
	assertEquals(5, Rational.gcd(20,25));
    }

    @Test
    public void test_rational_m10_m5() {
	Rational r = new Rational(-10,-5);
	assertEquals("2",r.toString());
    }

    @Test
    public void test_rational_m5_6() {
	Rational r = new Rational(-5,6);
	assertEquals("-5/6",r.toString());
    }

    @Test
    public void test_rational_7_m8() {
	Rational r = new Rational(7,-8);
	assertEquals("-7/8",r.toString());
    }

    @Test
    public void test_r_5_15_times_r_3_7() {
	Rational r = r_5_15.times(r_3_7);
	assertEquals("1/7",r.toString());
    }

    @Test
    public void test_r_3_7_times_r_13_4() {
	Rational r = r_3_7.times(r_13_4);
	assertEquals("39/28",r.toString());
    }

    @Test
    public void test_r_m3_1_times_1_m3() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_1_m3 = new Rational(1,-3);
	Rational r = r_m3_1.times(r_1_m3);
	assertEquals("1",r.toString());
    }

   @Test
    public void test_product_of_r_5_15_and_r_3_7() {
       Rational r = Rational.product(r_5_15,r_3_7);
       assertEquals("1/7",r.toString());
    }

    @Test
    public void test_product_of_r_3_7_and_r_13_4() {
	Rational r = Rational.product(r_3_7,r_13_4);
	assertEquals("39/28",r.toString());
    }

    @Test
    public void test_product_of_r_m3_1_and_1_m3() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_1_m3 = new Rational(1,-3);
	Rational r = Rational.product(r_m3_1,r_1_m3);
	assertEquals("1",r.toString());
    }
 
   @Test
    public void test_lcm_of_5_4() {
    int a = 5;
    int b = 4;
	int r = Rational.lcm(a,b);
	assertEquals(20,r);
    }
    
     @Test
    public void test_lcm_of_m3_5() {
    int a = -3;
    int b = 5;
	int r = Rational.lcm(a,b);
	assertEquals(-15,r);
    }

     @Test
    public void test_lcm_of_0_4() {
    int a = 0;
    int b = 4;
	int r = Rational.lcm(a,b);
	assertEquals(0,r);
    }
      
   
       
    @Test
    public void test_plus_of_r_1_1(){
	Rational r_1_1 = new Rational(1,1); 
	Rational r = r_1_1 .plus(r_1_1);
	assertEquals("2",r.toString());
    }
       
 
    @Test
    public void test_sum_of_r_1_3_and_1_m3() {
	Rational r_1_3 = new Rational(1,3);
	Rational r_1_m3 = new Rational(1,-3);
	Rational r = Rational.sum(r_1_3,r_1_m3);
	assertEquals("0",r.toString());
    }


    @Test
    public void test_sum_of_r_m3_1_and_1_m3() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_1_m3 = new Rational(1,-3);
	Rational r = Rational.sum(r_m3_1,r_1_m3);
	assertEquals("-10/3",r.toString());
    }


    @Test
    public void test_sum_of_r_m3_1_and_2_m3() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_2_m3 = new Rational(2,-3);
	Rational r = Rational.sum(r_m3_1,r_2_m3);
	assertEquals("-11/3",r.toString());
    }

   @Test
    public void test_minus_of_r_m3(){
	Rational r_1_1 = new Rational(1,1); 
	Rational r = r_1_1 .minus(r_1_1);
	assertEquals("0",r.toString());
    }


    @Test
    public void test_difference_of_r_m3_1_and_1_m3() {
	Rational r_m3_1 = new Rational(2,1);
	Rational r_1_m3 = new Rational(-1,1);
	Rational r = Rational.difference(r_m3_1,r_1_m3);
	assertEquals("3",r.toString());
    }

    @Test
    public void test_difference_of_r_m2_1_and_m1_1() {
	Rational r_m2_1 = new Rational(-2,1);
	Rational r_m1_1 = new Rational(-1,1);
	Rational r = Rational.difference(r_m2_1,r_m1_1);
	assertEquals("-1",r.toString());
    }

    @Test
    public void test_difference_of_r_1_1_and_m1_1() {
	Rational r_1_1 = new Rational(1,1);
	Rational r_m1_1 = new Rational(-1,1);
	Rational r = Rational.difference(r_1_1,r_m1_1);
	assertEquals("2",r.toString());
    }
       
    @Test
    public void test_reciprocalOf_of_r_1_m3(){
	Rational r_1_m3 = new Rational(1,-3);
	Rational r = r_1_m3.reciprocalOf();
	assertEquals("-3",r.toString());
    }

    @Test
    public void test_reciprocalOf_of_r_1_3(){
	Rational r_1_3 = new Rational(1,3);
	Rational r = r_1_3.reciprocalOf();
	assertEquals("3",r.toString());
    }
    
   
    @Test
    public void test_reciprocalOf_of_r_3_m6(){
	Rational r_3_m6 = new Rational(3,-6);
	Rational r = r_3_m6.reciprocalOf();
	assertEquals("-2",r.toString());
    }

    @Test
    public void test_dividedBy_of_r_m3_1(){
	Rational r_m3_1 = new Rational(-3,1);
	Rational r = r_m3_1.dividedBy(r_m3_1);
	assertEquals("1",r.toString());
    }

    @Test
    public void test_dividedBy_of_r_2_4(){
	Rational r_2_4 = new Rational(2,4);
    Rational r_2_1 = new Rational(2,1);
	Rational r = r_2_4.dividedBy(r_2_1);
	assertEquals("1/4",r.toString());
    }
    
     @Test
    public void test_dividedBy_of_r_2_m5(){
	Rational r_2_m5 = new Rational(2,-5);
    Rational r_m1_1 = new Rational(-1,1);
	Rational r = r_2_m5.dividedBy(r_m1_1);
	assertEquals("2/5",r.toString());
    }
      
    @Test
    public void test_quotient_of_r_m3_1() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_1_3 = new Rational(1,3);
	Rational r = Rational.quotient(r_m3_1,r_1_3);
	assertEquals("-9",r.toString());
    }

    @Test
    public void test_quotient_of_r_m3_1_2() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_1_m3 = new Rational(1,-3);
	Rational r = Rational.quotient(r_m3_1,r_1_m3);
	assertEquals("9",r.toString());
    }

    @Test
    public void test_quotient_of_r_1_m5() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_1_m5 = new Rational(1,-5);
	Rational r = Rational.quotient(r_m3_1,r_1_m5);
	assertEquals("15",r.toString());
    }
}
      