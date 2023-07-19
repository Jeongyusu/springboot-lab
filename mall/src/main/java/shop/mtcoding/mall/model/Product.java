package shop.mtcoding.mall.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Entity 걸려있으면 리플렉션 수행 후 클래스명으로 테이블을 만들고, 변수로 컬럼을 만들어냄
@Entity
@Getter
@Setter
@Table(name = "product_tb")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;

}
