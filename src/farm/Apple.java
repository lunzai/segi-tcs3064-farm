package farm;

import java.time.LocalDate;

/**
 * Subclass of Crop
 * 
 * Name: Leong Hean Luen
 * Student ID: SUKD2301060
 * Course: Bachelor of Information Technology (BIT)
 * Subject: TCS3064 - OOP
 * Date: 22/08/2023
 * 
 * @author Hean Luen
 */
public class Apple extends Crop {
    
    /**
     * Apple constructor
     */
    public Apple() {
        super();
    }
    
    /**
     * Apple constructor
     * 
     * @param name Name of apple
     * @param plantingDate Planting date
     */
    public Apple(String name, LocalDate plantingDate) {
        super(name, plantingDate);
    }
    
    @Override
    public long getGrowthDaysToHarvest() {
        return 15;
    }
}
