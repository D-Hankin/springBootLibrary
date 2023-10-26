package bootBiblioteket.bootBiblioteket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class BootBiblioteketController {

    public static final List<BootBiblioteket> bookList = new ArrayList<>();

    static {
        bookList.add(new BootBiblioteket("Dune", "Frank Herbert", 600, 1, false));
        bookList.add(new BootBiblioteket("The Shining", "Stephen King", 555, 2, false));
        bookList.add(new BootBiblioteket("Foundation", "Isaac Asimov", 900, 3, false));
    }
    
    @GetMapping("/")
    String getBootBibilioteket(Model model) {
        model.addAttribute("bookList", bookList);
        System.out.println("HelloBook");
        return "index";
    }

    @GetMapping("/details/{itemId}")
    String getDetails(@PathVariable int itemId, Model model) {


        System.out.println("Details" + itemId);

        for(BootBiblioteket book : bookList) {
            if (book.getId() == itemId){
                model.addAttribute("book", new BootBiblioteket(book.getName(), book.getAuthor(), book.getNoOfPages(), book.getId(), book.isRented()));
                System.out.println(book.getName());
            }
        }

        return "details";
    }
}
