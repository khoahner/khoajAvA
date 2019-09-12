/*
Hằng số trong ngôn ngữ lập trình Java

Tạo Hằng số bằng keyword: final
 */
public class Bai5 {
   public static final double PI = 3.141592;//khai báo hằng số cấp độ Class: có thể dùng chung cho nhiều phương thức thuộc class đó.
   public static final float G = 9.789f;

    public static void main(String[] args) {
        //final double PI = 3.141592;// khai báo hằng số cấp độ phương thức thì chỉ áp dụng cho phương thức đó.
        //final float G = 9.789f;// số G
        System.out.println(PI);
        System.out.println(G);
    }

    public static void showPIvalues(){
        System.out.println(PI);
    }

    public static void showGvalues(){
        System.out.println(G);
    }
}
//khai báo hằng số ở cấp độ class thì fai có public static
//tên hằng số fai viết hoa