import static org.junit.Assert.*;

 

import org.junit.Test;

 

public class TriangleTest {

 

       @Test

       public void test() {

              long a =0;

              long b = 0;

              long c = 0;

              Triangle result = new Triangle(a,b,c);

              long [] borders = {0,0,0};

              result.getBorders();

              assertArrayEquals(borders,result.getBorders());

              assertEquals(false,result.isTriangle(result));

              assertEquals("Illegal",result.getType(result));

       }

 

 

 

       @Test

       public void test1() {

              long a =3;

              long b =4;

              long c =5;

              Triangle result = new Triangle(a,b,c);

              long [] borders = {3,4,5};

              result.getBorders();

              assertArrayEquals(borders,result.getBorders());

              assertEquals(true,result.isTriangle(result));

              assertEquals("Scalene",result.getType(result));

       }

       

       @Test

       public void test2() {

              long a =3;

              long b =3;

              long c =4;

              Triangle result = new Triangle(a,b,c);

              long [] borders = {3,3,4};

              result.getBorders();

              assertArrayEquals(borders,result.getBorders());

              assertEquals(true,result.isTriangle(result));

              assertEquals("Isosceles",result.getType(result));

       }

       

       @Test

       public void test3() {

              long a =3;

              long b =3;

              long c =3;

              Triangle result = new Triangle(a,b,c);

              long [] borders = {3,3,3};

              result.getBorders();

              assertArrayEquals(borders,result.getBorders());

              assertEquals(true,result.isTriangle(result));

              assertEquals("Regular",result.getType(result));

       }

       

       @Test

       public void test4() {

              long a =1;

              long b = 2;

              long c = 3;

              Triangle result = new Triangle(a,b,c);

              long [] borders = {1,2,3};

              result.getBorders();

              assertArrayEquals(borders,result.getBorders());

              assertEquals(false,result.isTriangle(result));

              assertEquals("Illegal",result.getType(result));

       }

 

}
