public class Park {
    private String name;
    private String address;
    private int phoneNumber;
    private Attraction attraction;
    public class Attraction{
        private String attrName;
        private String place;
        private String workHours;
        private int price;
        public Attraction (String attrName, String place ,String workHours, int price)
        {
            this.attrName = attrName;
            this.place = place;
            this.workHours = workHours;
            this.price = price;
        }
        public void printAttractionInfo() {
            System.out.println("Название: " + attrName + ", Место: " + place + ", Часы работы: " + workHours + ", Стоимость: " + price);
        }
    }
    public static void main(String[] args) {
        Park.Attraction attraction1 = new Park().new Attraction("Мёртвая петля", "Юго-западный угол", "10:00 - 16:30", 150);
        attraction1.printAttractionInfo();
    }
}
