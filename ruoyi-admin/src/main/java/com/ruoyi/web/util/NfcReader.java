package com.ruoyi.web.util;
import com.sun.jna.ptr.PointerByReference;
/**
 * @author : wuxiao
 * @date : 14:19 2023-05-26
 */
public class NfcReader {
    private static final int SCARD_SCOPE_SYSTEM = 2;
    private static final int SCARD_S_SUCCESS = 0;

    public static void main(String[] args) {
        PointerByReference phContext = new PointerByReference();
        int result = WinSCard.INSTANCE.SCardEstablishContext(SCARD_SCOPE_SYSTEM, null, null, phContext);
        if (result != SCARD_S_SUCCESS) {
            System.err.println("Failed to establish context: " + result);
            return;
        }

        // 获取NFC读写器

        WinSCard.INSTANCE.SCardReleaseContext(phContext.getValue());
    }
}
