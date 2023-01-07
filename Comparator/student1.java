import java.util.*;

public class Student1 {
    private String name;
    private String familyName;
    private int age;
    private int rollNum;

    public Student1(String name, String familyName, int age, int rollNum) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){

        return "Name: " + " " + name +" FamilyName: " + " " + familyName +" Age: " + " " + age
        + " RollNum: " + " " + rollNum;
    }

    class ComparatorStudentSort implements Comparator<Student1>{
        @Override
        public int compare(Student1 s1, Student1 s2) {
            int nameCompare = s1.getName().compareTo(s2.getName());
            int familyNameCompare = s1.familyName.compareTo(s2.familyName);
            return (nameCompare == 0) ? familyNameCompare
                    : nameCompare;
        }
    }

    public void main(String[] args) {
        List<Student1> ar = new ArrayList<>();

        Student1 obj1 = new Student1("Marina", "Dimovska", 11, 20);
        Student1 obj2 = new Student1("Alex", "Iordanov", 12, 1);
        Student1 obj3 = new Student1("Didka", "Kirilova", 11, 8);

        ar.add(obj1);
        ar.add(obj2);
        ar.add(obj3);

        Iterator<Student1> itr = ar.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Collections.sort(ar,new ComparatorStudentSort());
        System.out.println("\n\nAfter Sorting:\n");

        
        for (Student1 customer : ar) {
            System.out.println(customer);
        }
    }
}
