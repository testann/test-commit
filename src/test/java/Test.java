public class Test {
     private final Integer myInt;
     
     public Test(Integer myInt) {
          
          assert myInt != null : "myInt != null";
          
          
          this.myInt = myInt + 1234567;
          
          
          //test new comm
     }
}
