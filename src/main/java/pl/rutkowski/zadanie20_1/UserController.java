package pl.rutkowski.zadanie20_1;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


@Controller
public class UserController {

    @Resource
    private UserList userList;

    @GetMapping("/user")
    @ResponseBody
    public List<User> userList() {
        return userList.getAll();
    }

    @RequestMapping("/add")
    public String addUser(@RequestParam(name = "imie", required = false) String firsName,
                        @RequestParam(name = "nazwisko", required = false) String lastName,
                        @RequestParam(name = "wiek", required = false) Integer age) {
        if (Objects.equals(firsName, "") || Objects.equals(lastName, "")) {
            return "redirect:/err.html";
        }
        userList().add(new User(firsName, lastName, age));
        return "redirect:/success.html";

    }
}
