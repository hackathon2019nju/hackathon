package com.dypro.hackathon.market.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *@Entity
 * Description:information for market
 * include name,location,foodInfo,creditLevel
 * */

@Document(collection ="marketInfo" )
public class MarketInfo {
    @Field
    private String marketName;
    @Field
    private String location;
    @Field
    private FoodInfo foodInfo;
    @Field
    private int creditLevel;


    /**
     * @Constructor
     */

    public MarketInfo(String marketName, String location, FoodInfo foodInfo, int creditLevel) {
        this.marketName = marketName;
        this.location = location;
        this.foodInfo = foodInfo;
        this.creditLevel = creditLevel;
    }

    public MarketInfo() {
    }

    /**
     * @Getter
     * @Setter
     */

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FoodInfo getFoodInfo() {
        return foodInfo;
    }

    public void setFoodInfo(FoodInfo foodInfo) {
        this.foodInfo = foodInfo;
    }

    public int getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(int creditLevel) {
        this.creditLevel = creditLevel;
    }


    /**
     * @toString
     */

    @Override
    public String toString() {
        return "MarketInfo{" +
                "marketName='" + marketName + '\'' +
                ", location='" + location + '\'' +
                ", foodInfo=" + foodInfo +
                ", creditLevel=" + creditLevel +
                '}';
    }
}
