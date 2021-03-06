package chw._03_03_3dimensional_model;

import java.util.List;

public abstract class CarBuilder {
    public abstract void setSequence(List<CarDoType> sequence);

    public abstract CarModel getCarModel();
}
