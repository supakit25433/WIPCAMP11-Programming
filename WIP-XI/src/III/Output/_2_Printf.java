/*
 * WIP XI Computer Programing 
 */

package III.Output;

/**
 *
 * @author sittiwatlcp
 */
public class _2_Printf {
    public static void main(String[] args) {
        String firstName = "Wippo";
        String lastName = "Ontour";
        String nickName = "Wip";
        double ownWallet = 200.746352;
        double friendWallet = 500.947855;
        
        System.out.printf("สวัสดี เราชื่อ %s %s (%s) เรามีเงิน %f บาท และเพิ่อนเรามีเงิน %.2f บาท \n"
                , firstName, lastName, nickName, ownWallet, friendWallet);
        
        int money = 100;
        System.out.printf("You have money in pouch : %d\n" , money);
        
        String State1 = "ผมหิวจังเลยครับ";
        System.out.printf("My Feeling at now is %s\n", State1);
    }
}
