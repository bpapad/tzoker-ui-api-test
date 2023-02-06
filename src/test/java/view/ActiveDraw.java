package view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActiveDraw {

    private Integer gameId;

    private Integer drawId;

    private Long drawTime;

    private String status;

    private Integer drawBreak;

    private Integer visualDraw;

    private PricePoints pricePoints;




}
