package jp.co.crk.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "film_list", schema = "public", catalog = "postgres")
public class FilmList {
    @Basic
    @Column(name = "fid")
    private Integer fid;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "category")
    private String category;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "length")
    private Short length;
    @Basic
    @Column(name = "rating")
    private String rating;
    @Basic
    @Column(name = "actors")
    private String actors;
    @Id
    private Long id;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmList filmList = (FilmList) o;
        return Objects.equals(fid, filmList.fid) && Objects.equals(title, filmList.title) && Objects.equals(description, filmList.description) && Objects.equals(category, filmList.category) && Objects.equals(price, filmList.price) && Objects.equals(length, filmList.length) && Objects.equals(rating, filmList.rating) && Objects.equals(actors, filmList.actors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fid, title, description, category, price, length, rating, actors);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
