public class Student {
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int m1, int m2, int m3, int m4, int m5) {
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
        this.marks[3] = m4;
        this.marks[4] = m5;
    }

    public static int totalStudent() {
        return uniqueNumber;
    }

    public int totalMarks() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum;
    }

    public int getLowestMarks() {
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;
    }

    public int getHighestMarks() {
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }

    public int getAverageMarks() {
        return totalMarks() / marks.length;
    }

    public int getPassCount() {
        int count = 0;
        int PASSING_MARKS = 50;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > PASSING_MARKS) {
                count++;
            }
        }
        return count;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    static int uniqueNumber;
    int rollNumber;
    String name;
    int[] marks = new int[5];

    public Student() {
        uniqueNumber++;
        this.rollNumber = uniqueNumber;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("S1 ROLL NUMBER:" + " " + s1.rollNumber);
        s1.setName("Nisarg");
        s1.setMarks(61, 72, 54, 78, 75);
        System.out.println("S1 NAME:" + " " + s1.getName());
        System.out.println("S1 HIGHEST MARKS:" + " " + s1.getHighestMarks());
        System.out.println("S1 LOWEST MARKS:" + " " + s1.getLowestMarks());
        System.out.println("S1 AVERAGE MARKS:" + " " + s1.getAverageMarks());
        System.out.println("S1 PASS COUNT:" + " " + s1.getPassCount());

        Student s2 = new Student();
        System.out.println(s2.rollNumber);
        s2.setName("Romil");
        s2.setMarks(66, 67, 39, 88, 96);
        System.out.println(s2.getName());
        System.out.println(s2.getHighestMarks());
        System.out.println(s2.getLowestMarks());
        System.out.println(s2.getAverageMarks());
        System.out.println(s2.getPassCount());


        Student s3 = new Student();
        System.out.println(s3.rollNumber);
        s3.setName("Yash");
        s3.setMarks(54, 23, 76, 45, 90);
        System.out.println(s3.getName());
        System.out.println(s3.getHighestMarks());
        System.out.println(s3.getLowestMarks());
        System.out.println(s3.getAverageMarks());
        System.out.println(s3.getPassCount());


        System.out.println(Student.totalStudent());


    }
}
