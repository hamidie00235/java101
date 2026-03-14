package sinif.boks;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    public void run(){
        if(isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("new round!");
                this.f2.health=this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }

                this.f1.health=this.f2.hit(this.f1);
           if(isWin()){
               break;
           }
                System.out.println(this.f1.name + " saglik :" + this.f1.health);
                System.out.println(this.f2.name + " saglik :" + this.f2.health);

            }}

                else{
                System.out.println("Sporcularin sikletleri uymuyour!");

        }

    }
    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWin(){
        if(this.f1.health==0){
            System.out.println( this.f2.name + " kazandi !");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(this.f1.name + " kazandi!");
            return true;
        }
        return false;
    }

}
