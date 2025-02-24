//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Watch w = new Watch();

        w.setTime(11,23,34);

        System.out.println(w.radHour() + ":" + w.radMinute()  + ":" + w.readSecund());
    }
}