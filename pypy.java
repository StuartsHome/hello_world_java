public class Main {            // create a Main class
    int Mainyear;              // create a class attribute
    String Mainname;

    public Main(int year, String name) {     // create a class constructor for the Main class
        Mainyear = year;                     // set the initial value for the class attribute x
        Mainname = name;
    }

    public static void main(String[] args) {
        Main myObj = new Main(2021, "Stuart");        // create an object of class Main (this will call the constructor)
        System.out.println(myObj.Mainname);           // print the value x
    }

} 



