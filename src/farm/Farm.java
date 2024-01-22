package farm;

import java.util.ArrayList;

/**
 * Farm class - a collection of 1 or more crops
 * - Can perform add crop, remove crop, retrieve 1 or all crops
 * - Can perform watering, pest control, update growth stage
 * 
 * Name: Leong Hean Luen
 * Student ID: SUKD2301060
 * Course: Bachelor of Information Technology (BIT)
 * Subject: TCS3064 - OOP
 * Date: 22/08/2023
 * 
 * @author Hean Luen
 */
public class Farm {
    private ArrayList<Crop> crops;

    /**
     * Farm constructor
     */
    public Farm() {
        crops = new ArrayList<>();
    }

    /**
     * Add crop to crop list
     * 
     * @param crop crop to add
     */
    public void addCrop(Crop crop) {
        crops.add(crop);
    }
    
    /**
     * Remove crop by index
     * 
     * @param index int index of crop
     */
    public void removeCrop(int index) {
        crops.remove(index);
    }

    /**
     * Update crop growth stage by index
     * 
     * @param index int index of crop
     * @param stage GrowthStage new growth stage
     */
    public void updateGrowthStage(int index, GrowthStage stage) {
        getCrop(index).setGrowthStage(stage);
    }
    
    /**
     * Apply watering to crop by index
     * 
     * @param index int index of crop
     */
    public void applyWaterCrop(int index) {
        getCrop(index).applyWatering();
    }
    
    /**
     * Apply pest control by index
     * 
     * @param index int index of crop
     */
    public void applyPestControl(int index) {
        getCrop(index).applyPestControl();
    }

    /**
     * Retrieve crop by index
     * 
     * @param index int index of crop
     * @return 
     */
    public Crop getCrop(int index) {
        return crops.get(index);
    }
    
    /**
     * Retrieve all crops
     * 
     * @return ArrayList<Crop> array list of Crop
     */
    public ArrayList<Crop> getCrops() {
        return crops;
    }

}
