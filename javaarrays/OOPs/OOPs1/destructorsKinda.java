public class destructorsKinda {
    public void main(String[] args){
     for(int i = 0; i < 10000000; i++){
        A obj = new A("randome name");
         //here after every dynamic memory allocation here
         //object destroyer method will be called automatically
         //and whenever object is destroyed, it is also being freed from memmory
     }
    }
class A{
        String name;
        public A(String name){
            this.name = name;
        }
      @Override
      protected void finalize() throws Throwable {//this is no destructor
          System.out.println("object is destroyed");
      }
}
}
