package uz.pdp.task1.springmvcjavaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uz.pdp.task1.springmvcjavaconfig.config.Todo;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
public class TodoController {
    private final List<Todo> todos = new ArrayList<>();

    @GetMapping("/todos")
    public String todos() {
        todos.add(new Todo(1, "Dushanba"));
        todos.add(new Todo(2, "Seshanba"));
        String s = "<table>\n" +
                "  <tr>\n" +
                "    <th>Id</th>\n" +
                "    <th>Name</th>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "     <td>" + todos.get(0).getId() + "     </td>\n" +
                "     <td>" + todos.get(0).getName() + "     </td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "     <td>" + todos.get(1).getId() + "     </td>\n" +
                "     <td>" + todos.get(1).getName() + "     </td>\n" +
                "  </tr>\n" +
                "</table>";
        return s;
    }
//    @GetMapping("/todos")
//    public ModelAndView todos() {
//        ModelAndView modelAndView = new ModelAndView();
//        todos.add(new Todo(1, "Dushanba"));
//        modelAndView.addObject("todoList", todos);
//        return modelAndView;
//    }
}
