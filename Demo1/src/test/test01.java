package test;

/**
 * @author Zee
 * @date 2020/8/31 -9:58
 */
public class test01 {
    public static void main(String[] args) {
        Person person = new Person(9,"你好！");
        System.out.println(person.getInfo());
    }
    static class Person{
        int a;
        String b;
        Person(int a,String b){
            this.a = a;
            this.b = b;
        }
        public String getInfo(){
            return ("祝福语为："+b+"幸运数字为："+a);
        }
    }

}