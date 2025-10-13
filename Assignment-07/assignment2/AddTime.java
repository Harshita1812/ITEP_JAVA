 class Time{
    private int hours;
    private int minutes;
    private int seconds;
     
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Time(){}  //Constructor;

    public Time add(Time t) {
      Time temp = new Time();
      temp.hours = this.hours + t.hours;
      temp.minutes = this.minutes + t.minutes;
      temp.seconds = this.seconds + t.seconds;

       if(temp.seconds >= 60){
        temp.minutes++;
        temp.minutes %=60;
       }
        if(temp.minutes >= 60){
        temp.hours++;
        temp.hours %= 60;
       }
       if(hours >=24){
          System.out.println("your time is out: time should be in 24hours");
       }
      
       return temp;
    }
    public void display(){
        System.out.println(hours +" hrs "+" " + minutes +" min "+ " "+ seconds +" seconds");
    }
 }

 class TestMain{
     public static void main(String args[]){
        Time t1 = new Time(1, 65, 80);
        Time t2 = new Time(2, 30, 10);
        t1.display();
        t2.display();
        Time result = t1.add(t2);
        result.display();
    }
 }
   
 