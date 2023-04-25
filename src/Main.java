import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        checkIsLeapYear(2020);
        checkIsLeapYear(2023);
        defineAppVersion(0,2023);
        defineAppVersion(1,2020);
        snowCardDeliveryDays(10);
        snowCardDeliveryDays(1000);
    }


    private static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }
    private static  void defineAppVersion(int mobileOS, int mobileYear){
        String mobileOsName;
        int currentYear = LocalDate.now().getYear();

        switch (mobileOS) {
            case 0:
                mobileOsName = "IOS";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "неизвестная ОС";
        }
        if (mobileOS != currentYear){
            System.out.println("Для ОС" + mobileOsName + " установить lite-версию");
        }else {
            System.out.println("Для ОС" + mobileOsName + " установить обычную версию");
        }
    }
    private static void snowCardDeliveryDays (int distance) {
        int deliveryDays = calcCardDeliveryDays(distance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    private static int calcCardDeliveryDays(int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }
}
