/*提出者　2212110087 吉岡蒼馬
 * 課題９−1
 *提出日 2022/6/15
 */

import java.util.Scanner;
public class LoopTest1 {//ループ処理をやる
    public static void main (String[] args){
        Scanner keyBoardScanner = new Scanner(System.in);
    String loop = "";
    do {
        System.out.print("繰り返しを止める場合はexitを入力:");
         loop = keyBoardScanner.next();
    } while(!loop.equals("exit"));//文字列の否定は先頭に！をつける
    System.out.print("プログラムを終了します。\n");
    keyBoardScanner.close();



        
}
}
