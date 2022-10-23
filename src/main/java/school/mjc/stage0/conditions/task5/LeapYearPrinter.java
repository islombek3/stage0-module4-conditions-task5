package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year){
            case 1976:
            case 1980:
            case 1984:
            case 1988:
            case 1992:
            case 1996:
            case 2000:
            case 2004:
            case 2008:
            case 2012:
            case 2016:
            case 2020:
            case 2024:
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
        }
    }
}
