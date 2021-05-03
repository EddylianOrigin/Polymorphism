package com.company;

class Auto {

    static class Car{
        private boolean engine=true;
        private int cylinders;
        private String name;
        private int wheels=4;

        Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
        }

        Car(Car car) {
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }
        public String startEngine(){

            return "Car" +" -> "+"startEngine()";
        }
        public String accelerate(){
            return "Car" +" -> "+"accelerate()";
        }
        public String brake(){
            return "Car" + " -> "+"brake()";
        }
    }
    static class Mitsubishi extends Car{
        Mitsubishi(int i, String base_car) {
            super(new Car(i,base_car));
        }

        @Override
        public String startEngine() {
            return "Mitsubishi" +" -> "+"startEngine()";
        }

        @Override
        public String accelerate() {
            return "Mitsubishi"+" -> "+"accelerate()";
        }

        @Override
        public String brake() {
            return "Mitsubishi"+" -> "+"brake()";
        }
    }
    class Holden extends Car{
        Holden(int i, String base_car) {
            super(new Car(i,base_car));
        }

        @Override
        public String startEngine() {
            return "Holden" +" -> "+"startEngine()";
        }

        @Override
        public String accelerate() {
            return "Holden"+" -> "+"accelerate()";
        }

        @Override
        public String brake() {
            return "Holden"+" -> "+"brake()";
        }
    }
    class Ford extends Car{
        Ford(int i, String base_car) {
            super(new Car(i,base_car));
        }

        @Override
        public String startEngine() {
            return "Ford" +" -> "+"startEngine()";
        }

        @Override
        public String accelerate() {
            return "Ford"+" -> "+"accelerate()";
        }

        @Override
        public String brake() {
            return "Ford"+" -> "+"brake()";
        }

    }
    public static void main(String[] args) {
        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        Car Mitsubishi = new Mitsubishi(8,"Base car");
        System.out.println(Mitsubishi.startEngine());
	// write your code here
    }
}
