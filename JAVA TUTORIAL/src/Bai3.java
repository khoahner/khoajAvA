/*
Kiểu dữ liệu trong ngôn ngữ lập trình Java
  8 kiều nguyên thủy:
- 4 kiểu nguyên: int, short, long, byte
- 2 kiểu thực: float, double
- 1 kiểu char
- 1 kiểu boolean
- kiều do người dùng tự định nghĩa.

cách tính: kích thước là n byte -> 4 byte -> (2^(4x8) - 1) = khả năng lưu trữ của kiểu Integer.

kiểu Char đại diện cho kí tự ở UTF 16 dùng để lưu trữ các kí tự chữ và số bao gồm các kí tự đặc biệt, kí tự có mã unicode tra bằng bảng mã ASCII code

kiểu Boolean chỉ có 2 giá trị True hoặc False liên quan đến phép logic, sosanh, ....
 */
public class Bai3 {
    public static void main(String[] args) {
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Byte.TYPE, Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Short.TYPE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Integer.TYPE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Long.TYPE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Float.TYPE, Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Double.TYPE, Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n",
                Character.TYPE, Character.BYTES, Character.MIN_VALUE, Character.MAX_VALUE);
        boolean IsNumber;// true/false
    }
}
