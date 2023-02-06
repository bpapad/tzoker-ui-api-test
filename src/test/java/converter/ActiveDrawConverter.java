package converter;

import io.restassured.path.json.JsonPath;
import view.*;

public class ActiveDrawConverter {

    public static ActiveDraw convert(String response){
        ActiveDraw activeDraw = new ActiveDraw();
//todo:The backbone of a complete ActiveDraw object is complete but not implemented since it is not required for the requested tests
//        AddOn addOn = new AddOn();
//        PriceCategories priceCategories = new PriceCategories();
//        PricePoints pricePoints = new PricePoints();
//        WagerStatistics wagerStatistics = new WagerStatistics();

        activeDraw.setGameId(JsonPath.from(response).get("drawId"));
        activeDraw.setDrawId(JsonPath.from(response).get("drawId"));
        activeDraw.setDrawTime(JsonPath.from(response).get("drawTime"));
        activeDraw.setStatus(JsonPath.from(response).get("status"));
        activeDraw.setDrawBreak(JsonPath.from(response).get("drawBreak"));
        activeDraw.setVisualDraw(JsonPath.from(response).get("visualDraw"));

        return activeDraw;
    }
}
