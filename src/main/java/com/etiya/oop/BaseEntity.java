package com.etiya.oop;

import java.time.LocalDateTime;
import java.util.Optional;

public class BaseEntity { //BaseEntity cünkü tüm veri tabani nesnelerine extend edilcek--inheritance
    private LocalDateTime createdDate;
    private Optional<LocalDateTime> updatedDate;  //zorunlu degil optinal
    private Optional<LocalDateTime> deletedDate;  //zorunlu degil optinal

}
