package com.venky.oracle.pkg44;

import java.util.ArrayList;
import java.util.List;

public class Main < T extends Worker > extends Thread {
    private List<T> processes = new ArrayList<>();

    public void addProcess(T w) {
        processes.add(w);
    }

    public void run() {
        processes.forEach((p) -> p.doProcess());

    }
}
//Answer: A) Replace Line 3 with public void addProcess(TW) {