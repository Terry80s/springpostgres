package jp.co.crk.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "sales_by_film_category", schema = "public", catalog = "postgres")
public class SalesByFilmCategory {
    @Basic
    @Column(name = "category")
    private String category;
    @Basic
    @Column(name = "total_sales")
    private BigInteger totalSales;
    @Id
    private Long id;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigInteger getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigInteger totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesByFilmCategory that = (SalesByFilmCategory) o;
        return Objects.equals(category, that.category) && Objects.equals(totalSales, that.totalSales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, totalSales);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
