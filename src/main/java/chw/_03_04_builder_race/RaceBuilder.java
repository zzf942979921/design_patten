package chw._03_04_builder_race;

public class RaceBuilder {
    private Race race;

    public RaceBuilder builder() {
        this.race = new Race();
        return this;
    }

    public RaceBuilder setName(String name) {
        this.race.setName(name);
        return this;
    }

    public RaceBuilder setSex(String sex){
        this.race.setSex(sex);
        return this;
    }

    public RaceBuilder setSkinColor(String skinColor){
        this.race.setSkinColor(skinColor);
        return this;
    }

    public Race create(){
        return this.race;
    }
}
