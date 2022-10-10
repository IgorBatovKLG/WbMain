package ru.batov.wbmain.models.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int productId;
    private int iteration;
    private String name;
    private int subjectId;
    private int subjectIdM3;
    private int subjectIdM5;
    private int brandId;
    private int pics;
    @OneToMany(targetEntity = PriceProductEntity.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "FK_Product"))
    private List<PriceProductEntity> price;
    @OneToOne
    @JoinColumn(name = "discount_id", foreignKey = @ForeignKey(name = "FK_Discount"))
    private DiscountEntity discount;


}
