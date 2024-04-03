package Single_Multilevel_Inheritance;

//child class of Box class
public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(BoxWeight obj){
       super(obj);
       this.weight = obj.weight;
    }
    public BoxWeight(double l,double w, double h,double weight ){
        super(l,w,h);//what is this? call the present class constructor
        //used to initialise values present in parent class
        this.weight = weight;
    }
    public BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }
}
