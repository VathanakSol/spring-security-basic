package co.istad.springsecuritybasic.restcontrollers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/articles")
public class ArticleRestController {

    // read-all
    @GetMapping
    public String getAllArticles(){
        return "Getting All articles from the database";
    }
    // read-by-id
    @GetMapping("/read/{id}")
    public String readSingleArticle(@PathVariable int id){
        return "Return on article " + id;
    }
    // write  (create a new article)
    @PostMapping("/write")
    public String createArticle(){
        return "Creating the new article!";
    }
    // delete
    @DeleteMapping("/delete/{id}")
    public String deleteArticle(@PathVariable int id){
        return "Successfully delete the article";
    }
}
