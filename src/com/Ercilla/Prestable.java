package com.Ercilla;

import java.time.LocalDate;

public interface Prestable {
    void prestar (LocalDate fechaPrestamos);
    void devolver (LocalDate fechDevolucion);

}
