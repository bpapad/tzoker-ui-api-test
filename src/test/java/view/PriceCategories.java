package view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriceCategories {

    private Long id;

    private Double divident;

    private Long winners;

    private Double distributed;

    private Double jackpot;

    private Double fixed;

    private Long categoryType;

    private String gameType;

}
