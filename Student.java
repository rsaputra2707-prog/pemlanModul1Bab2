public class Student {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    private static int jumlahObjek = 0;

    public Student(){
        name = "";
        address = "";
        age = 0;

        jumlahObjek++;
    }

    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;

        jumlahObjek++;
    }

    public Student(String n, String a, int ag, double math, double english, double science){
        name = n;
        address = a;
        age = ag;

        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;

        jumlahObjek++;
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMathGrade(double math){
        mathGrade = math;
    }

    public void setEnglishGrade(double english){
        englishGrade = english;
    }

    public void setScienceGrade(double science){
        scienceGrade = science;
    }

    private double getAverage(){
        return (mathGrade + englishGrade + scienceGrade) / 3;
    }

    public boolean statusAkhir(){

        if(getAverage() >= 61){
            return true;
        }
        else{
            return false;
        }
    }

    public void displayMessage(){

        System.out.println("Siswa dengan nama: " + name);
        System.out.println("Beralamat: " + address);
        System.out.println("Berumur: " + age);
        System.out.println("Nilai rata-rata: " + getAverage());

        if(statusAkhir()){
            System.out.println("Status: LULUS");
        }
        else{
            System.out.println("Status: REMIDI");
        }
    }

    public static void jumlahObjek(){
        System.out.println("Jumlah objek Student yang dibuat: " + jumlahObjek);

    }

}