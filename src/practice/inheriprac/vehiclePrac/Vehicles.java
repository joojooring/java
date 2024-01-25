package practice.inheriprac.vehiclePrac;

public class Vehicles {
       private String brand;
       private String model;
       private int year;

       public String getBrand() {
           return brand;
       }

       public void setBrand(String brand) {
           this.brand = brand;
       }

       public String getModel() {
           return model;
       }

       public void setModel(String model) {
           this.model = model;
       }

       public int getYear() {
           return year;
       }

       public void setYear(int year) {
           this.year = year;
       }

   //    2. 생성자!!!
       public Vehicles(String brand,String model,int year){
           this.brand = brand;
           this.model=model;
           this.year=year;
       }

   //    3.메소드 생성

       public void start(){
           System.out.println("차량 시동을 걸었습니다.");
       }
       public  void stop(){
           System.out.println("차량을 정지했습니다.");
       }

   //    4.객체 정보를 반환하는 Override
       @Override
       public String toString(){
           return (
                   "Vehicle{"+
                   "brand="+brand+
                   ", model="+model+
                   ", year="+year+"}"
                   );
       }
   }

