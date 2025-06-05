package ch03.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10, 100);
        // (int)(Math.random() * 91) + 10;
        int randomScore2 = getRandomValue(1, 5);
        // (int)(Math.random() * 5) + 1;
        System.out.println("randomScore: " + randomScore);


        char grade = getGrade(randomScore);
        // 100점 초과시 혹은 0점 미만시 ' ' 리턴
        // 90점 이상 'A'리턴
        // 80점 이상 'B'리턴
        // 70점 이상 'C'리턴
        // 나머지 'D'리턴
        System.out.println("grade: " + grade);
    }

    public static int getRandomValue(int from, int to) {
//        double plus = to - from + 1;
//        return (int)(Math.random()*plus)+from;
        return (int) (Math.random() * (double) (to - from + 1)) + from;
    }

    public static char getGrade(int score) {

//        if(score > 100 || score < 0) {
//            return ' ';
//        } else if(score >= 90) {
//            return 'A';
//        } else if(score >= 80) {
//            return 'B';
//        } else if(score >= 70) {
//            return 'C';
//        } else {
//            return 'D';
//        }
        if (score > 100 || score < 0) {
            return ' ';
        }
        return switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'D';
            };
        }
    }
