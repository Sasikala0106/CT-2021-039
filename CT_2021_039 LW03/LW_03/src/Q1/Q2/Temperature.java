package Q1.Q2;

public class Temperature {
    private double celsius;
    public Temperature(){
        this.celsius=0;
    }
    public Temperature(double celsius){
        this.celsius=celsius;
    }
    public double toCelsius(){
        return celsius;
    }
    public void setCelsius (double celsius){
        this.celsius=celsius;
    }
    public double toFahrenhiet(){
        return(celsius * ((double) 9/5) + 32);
    }
    public void setFahrenhiet (double fahrenhiet){
        this.celsius=(fahrenhiet-32) * ((double)5/9);
    }
}

