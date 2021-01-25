package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class MessageAdvice {

    @ModelAttribute("message")
    public String message(@Value("${application.message:Hello World}") String message) {
        return message;
    }

    @ModelAttribute("mytext1")
    public String mytext1(@Value("${application.mytext1:default mytext1}") String message) {
        return message;
    }

}
