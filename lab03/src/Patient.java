public class Patient {
    private int id;
    public String name;
    private int birthYear;
    public  double height;
    public  double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient ( int id , String name , int birthYear , double height , double weight , String bloodGroup , String phoneNumber ){
        if( id <= 0 ){
            id *=-1;
        }
        if( birthYear <=0 ){
            birthYear *=-1;
        }
        if( height <=0 ){
            height *=-1;
        }
        if( weight <=0 ){
            weight *=-1;
        }
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }
    public int getAge(int currentYear){
        int age;
        if( currentYear-birthYear <0){
            birthYear -= 543;
        }
        age = currentYear-birthYear;
        return age;
    }
    public double getBMI(double weight , double height ){
        double BMI ;
        if(weight<0||height<0){
            BMI= 0.0;
        }else{
            BMI=weight/((height/100)*(height/100));
        }
        return BMI;
    }
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient bloodgroup: "+bloodGroup);
        System.out.println("Patient phonenumber: "+phoneNumber);
        System.out.println("Patient BMI: "+ getBMI(weight , height));
    }

    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A", "0897233952");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 2533, -160.0, -65.0, "AB", "0638200019");
        invalidPatient.displayDetails(currentYear);
    }
}
