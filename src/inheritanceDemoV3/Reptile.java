//version 1
package inheritanceDemoV3;

public class Reptile extends Animal {

    private boolean hasScales;
    private boolean laysEggs;

    public Reptile(){
    }

    public Reptile(boolean hasScales, boolean laysEggs){
        this.hasScales = hasScales;
        this.laysEggs = laysEggs;
        //this();
    }

    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasScales, boolean laysEggs){
        this.hasScales = hasScales;
        this.laysEggs = laysEggs;

    }

    public Reptile(Animal animal){
    }


    @Override
    public void makeNoise(){
        System.out.println(" Hiss~~~");
    }

    @Override
    public void eat(){
        System.out.println(" Yummmy ");
    }


}
