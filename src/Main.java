
    public class Main {


        public static void main(String[] args) {
            //task 1//
            reply(1862);
            //task 2//
            phoneSystem(1, 2200);
            //task 3//
            int deliveryDays = deliveryTime(-555);
               if (deliveryDays != -1) {
                   System.out.println("Потребуется " + deliveryDays + " дней");
               }

        }

        //task 1//
        public static void reply(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + "— високосный год");
            } else {
                System.out.println(year + " — невисокосный год");
            }
        }

        //task 2//
        public static void phoneSystem(int clientOS, int clientDeviceYear) {
            if (clientOS == 0) {
                System.out.println(clientDeviceYear >= 2015 ? "Установите версию приложения для iOS по ссылке" : "Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println(clientDeviceYear >= 2015 ? "Установите версию приложения для Android по ссылке" : "Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Неподдерживаемая операционная система");
            }
        }

        //task 3//
        public static int deliveryTime(int deliveryDistance) {
            if (deliveryDistance < 0 || deliveryDistance > 100) { // Combined condition
                System.out.println(deliveryDistance < 0 ? "Неверная дистанция доставки" : "Доставки нет за пределы 100 км");
                return -1;
            } else if (deliveryDistance < 20) {
                return 1;
            } else if (deliveryDistance < 60) {
                return 2;
            } else { // deliveryDistance <= 100
                return 3;
            }


        }


    }