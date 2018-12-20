package denis.news.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Article implements Serializable, Comparable<Article> {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String title;
    @Column
    @Lob
    private  String content;
    @Column
    private long creationTime;

    public Article(){

    }


    public Article(String title, String content){
        this.title = title;
        this.content = content;
        this.creationTime = System.currentTimeMillis();
    }


    @Override
    public int compareTo(Article that) {
        return Long.compare(this.creationTime, that.creationTime);
    }


    public void setContent(String content) {
        this.content = content;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }


    public String getTitle() {
        return title;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
