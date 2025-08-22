package hello.itemservice.domain.item;

import lombok.Data;

/**
 * 핵심 도메인에서 사용하기엔 위험
 * @Getter, @Setter 사용하도록 하자
 */
@Data
public class Item {

    private Long Id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
