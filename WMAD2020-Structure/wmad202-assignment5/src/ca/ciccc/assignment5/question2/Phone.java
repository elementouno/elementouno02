package ca.ciccc.assignment5.question2;

public class Phone {
    public class Alarm {
        private Integer time;
        Alarm(Integer time) {
            this.time = time;
        }
        public void setTime(Integer Time) {
            System.out.println("Changed");
            this.time = Time;
        }
    }

    public void CreateAlarmTime() {
        Alarm a = new Alarm(3);
        a.setTime(4);
    }
}
