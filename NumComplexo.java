public class NumComplexo{

    private double real ;
    private double imaginario ;

    public NumComplexo(double real , double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginario(){
        return this.imaginario;
    }

    @Override
    public String toString(){
        if(imaginario == 0){
            return String.valueOf(real);
        }
        if(real == 0){
            return imaginario + "i";
        }
        if(imaginario > 0){
            return real + " + " + imaginario + "i";
        }else{
            return real + " - " + Math.abs(imaginario) + "i";
        }
    }
}

    

