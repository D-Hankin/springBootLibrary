package bootBiblioteket.bootBiblioteket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class BootBiblioteketController {

    public static final List<BootBiblioteket> bookList = new ArrayList<>();
    
    @GetMapping("/")
    String getBootBibilioteket(Model model) {
        model.addAttribute("bookList", bookList);
        model.addAttribute("newBook", new BootBiblioteket(null, null, 0, 0, false));
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

    @GetMapping("/details/rent/{itemId}")
    String getRent(@PathVariable int itemId, Model model) {

        System.out.println("Details" + itemId);

        for(BootBiblioteket book : bookList) {
            if (book.getId() == itemId){
                model.addAttribute("book", new BootBiblioteket(book.getName(), book.getAuthor(), book.getNoOfPages(), book.getId(), book.isRented()));
                System.out.println(book.getName());
                book.setRented();

                return "details";
            }
        }

        return "details";
    }

    @PostMapping("/new-book")
    String newBook(@RequestParam("name") String name, @RequestParam("author") String author, @RequestParam("noOfPages") int noOfPages) {
        System.out.println((name + " " + author + " " + noOfPages));
        bookList.add(new BootBiblioteket(name, author, noOfPages, bookList.size() + 1, false));
        return "redirect:/";
    }
}
