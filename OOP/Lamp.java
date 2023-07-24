package OOP;

public class Lamp {
    private String color;
    private Boolean lightOn; 
    private int size; //pounds
    private int cost; //dollars
    
    public Lamp(String color, Boolean lightOn, int size){
        this.color = color;
        this.lightOn = lightOn;
        this.size = size;
        System.out.println("Lamp has been intialized");
    }

    public Boolean changeLight(Boolean newLightOn){
        newLightOn = lightOn;
       if(newLightOn = true){
         return newLightOn = false; 
       } else {
        return newLightOn = true;
       }
      
    }

    /**
     * @param newSize
     * @param newCost
     * @return 
     */
    public void size(int newSize, int newCost){

        if (newSize < 20){                          
            newCost = newSize * 2;
        } else {
            newCost = newSize * 5;
        }
        newSize = size;
        newCost = cost;
    }
    
    // getter
    public String getColor(){
        return color;
    }
    // setter
    public void setColor(String chosenColor){
        color = chosenColor;
    }

}


