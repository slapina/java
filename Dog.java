import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Dog {
    private String name;
    private String size;
    private int age;

    String[] names = {"Ja", "Spar", "Coo", "Kie", "Da", "Co", "Di", "La"};
    String[] sizes = {"big", "small", "medium"};

    Random random = new Random();


    public Dog(String name, String size, int age) {
        this.name = name;
        if (StringUtils.isEmpty(this.name)) {
            this.name = (names[new Random().nextInt(names.length)] + names[new Random().nextInt(names.length)]);
        }
        this.size = size;
        if(StringUtils.isEmpty(this.size)){
            this.size = (sizes[new Random().nextInt(sizes.length)]);
        }
        this.age = age;
        if(this.age == 0){
            this.age =(int) (1 + Math.random()*20);
        }
    }
    public String toString(){
        String dogFeatures;
        dogFeatures = name + " " + size +" " + age;
        return dogFeatures;
    }

}