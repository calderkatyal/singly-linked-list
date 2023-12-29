public class CalderKatyal_SinglyLinkedListClass{

    public static void main(String[] args){
      
     
  
      SinglyLinkedList l;        
      // Testing add and print
      System.out.println("---TESTING ADD---");
      
      try{
        l = new SinglyLinkedList();
        l.print(); System.out.print("first="+l.first+" last="+l.last);System.out.println(" Test 1:          \tcorrect output: []  first=null,last=null");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 1 ************************************");
      }
      try{
        l = new SinglyLinkedList();
        l.add(0);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data);System.out.println(" Test 2:          \tcorrect output: [0] first=0,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 2 ************************************");
      }
      try{
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 3:          \tcorrect output: [0, 1] first=0,last=1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 3 ************************************");
      } 
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 4:          \tcorrect output: [0, 1, 2]  first=0,last=2");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 4 ************************************");
      }
  
      // Testing remove
      System.out.println("---TESTING REMOVE---");
      
      try {
        l = new SinglyLinkedList();
        l.remove(); // should NOT cause a run time error
        System.out.println(" Test 5:          \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 5 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.remove();
        l.print(); System.out.print("first="+l.first+" last="+l.last); System.out.println(" Test 6:          \tcorrect output: []  first=null,last=null");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 6 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.remove();
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 7:         \tcorrect output: [0] first=0,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 7 ************************************");
      }
      
  
      
      // Testing size function
      // Note this does not comprehensively Test size if you use and keep track
      // of a size variable vs calculating it on the fly
      // If you use a size variable you MUST Test the size after EVERY other Test.
      System.out.println("---TESTING SIZE---");
      try {
        l = new SinglyLinkedList();
        System.out.println(" Test 9:        "+l.size()+" \tcorrect output: 0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 9 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);   
        System.out.println(" Test 10:        "+l.size()+" \tcorrect output: 1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 10 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        System.out.println(" Test 11:        "+l.size()+" \tcorrect output: 2");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 11 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        System.out.println(" Test 12:        "+l.size()+" \tcorrect output: 3");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 12 ************************************");
      }
  
      // Testing add (at position)
      System.out.println("---TESTING ADD AT POSITION---");
      
      try {
        l = new SinglyLinkedList();
        l.add(1, 0);
        System.out.println(" Test 13:         \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 13 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(5);
        l.add(-3,2);
        System.out.println(" Test 14:  \tcorrect output:  cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 14 ************************************");
      }
      try{
        l = new SinglyLinkedList();
        l.add(0);
        l.add(0, 1);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 15:         \tcorrect output: [1, 0]  first=1,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++FAILED TEST 15 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(0, 1);
        l.add(1, 2);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 16:         \tcorrect output: [1, 2, 0] first=1,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 16 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(0, 1);
        l.add(1, 2);
        l.add(3, 3);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 17:         \tcorrect output: [1, 2, 0, 3]  first=1,last=3");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 17 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0, 1);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 18:         \tcorrect output: [1]  first=1,last=1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 18 ************************************");
      }
      
  
      // Testing remove (at position)
      System.out.println("---TESTING REMOVE AT POSITION---");
      try {
        l = new SinglyLinkedList();
        l.remove(0); // should NOT cause a run time error
        l.print(); System.out.print("first="+l.first+" last="+l.last); System.out.println(" Test 19:         \tcorrect output: [] first=null,last=null");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 19 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.remove(1); // should NOT cause a run time error
        l.print(); System.out.print("first="+l.first+" last="+l.last); System.out.println(" Test 20:         \tcorrect output: [] first=null,last=null");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 20 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.remove(1); // should NOT cause a run time error
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 21:         \tcorrect output: [0]  first=0,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 21 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.remove(0);
        l.print(); System.out.print("first="+l.first+" last="+l.last); System.out.println(" Test 22:        \tcorrect output: [] first=null,last=null");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 22 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.remove(0);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 23:        \tcorrect output: [1] first=1,last=1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 23 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.remove(0);
        l.add(0);
        l.add(1);
        l.remove(0);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 24:        \tcorrect output: [1] first=1,last=1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 24 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.remove(2);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 25:        \tcorrect output: [0, 1, 3] first=0,last=3");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 25 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.remove(2);
        l.remove(2);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 26:        \tcorrect output: [0, 1] first=0,last=1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 26 ************************************");
      }
      
      // Testing get
      System.out.println("---TESTING GET---");
      try {
        l = new SinglyLinkedList();
        int s = l.get(0); // should not cause a run time error
        System.out.println(" Test 27:        \tcannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 27 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        int s = l.get(3); // should not cause a run time error
        System.out.println(" Test 28:        \tcannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 28 ************************************");
      } 
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        System.out.println(" Test 29:        "+l.get(0)+" \tcorrect output: 0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 29 ************************************");
      } 
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        System.out.println(" Test 30:        "+l.get(1)+" \tcorrect output: 1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 30 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        System.out.println(" Test 31:        "+l.get(2)+" \tcorrect output: 2");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 31 ************************************");
      }
  
      // Testing set
      System.out.println("---TESTING SET---");
      
      try {
        l = new SinglyLinkedList();
        l.set(0, 99); // should not cause a run time error
        System.out.println(" Test 32:         \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 32 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.set(0, 99);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 33:         \tcorrect output: [99] first=99,last=99");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 33 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.set(0, 99);
        l.add(1);
        l.add(2);
        l.set(1, 98);
        l.set(2, 97);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println(" Test 34:         \tcorrect output: [99, 98, 97] first=99,last=97");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 34 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.set(3, 100); // should not cause a run time error
        System.out.println(" Test 35:         \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 35 ************************************");
      }
      
  
      // Testing backwardsPrint
      System.out.println("---TESTING BACKWARDS PRINT---");
      
      try {
        l = new SinglyLinkedList();
        l.reversePrint();
        System.out.println("Test 36:        \tcorrect output: [] ");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 36 ************************************");
      } 
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.reversePrint();
        System.out.println("Test 37:        \tcorrect output: [0]");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 37 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.reversePrint();
        System.out.println("Test 38:        \tcorrect output: [1, 0] ");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 38 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.reversePrint();
        System.out.println("Test 39:        \tcorrect output: [2, 1, 0] ");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 39 ************************************");
      }
  
  
      // Testing clear
      System.out.println("---TESTING CLEAR---");
      
      try {
        l = new SinglyLinkedList();
        l.clear();
        l.print(); System.out.print("first="+l.first+" last="+l.last);System.out.println("Test 40:        \tcorrect output: [] first=null,last=null");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 40 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.clear();
        l.print(); System.out.print("first="+l.first+" last="+l.last);System.out.println("Test 41:        \tcorrect output: [] first=null,last=null");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 41 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.clear();
        l.print(); System.out.print("first="+l.first+" last="+l.last);System.out.println("Test 42:        \tcorrect output: [] first=null,last=null");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 42 ************************************");
      }
  
  
      // Testing Sw0p
      System.out.println("---TESTING SWAP---");
      try {
        l = new SinglyLinkedList();
        l.swap(0,1); // should not cause a run time error
        System.out.println("Test 43:        \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 43 ************************************");
      } 
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.swap(0,1); // should not cause a run time error
        System.out.println("Test 44:        \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 44 ************************************");
      } 
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.swap(1,3); // should not cause a run time error
        System.out.println("Test 45:        \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 45 ***********************************");
      } 
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.swap(0,0); // should not cause a run time error
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 46:        \tcorrect output: [0, 1] first=0,last=1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 46 ************************************");
      } 
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.swap(0,1);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 47:        \tcorrect output: [1, 0] first=1,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 47 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(0,1);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 48:        \tcorrect output: [1, 0, 2, 3] first=1,last=3");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 48 ************************************");
      }
      
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(0,2);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 49:        \tcorrect output: [2, 1, 0, 3] first=2,last=3");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 49 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(0,3);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 50:       \tcorrect output: [3, 1, 2, 0] first=3,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 50 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.swap(0,3);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 51:        \tcorrect output: [3, 1, 2, 0, 4] first=3,last=4");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 51 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.swap(2,3);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 52:         \tcorrect output: [0, 1, 3, 2, 4] first=0,last=4");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 52 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.swap(1,3);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 53:        \tcorrect output: [0, 3, 2, 1, 4] first=0,last=4");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 53 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.swap(1,4);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 54:       \tcorrect output: [0, 4, 2, 3, 1, 5] first=0,last=5");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 54 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(2,3);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 55:        \tcorrect output: [0, 1, 3, 2] first=0,last=2");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 55 ************************************");
      }
      
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(1,3);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 56:         \tcorrect output: [0, 3, 2, 1] first=0,last=1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 56 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.swap(1,0); // should not cause a run time error
        System.out.println("Test 57:        \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 57 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.swap(1,0); // should not cause a run time error
        System.out.println("Test 58:        \tcorrect output: cannot do it");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 58 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.swap(3,1); // should not cause a run time error
        l.print(); System.out.println("Test 59:        \tcorrect output: [0, 1]");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 59 ************************************");
      }
      try{
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.swap(1,0);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 60:        \tcorrect output: [1, 0] first=1,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 60 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(1,0);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 61:         \tcorrect output: [1, 0, 2, 3] first=1,last=3");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 61 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(2,0);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 62:        \tcorrect output: [2, 1, 0, 3] first=2,last=3");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 62 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(3,0);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 63:        \tcorrect output: [3, 1, 2, 0] first=3,last=0");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 63 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.swap(3,0);
        l.print();System.out.print("first="+l.first.data+" last="+l.last.data);  System.out.println("Test 64:         \tcorrect output: [3, 1, 2, 0, 4] first=3,last=4");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 64 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.swap(3,2);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 65:         \tcorrect output: [0, 1, 3, 2, 4] first=0,last=4");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 65 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.swap(3,1);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 66:         \tcorrect output: [0, 3, 2, 1, 4] first=0,last=4");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 66 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.swap(4,1);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 67:         \tcorrect output: [0, 4, 2, 3, 1, 5] first=0,last=5");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 67 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(3,2);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 68:         \tcorrect output: [0, 1, 3, 2] first=0,last=2");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 68 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.swap(3,1);
        l.print(); System.out.print("first="+l.first.data+" last="+l.last.data); System.out.println("Test 69:  \tcorrect output: [0, 3, 2, 1] first=0,last=1");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 69 ************************************");
      }
  
  
  
      // Testing isEmpty
      System.out.println("---TESTING ISEMPTY---");
      try {
        l = new SinglyLinkedList();
        System.out.println("Test 70:        "+l.isEmpty()+"\tcorrect output: TRUE");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 70 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        System.out.println("Test 71:        "+l.isEmpty()+"\tcorrect output: FALSE");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 71 ************************************");
      }
      try {
        l = new SinglyLinkedList();
        l.add(0);
        l.add(1);
        l.add(2);
        System.out.println("Test 72:        "+l.isEmpty()+"\tcorrect output: FALSE");
      } catch(Exception e){
        System.out.println(e);
        System.out.println("++++++++++++++++++ FAILED TEST 72 ************************************");
      }
  
  
    }
  }
  class Node{
      int data; 
      Node next; 
    //constructor 
    Node (int a){
      data = a; 
      next = null; 
    }
  }
  class SinglyLinkedList{
    Node first;
    Node last; 
    SinglyLinkedList(){
      first = null; 
      last = null; 
    }
   void add(int value){ //add the given value to the end of the linked list
    Node addedNode = new Node(value);
      if(first==null){ // if there is an empty list
        first = addedNode;
      }
      else{ //in every other case
        last.next = addedNode;
      } 
      last = addedNode;
    }
    void print(){ //print contents of the linked list nicely
      System.out.print("[");
      Node temp = first; 
      while(temp!=null){//if there is an item at temp
        System.out.print(temp.data);
        if (temp.next!=null){ //if there is a value after temp
          System.out.print(",");
        }
        temp=temp.next;
      }
      System.out.println("]");
    }
    int size(){ //returns the size of the list
      Node temp = first;
      int n = 0; 
      while(temp!=null){ //when there is a Node at temp
        temp=temp.next;
        n=n+1;
      }
      return n;    
    }
    private Node getNode(int pos){ //helper function, returns the Node at a given position
      Node temp=first;
      for(int i=0; i<pos; i++){ //loop through until reaching Node at pos
        temp=temp.next;
      }
      return temp;
    }
    int remove(){  //remove the last Node from the list and return the value stored in that Node
      //0 Nodes in the list
      if(first==null){
        System.out.println("Error!  You cannot remove something from an empty list!");
        return -1;
      }
      //1 Node in the list
      int s = last.data;
      if(first==last){
        first = null;
        last = null;
        return s;
      }
      //Multiple Nodes in the list
      else{
        Node temp = getNode(size()-2);
        last = temp; //second to last becomes last
        temp.next = null;
        return s; 
      }
    }
    boolean isEmpty(){  //returns true if the list is empty, false otherwise
  
      if(first==null){ //if the list is empty
        return true;
      }
      else{
        return false; //if the list is not empty
      }
    }
    int get(int pos){ //returns the int stored at position pos
      if(pos>=size()||pos<0){ //if there is not a Node at pos
        System.out.println("Error!  Nothing exists at that position!");
        return -1;
      }
      else{ //if there is a Node at pos
      return getNode(pos).data;
      }
    }
    void add(int pos, int value){ //add value to the linked list at position pos
      //if position pos is not in the list
      if(pos<0||pos>size()){
        System.out.println("You cannot add to the list at this position!");
      }
      else{
          Node addedNode = new Node(value);
        if(pos==size()){ //adding at the end of the list
          add(value);
        }
        else if (pos == 0){
          Node temp = first;
          first = addedNode;
          first.next=temp;
        }
        else if(pos>0 && pos<size()){  //if position pos is in the list but not at the end
          //change the Node before it to point to the new Node
          Node temp = getNode(pos);
          getNode(pos-1).next = addedNode;
          addedNode.next=temp;
        } 
      }
    }
    int remove(int pos){  //remove node at position pos and return the int value of that item
      if (pos<0||pos>=size()){
        System.out.println("There is no node at that position!");
        return -1;
      }
      Node s = getNode(pos);
      int a = s.data;
      if(pos==0){ //removing the first Node
        first=s.next;
        if(s.next==null){ 
          last=null;
        }
      }
      else if (pos==size()-1){ //removing the last Node
        last=getNode(pos-1);
        last.next=null;
      }
      else{   //in any other case
        getNode(pos-1).next=getNode(pos+1);
      }
      return a;
    }
     
    void set(int pos, int value){  //set the value of the node at position pos to be value
      if(pos<0||pos>=size()){
        System.out.println("There is no node at that position!");
      }
      else{
        getNode(pos).data=value;
      }
    }
  
    void reversePrint(){  //prints the nodes in reverse order (from last to first)
      System.out.print("[");
       for(int i = size()-1;i>=0;i-=1){
        System.out.print(get(i));
        if(i>0){
          System.out.print(",");
        }  
       }
       System.out.println("]");
    }
    void clear(){ //removes all elements of the list  
      first = null; //orphan everything
      last=null; 
    }
  
    void swap(int a, int b){
      if(a<0||a>size()-1||b<0||b>size()-1){
        System.out.println("These position(s) do not exist in the list!");
      }
  
      else if (a!=b){
        if (b<a){   //If b<a switch b and a so that you can assume that a<b for all your cases and thus save you the effort of duplicating every case
          int temp=a;
          a=b;
          b=temp;
        }
  
        //save Nodes
        Node tempb = getNode(b);
        Node tempbbefore = getNode(b-1);
        Node tempa = getNode(a);
        Node tempaafter = getNode(a+1);
        Node tempabefore = null;
        if(a!=0){
          tempabefore = getNode(a-1);
        }
        Node tempbnext = getNode(b).next;
  
        //CASES
        if(a+1==b){   //if they are next to each other
          if(a!=0){ //if a is not 0 
            tempabefore.next=tempb;
            tempb.next=tempa;
            tempa.next=tempbnext;
          }
          else{ //if a is 0
            first=tempb;
            tempb.next=tempa;
            tempa.next=tempbnext;
          }
        }
  
  
        else{ //if they are not next to each other
          if(a!=0){ //if a is not 0
            tempabefore.next=tempb;
            tempb.next=tempaafter;
            tempbbefore.next=tempa;
            tempa.next=tempbnext;
           } 
          else{ //if a is 0
            first=tempb;
            tempb.next=tempaafter;
            tempbbefore.next=tempa;
            tempa.next=tempbnext;
          }
        }
        if (b==size()-1){ //if b is at the end
          last=tempa;
        }
      } 
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  
       
  
  
  
  