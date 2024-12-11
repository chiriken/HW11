
    public class Main {


        public static void main(String[] args) {
            //task 1//
            reply(1862);
            //task 2//
            phoneSystem(1, 2200);
            //task 3//
            deliveryTime(50);
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
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            } else if (clientOS == 1) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android  по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            } else {
                System.out.println("Неподдерживаемая операционная система");
            }
        }

        //task 3//
        public static void deliveryTime(int deliveryDistance) {
            if (deliveryDistance < 0) {
                System.out.println("Неверная дистанция доставки");
            } else if (deliveryDistance < 20) {
                System.out.println("Потребуется 1 день");
            } else if (deliveryDistance < 60) {
                System.out.println("Потребуется 2 дня");
            } else if (deliveryDistance <= 100) {
                System.out.println("Потребуется 3 дня");
            } else {
                System.out.println("Доставки нет за пределы 100 км(((");
            }


        }


    }