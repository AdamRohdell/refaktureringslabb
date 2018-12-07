package Models;

import java.awt.*;

public class VehicleFactory {

    public Car createVolvo240(){
        return new Volvo240(100, Color.green, "Volvo240", 2);
    }

    
}
