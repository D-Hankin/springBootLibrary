package bootBiblioteket.bootBiblioteket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class BootBiblioteketController {

    public static final List<BootBiblioteket> bookList = new ArrayList<>();

    static {
        bookList.add(new BootBiblioteket("Book1", "Jim", 111, 1));
        bookList.add(new BootBiblioteket("Book2", "John", 222, 1));
        bookList.add(new BootBiblioteket("Book3", "Jack", 333, 1));
        bookList.add(new BootBiblioteket("Book4", "Joe", 444, 1));
    }
    
    @GetMapping("/")
    public String getBootBibilioteket(Model model) {
        model.addAttribute("bookList", bookList);
        System.out.println("HelloBook");
        return "index";
    }
}
