package oop11;

public enum Operation {
    SUM {
        public double action(double x, double y) {
            return (x + y);
        }
    },
        MINUS{
            public double action(double x, double y){
                return (x-y);
            }},
    MULT{
        public double action(double x, double y){
            return (x*y);
        }},
    DIV{
        public double action(double x, double y){
            return (x/y);
        }};
    public abstract double action(double x, double y);



}
