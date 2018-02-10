package chw._03_03_3dimensional_model;

import java.util.List;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}
