package denis.news.services;



import denis.news.dao.ArticleRepository;
import denis.news.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;

    public void save(Article article){
        repository.save(article);
    }
}
