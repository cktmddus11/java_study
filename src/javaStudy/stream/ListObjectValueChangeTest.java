package javaStudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//https://lovon.tistory.com/111
public class ListObjectValueChangeTest {
    // 객체 값 변경 관련
    public static void main(String[] args){
        List<Person> personList = Arrays.asList(new Person("1"), new Person("2"));

        // 객체 값 변경 전 출력
        personList.forEach(person -> System.out.println(person.getName()));

        System.out.println("====");

        // 객체 값 변경
        personList.stream().forEach(person -> person.setName(person.getName() + "AA"));

        personList.forEach(person -> System.out.println(person.getName()));



        // 게시글 목록 조회
        ArticleCommand articleCommandByList = new ArticleCommand("112", "sdfsdfds");
        List<GiantArticle> giantArticleList = getGiantArticleList(articleCommandByList);

        // 첨부파일이 있는 경우에만 첨부파일 조회
        giantArticleList.parallelStream()
                .filter(giantArticle -> giantArticle.getFileCnt() > 0 || giantArticle.getMultimediaCnt() > 0)
                .forEach(giantArticle -> getArticleMetaList(
                        new ArticleCommand(articleCommandByList.getBbsId(), giantArticle.getArticleId()))
                        .stream()
                        .filter(Objects::nonNull)
                        .findFirst()
                        .ifPresent(articleMeta -> {
                            giantArticle.setAttachFiles(articleMeta.getAttachFiles());
                            giantArticle.setMultiMedias(articleMeta.getMultiMedias());
                        }))

        ;



    }
    public static List<GiantArticle> getArticleMetaList (ArticleCommand articleCommand){
        return null;
    }

    public static List<GiantArticle> getGiantArticleList (ArticleCommand articleCommand){
        return null;
    }
    public static List<ArticleCommand> getArticleCommandList (){
        return null;
    }
}

class GiantArticle {
    private int fileCnt;
    private int multimediaCnt;

    private String attachFiles;
    private String multiMedias;

    private String articleId;

    public String getMultiMedias() {
        return multiMedias;
    }

    public void setMultiMedias(String multiMedias) {
        this.multiMedias = multiMedias;
    }

    public String getAttachFiles() {
        return attachFiles;
    }

    public void setAttachFiles(String attachFiles) {
        this.attachFiles = attachFiles;
    }

    public int getFileCnt() {
        return fileCnt;
    }

    public void setFileCnt(int fileCnt) {
        this.fileCnt = fileCnt;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public int getMultimediaCnt() {
        return multimediaCnt;
    }

    public void setMultimediaCnt(int multimediaCnt) {
        this.multimediaCnt = multimediaCnt;
    }
}
class ArticleCommand {
    private String bbsId;
    private String articleId;

    public ArticleCommand(String bbsId, String articleId) {
        this.bbsId = bbsId;
        this.articleId = articleId;
    }

    public String getBbsId() {
        return bbsId;
    }

    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}



class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

