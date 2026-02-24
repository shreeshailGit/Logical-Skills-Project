package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IndusIandBank_Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 1, 5, 3, 4, 6);

		list = list.stream().sorted((a, b) -> a - b).collect(Collectors.toList());
		System.out.println(list);

	}// main
}
/*class Printer{
    private static Printer INSTANCE;
 
    private Printer() { }

    public static Printer getInstance(){
         if(INSTANCE == null){
           return new Printer();
        }else{
            return INSTANCE;
         }
     }
  }
*/

/*@Test
public void shouldReturnNumber_addTest(){
   when().thenReturn();
   service.add(10,20);

  assert
}

assertEquals(30, add(10,20))
*/

/*Method(String x) {
BL1
BL2
BL3
BL4
}
 
@ParameterizedTest
 
serialVersionUID
 


Made a payment x and saving in DB post success but my commit got rolled back due to timeout.
I have a scheduler which will pick x and again processes it resulting in double payment
 
How can I handle this situation 
 
Can I add Idempotency Key in headers for payment?
 


A - Account
B - Onboarding
C - Payment
D
E
F
G
H
I
J
A-J will produce events via kafka
 
K will act as consumer - Audit will use new connections DB string
*/

