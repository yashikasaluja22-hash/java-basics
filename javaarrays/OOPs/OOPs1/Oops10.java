public class Oops10 {
    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }
    public void main(String[] args) {
      Test obj = new Test("anne shirley");
      System.out.println(obj.name);
    }
}
