package jp.co.crk.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "sales_by_store", schema = "public", catalog = "postgres")
public class SalesByStore {
    @Basic
    @Column(name = "store")
    private String store;
    @Basic
    @Column(name = "manager")
    private String manager;
    @Basic
    @Column(name = "total_sales")
    private BigInteger totalSales;
    @Id
    private Long id;

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
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
        SalesByStore that = (SalesByStore) o;
        return Objects.equals(store, that.store) && Objects.equals(manager, that.manager) && Objects.equals(totalSales, that.totalSales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, manager, totalSales);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
