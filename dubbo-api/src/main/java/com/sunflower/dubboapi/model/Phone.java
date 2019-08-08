package com.sunflower.dubboapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Entity
@Table(name="tb_phone")
public class Phone implements Serializable {
    // 主键id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long       id;
    // 手机名称
    @Column
    private String     name;
    // 价格
    @Column
    private BigDecimal price;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public BigDecimal getPrice () {
        return price;
    }

    public void setPrice (BigDecimal price) {
        this.price = price;
    }

}
