/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungdd.mathutil.test;

import com.trungdd.mathutil.MathUtility;
import java.sql.SQLException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Trung Duong
 */
public class MathUtilityTest {
    
    @Test // bien ham nay thanh main(), shit f6 de chay
    // goi ham factorial() nhu thuong le, hay hon la tu dong sosanh gium 
    // expected va actual coi co khop nhau hom??? co thay mau xanh
    // k co khop nhau thay mau do. ta chi nhin mau ma k can mat cong
    // so sanh nua !!!
   public void testFactorialRighArgumentRunsWell(){
       long expected = 120; /// mun pk 5! =120;
       int n =5;
       long actual = MathUtility.getFactorial(n); // tinh thiet coi
       // va so sanh gium to lun
       assertEquals(expected, actual);
   
       // tui se test các tinh huông còn lại
        assertEquals(720, MathUtility.getFactorial(6));// 6! co pair 720?

        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        
      //0! la 1 tinh huong cần test
      //1! la tinh huống khác cần test
      // 6! là 1 tinh huống caanf test
      // tinh huông: test case, nghề tester là nghề nghĩ ra các test case, sau đó thử nghiệm
        
      //  assertEquals(0, MathUtility.getFactorial(0));
      // ki vong sai, tinh đúng -> 1 mau đỏ , ko khớp kiểu
      // ki vong đúng, tinh sai >1 màu đỏ
      // t hy vọng 5! = 120, m tính ra mấy , hàm tính ra mấy?
   }
   
   
   
   // ta test phần ngoại lệ - exception
   // exception là tinh huống bất thương xẫy ra trong app, trong code, khi
   // thực khi. nó k pải là 1 value để có thể so sánh
   // lỗi sql trùng key, sai khoá, ngoại null trên cột yêu cầu khác null
   // đều là lỗi liên quan sưql nhưng ko thể nói thằng nào bằng thằng nào
   // đối với exception, chỉ có thể do nó = câu hỏi: mày có xuất hiện k?
   // ko dùng assertEquals() so danh coi có bằng nhua hay ko
   // trong thiết kế của hàm getFactirial() thì nếu đauw vào n<0 hoặc n>20
   // thì hàm ném ra, sẽ neww một cái ngoại lệ
   // cứ đưa n vi phạm, nhận về ngoại lệ
   // vậy nếu có ngoại lệ xãy ra thi n đưa vào cà chớn <0 >21
   // có nghĩa rằng hàm chạy đúng, thấy ngoại lệ là ăn mừng, vì chạy như thiết kế
   // có ngoại lệ ra màu xanh thì đúng
   // sẽ có test case, tinh huống test: xem ngoại lệ có xh ko, có -> xanh 
   // k xh dự kiến => đỏ
   
   @Test(expected = IllegalArgumentException.class)
   public void testFactorialGivenWrongArgumentThrowsException(){
       MathUtility.getFactorial(-1);
       MathUtility.getFactorial(-10); // pai xh ngoai le
       MathUtility.getFactorial(21);
       MathUtility.getFactorial(40);
       // nếu xh exception như kì vọng, thì pải xanh
       // vi màu xanh here hàm ý rằng hàm chạy như thiết kế,
       // ném ngoại lệ khi đưa n cà chớn!!!
       // ta cần kỉ thuật để bắt ngoại kệ, đúng ngoại lệ cần bắt xâutj hiện
       // ta có màu xanh 
       
   }
    
    
    
}
// quy ước mau xanh: nếu tất cả các lời gọi hàm getFactorial()
// đểu trả ra giá trị đúng như kì vọng, nói cách khác tất cả các
// ham assertEquals() đều so sanh kớp ễpcted vs. actual
// thi có màu xanh
//xanh: khi tất cả các tinh huông test hàm đều, đều chạy đúng
// đỏ: chỉ cần 1 trong đám này sai, coi như đỏ cho tất cả
// li do phia sau: đã test hàm thi hàm phải đúng cho các tinhf
// huông test, đã test thi pải đúng các trương hợp đc đưa ra
// ko chs trò: hầu hết hàm đúng, lâu lâu mới sai....