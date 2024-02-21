public class JPA107 {
    public static void main(String[] args) {
        int action = 1, skill = 2, teamgame = 3;

        System.out.println("The basketball grade is " + Basketball.calGrade(action,skill,teamgame));
        System.out.println("The baseball grade is " + Baseball.calGrade(skill,teamgame));
    }
}

class Basketball {
    public static int calGrade(int a,int s,int t) {
        return a + s + t;
    }
}

class Baseball {
    public static int calGrade(int s,int t) {
    return 10 + s +t;
    }
}