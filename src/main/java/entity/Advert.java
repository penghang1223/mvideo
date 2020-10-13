package entity;

public class Advert {
    private Integer id;
    private String name;//名称
    private String url;//友情链接
    private String coverPic;//广告封面

    public Advert() {
    }

    public Advert(String name, String url, String coverPic) {
        this.name = name;
        this.url = url;
        this.coverPic = coverPic;
    }

    public Advert(Integer id, String name, String url, String coverPic) {
        this(name, url, coverPic);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", coverPic='" + coverPic + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }
}
