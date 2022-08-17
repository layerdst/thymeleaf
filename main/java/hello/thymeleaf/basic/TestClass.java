package hello.thymeleaf.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestClass {
    public enum MessageType{
        ENTER, TALK
    }

    private MessageType type;
    private String roomId;
    private String sender;

}
