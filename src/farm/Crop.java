package farm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Crop class - parent of all crop type class
 * 
 * Name: Leong Hean Luen
 * Student ID: SUKD2301060
 * Course: Bachelor of Information Technology (BIT)
 * Subject: TCS3064 - OOP
 * Date: 22/08/2023
 * 
 * @param 
 * @author Hean Luen
 */
public abstract class Crop {

    protected String name;
    protected LocalDate plantingDate;
    protected LocalDate harvestDate;
    protected GrowthStage growthStage;
    protected double yield = 0;
    protected boolean isHarvested = false;
    protected ArrayList<LocalDateTime> wateringHistory;
    protected ArrayList<LocalDateTime> pestControlHistory;

    /**
     * Crop constructor
     */
    public Crop() {
        wateringHistory = new ArrayList<>();
        pestControlHistory = new ArrayList<>();
        setSeededStage();
    }
    
    /**
     * Crop constructor
     * 
     * @param name name of crop
     * @param plantingDate planting date
     */
    public Crop(String name, LocalDate plantingDate) {
        this();
        setName(name);
        setPlantingDate(plantingDate);           
    }
    
    /**
     * For subclass to implement
     * 
     * @return numbers of days to harvest
     */
    public abstract long getGrowthDaysToHarvest();
    
    /**
     * Set growth stage
     * 
     * @param stage use GrowthStage enum
     */
    public void setGrowthStage(GrowthStage stage)  {
        switch(stage) {
            case SEEDED -> setSeededStage();
            case MATURED -> setMaturedStage();
            case HARVESTED -> setHarvestedStage();
        }
    }
    
    /**
     * Return growth stage as readable string
     * @return growth stage as readable string
     */
    public String getGrowthStageAsString()  {
        return switch(growthStage) {
            case SEEDED -> "Seeded";
            case MATURED -> "Matured";
            case HARVESTED -> "Harvested";
        };
    }
    
    /**
     * Set growth stage as SEEDED
     */
    protected final void setSeededStage() {
        growthStage = GrowthStage.SEEDED;
    }
    
    /**
     * Set growth stage as MATURED
     */
    protected final void setMaturedStage() {
        growthStage = GrowthStage.MATURED;
    }
    
    /**
     * Set growth stage as HARVESTED
     */
    protected final void setHarvestedStage() {
        growthStage = GrowthStage.HARVESTED;
    }
    
    /**
     * Check growth stage is SEEDED
     * 
     * @return boolean if growth stage is SEEDED
     */
    public final boolean isSeededStage() {
        return growthStage.equals(GrowthStage.SEEDED);
    }
    
    /**
     * Check growth stage is MATURED
     * 
     * @return boolean if growth stage is MATURED
     */
    public final boolean isMaturedStage() {
        return growthStage.equals(GrowthStage.MATURED);
    }

    /**
     * Add current LocalDateTime to wateringHistory list
     */
    public void applyWatering() {
        wateringHistory.add(LocalDateTime.now());
    }
    
    /**
     * Add current LocalDateTime to pestControlHistory list
     */
    public void applyPestControl() {
        pestControlHistory.add(LocalDateTime.now());
    }

    /**
     * Check if suitable to harvest
     * 
     * @return boolean if crop is suitable to harvest
     */
    public boolean canHarvest() {
        return !isHarvested && (LocalDate.now().isAfter(harvestDate) || LocalDate.now().isEqual(harvestDate));
    }
    
    /**
     * Business logic for harvest action
     */
    public void harvest() {
        setHarvestedStage();
        isHarvested = true;
    }
    
    /**
     * Getter for name
     * 
     * @return String name
     */
    public final String getName() {
        return name;
    }

    /**
     * Setter for name
     * 
     * @param value String
     */
    public final void setName(String value) {
        name = value;
    }
    
    /**
     * Getter for planting date
     * 
     * @return LocalDate
     */
    public final LocalDate getPlantingDate() {
        return plantingDate;
    }
    
    /**
     * Setter for planting date
     * 
     * @param date LocalDate
     */
    public final void setPlantingDate(LocalDate date) {
        plantingDate = date;
        harvestDate = plantingDate.plusDays(getGrowthDaysToHarvest());
    }

    /**
     * Getter for harvest date
     * 
     * @return LocalDate
     */
    public final LocalDate getHarvestDate() {
        return harvestDate;
    }
    
    /**
     * Getter for growth stage
     * 
     * @return GrowthStage enum
     */
    public final GrowthStage getGrowthStage() {
        return this.growthStage;
    }
    
    /**
     * Getter for yield
     * 
     * @return double yield value in KG
     */
    public final double getYield() {
        return yield;
    }
    
    /**
     * Setter for yield 
     * 
     * @param value double yield value in KG
     */
    public final void setYield(double value) {
        yield = value < 0 ? 0 : value;
    }
    
    /**
     * Getter for isHarvested
     * 
     * @return boolean crop is harvested
     */
    public final boolean getIsHarvested() {
        return isHarvested;
    }
    
    /**
     * Getter for watering history
     * 
     * @return ArrayList<LocalDateTime> watering history
     */
    public final ArrayList<LocalDateTime> getWateringHistory() {
        return wateringHistory;
    }
    
    /**
     * Getter for pest control history
     * 
     * @return ArrayList<LocalDateTime> pest control history
     */
    public final ArrayList<LocalDateTime> getPestControlHistory() {
        return pestControlHistory;
    }
    
}
