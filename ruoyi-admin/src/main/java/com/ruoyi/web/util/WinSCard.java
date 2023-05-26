package com.ruoyi.web.util;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;
/**
 * @author : wuxiao
 * @date : 14:17 2023-05-26
 */

public interface WinSCard extends StdCallLibrary {
    WinSCard INSTANCE = (WinSCard) Native.loadLibrary("winscard", WinSCard.class, W32APIOptions.UNICODE_OPTIONS);

    int SCardEstablishContext(int dwScope, Pointer pvReserved1, Pointer pvReserved2, PointerByReference phContext);

    int SCardReleaseContext(Pointer hContext);

    // 其他定义的WinSCard函数

}



