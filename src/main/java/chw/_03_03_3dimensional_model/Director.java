package chw._03_03_3dimensional_model;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private List<CarDoType> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add(CarDoType.start);
        this.sequence.add(CarDoType.stop);
        this.benzBuilder.setSequence(this.sequence);
        return ((BenzModel) this.benzBuilder.getCarModel());
    }

    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add(CarDoType.engine_boom);
        this.sequence.add(CarDoType.start);
        this.sequence.add(CarDoType.stop);
        this.benzBuilder.setSequence(this.sequence);
        return ((BenzModel) this.benzBuilder.getCarModel());
    }

    public BenzModel getCBenzModel(){
        this.sequence.clear();
        this.sequence.add(CarDoType.alarm);
        this.sequence.add(CarDoType.start);
        this.sequence.add(CarDoType.stop);
        this.benzBuilder.setSequence(this.sequence);
        return ((BenzModel) this.benzBuilder.getCarModel());
    }

    public BenzModel getDBenzModel(){
        this.sequence.clear();
        this.sequence.add(CarDoType.start);
        this.benzBuilder.setSequence(this.sequence);
        return ((BenzModel) this.benzBuilder.getCarModel());
    }

}
