// File ini adalah file yang pertama kali dibuat
import com.example.pt13prak2072028tdd.WordMatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordMatchTest {
    // 1) Hasilnya pasti gagal karena class yang dibutuhkan belum tersedia (Class WordMatch)
//    @Test
//    void isMatch() {
//        assertEquals("Apple", WordMatch.word1());
//    }

    // 3) Karena kita sekarang sudah tahu apa yang di expect oleh program maka tebak kata dengan benar
    @Test
    void isMatch() {
        assertEquals("Pineapple", WordMatch.word1());
    }

    // Dan sekarang hasilnya menunjukkan test passed
}
