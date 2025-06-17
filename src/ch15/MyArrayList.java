package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return this.arr.length;
    };
    public void add(String item) {
        String[] temp = new String[size() + 1];
        temp[size()] = item;
        //기존값 복사
        for(int i = 0; i < size(); i++) {
            temp[i] = arr[i];
        }
        //주소값 복사
        this.arr = temp;
    };
    public String get(int idx) {
        return arr[idx];
    };
    public void add(int num, String str) {
        String[] temp = new String[size() + 1];
        for (int i = 0; i < size(); i++) {
//            if(i<num){
//                temp[i] = arr[i];
//            } else {
//                temp[i+1] = arr[i];
//            }
        temp[ i < num ? i : i+1] = arr[i];
        }
        arr = temp;
        arr[num] = str;
    }
    public String remove() {
        String[] temp = new String[size() - 1];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        String str2 = arr[temp.length];
        arr = temp;
        return str2;
    };
    //점검용
    public void checkValues() {
        System.out.println(Arrays.toString(this.arr));
    };
    public String remove(int idx) {
        String[] temp = new String[size() - 1];
        for(int i = 0; i < temp.length; i++) {
            if(i < idx) {
                temp[i] = arr[i];
            } else {
                temp[i] = arr[i+1];
            }
        }
        String str3 = arr[idx];
        arr = temp;
        return str3;
    }


}
