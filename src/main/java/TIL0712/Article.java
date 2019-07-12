package TIL0712;

import java.util.ArrayList;
import java.util.List;

public class Article implements Cloneable{
    private String title;
    private String contents;
    private List<String> goods;


    public Article(String title, String contents, List<String> goods) {
        this.title = title;
        this.contents = contents;
        this.goods = goods;
    }

    public static Article copy(Article article) {
        return new Article(article.title,article.contents,article.getGoods());
    }


    public List<String> getGoods() {
        return new ArrayList<>(goods);
    }

    public void setGoods(List<String> goods) {
        this.goods = goods;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
