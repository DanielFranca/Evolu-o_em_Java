package exercicios_OO.ex04;
public class circulo{
    private double circunferencia;
    
        public circulo(double circunferencia) {
        this.circunferencia = circunferencia;
        } 

        public double getCircunferencia() {
            return circunferencia;
        }


        public void setCircunferencia(double circunferencia) {
            this.circunferencia = circunferencia;
        }
        

        public Boolean validarCircunferencia(String cf){
            double cfDouble = Double.parseDouble(cf);
            if(cfDouble >  0){
                System.out.println("Valor válido!");
                return true;
            }else{
                System.out.println("Valor inválido!");
                return false;
            }
    
        }
        public  double calcularArea(){
            double diametro = this.circunferencia / 3.14;
            double raio = diametro / 2;
            double area = (raio * raio) * 3.14;

            return area;
        }


    
        
    }
