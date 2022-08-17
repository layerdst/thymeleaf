package hello.thymeleaf.basic;

public class Main {
    public static void main(String[] args) {
        TestClass c = new TestClass();
        c.getType().equals(TestClass.MessageType.ENTER);
    }
}
