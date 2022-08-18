package hello.thymeleaf.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.net.http.HttpRequest;
import java.util.Map;

@Slf4j
@Controller
public class Test {


    @RequestMapping("/result")
    public String result(HttpServletRequest request,
                         @RequestParam("retUrl") String reqUrl,
                         RedirectAttributes redirectAttributes) {
        HttpSession session = request.getSession();
        String id = (String)session.getAttribute("id");
        String name = (String) session.getAttribute("name");
        String pwd = (String) session.getAttribute("pwd");

        log.info("result id = {}", id);
        log.info("result name = {}", name);
        log.info("result pwd = {}", pwd);
        log.info("result reqUrl = {}", reqUrl);

        redirectAttributes.addAttribute("id", id);
        redirectAttributes.addAttribute("name", name);
        redirectAttributes.addAttribute("pwd", pwd);
        redirectAttributes.addAttribute("reqUrl", reqUrl);

        return "redirect:/{reqUrl}";

    }
}
