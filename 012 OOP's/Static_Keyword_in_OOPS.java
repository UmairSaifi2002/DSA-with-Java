public class Static_Keyword_in_OOPS {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "LPS";
        System.out.println(s1.returnPercentage(80, 90, 90, 100));

        Student s2 = new Student();
        System.out.println(s2.schoolName); // output -> LPS
        System.out.println(s2.returnPercentage(95, 90, 100, 92));
    }
}

// Note :- 
// Static Keyword
// It is used to share the same varible or methods of a given class.
// 1, Properties
// 2, Functions
// 3, Block
// 4,Nested Classes

class Student {
    String name;
    int rollNo;
    
    static String   schoolName;

    // Setters
    void setName (String name) {
        this.name = name;
    }
    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter
    String getName() {
        return this.name;
    }
    int getRollNo() {
        return this.rollNo;
    }

    // our static function
    static int returnPercentage(int math, int phy, int chem, int eng){
        return ((math+phy+chem+eng) / 4);
    }
}
