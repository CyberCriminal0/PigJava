package pig;
/**
 *
 * @author Jack Eller
 * git revision
 */
public class pigDice {
    int side;
    double roll;
    int side1;
    int side2;
    int side3;
    int side4;
    int side5;
    int side6;
    int side1streak;
    int side2streak;
    int side3streak;
    int side4streak;
    int side5streak;
    int side6streak;
    int side1best = 0;
    int side2best = 0;
    int side3best = 0;
    int side4best = 0;
    int side5best = 0;
    int side6best = 0;
    int score = 0;
public pigDice(){
    side=0;
}
/**compares the roll and assigns a face**/
public void face(){
        if(roll==0){
        side = 1;
        }else{
        if(roll==1){
        side = 2;
        }else{
        if(roll==2){
        side = 3;
        }else{
        if(roll==3){
        side = 4;    
        }else{
        if(roll==4){
        side = 5;
        }else{
        if(roll==5){
        side = 6;
        }
        }
        }
        }
        }
        
    
}
    }
/**rolls once to find the value of the rolls**/
    public void roll(int f){
        for(int i=0;f>i;i++){
        roll=(int)(Math.random()*6.0);
        face();
        if(side==1){
            System.out.println("1");
            side1++;
            side2=0;
            side3=0;
            side4=0;
            side5=0;
            side6=0;
        }else{
            if(side==2){
            System.out.println("2");
            side2++;
            side2streak++;
            side1streak=0;
            side3streak=0;
            side4streak=0;
            side5streak=0;
            side6streak=0;
        }else{
            if(side==3){
            System.out.println("3");
            side3++;
            side3streak++;
            side2streak=0;
            side1streak=0;
            side4streak=0;
            side5streak=0;
            side6streak=0;
        }else{
            if(side==4){
            System.out.println("4");
            side4++;
            side4streak++;
            side2streak=0;
            side1streak=0;
            side3streak=0;
            side5streak=0;
            side6streak=0;
        }else{
            if(side==5){
            System.out.println("5");
            side5++;
            side5streak++;
            side2streak=0;
            side1streak=0;
            side3streak=0;
            side4streak=0;
            side6streak=0;
        }else{
            System.out.println("6");
            side6++;
            side6streak++;
            side2streak=0;
            side1streak=0;
            side3streak=0;
            side4streak=0;  
            side5streak=0; 
            }
            }
            }
            }
        }
        }
    }
public int score(){
side2=side2*2;
side3=side3*3;
side4=side4*4;
side5=side5*5;
side6=side6*6;
score=side2+side3+side4+side5+side6;
side2=0;
side3=0;
side4=0;
side5=0;
side6=0;
return score;
}
    }
