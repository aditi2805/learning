package codes.selection;

 class Grades {
    char grade ;
    public char getGrade(double m ) {
        if (m >= 85 && m <= 100) {
            System.out.println("Grade : A ");
            grade = 'A';
        } else if (m >= 70 && m < 85) {
            System.out.println("Grade : B ");
            grade = 'B';
        } else if (m >= 60 && m < 70) {
            System.out.println("Grade : C ");
            grade = 'C';
        } else if (m >= 40 && m < 60) {
            System.out.println("Grade : D ");
            grade = 'D';
        } else if (m < 40) {
            System.out.println("Grade : E ");
            grade = 'E';
        }
        else {
            System.out.println("Wrong input , get lost!");
        }
        return grade;
    }
        public static void main (String[]args){
            Grades gg = new Grades();
            char g = gg.getGrade(100);
        }
    }
