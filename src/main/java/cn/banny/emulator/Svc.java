package cn.banny.emulator;

import cn.banny.emulator.memory.SvcMemory;
import cn.banny.emulator.pointer.UnicornPointer;
import unicorn.Unicorn;

public interface Svc {

    UnicornPointer onRegister(SvcMemory svcMemory, int svcNumber);

    int handle(Unicorn u, Emulator emulator);

}
