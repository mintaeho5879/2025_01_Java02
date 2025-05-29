package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
        String fileName = "가나다라.haha.jpg";

        int ext1= fileName.lastIndexOf(".");
        String ext = fileName.substring(ext1+1);

        System.out.println(ext);



//        System.out.println(fileName.lastIndexOf("ext"));

    }
}
