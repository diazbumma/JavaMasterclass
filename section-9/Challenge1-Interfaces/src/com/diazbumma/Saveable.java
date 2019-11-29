package com.diazbumma;

import java.util.List;

public interface Saveable {

    void write(List<String> data);

    List<String> read();
}
