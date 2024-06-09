package com.yasar.marathon_3.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ErrorType {
    BAD_REQUEST_ERROR(1001, "Girilen bilgiler eksik ya da hatalıdır.", HttpStatus.BAD_REQUEST),
    PRODUCT_INVALID_PARAMETER_ERROR(1004, "Ürün ID'si ya da ürün bilgileri girilmesi zorunludur.", HttpStatus.BAD_REQUEST),
    IMAGE_INVALID_PARAMETER_ERROR(1006, "Resim bilgileri girilmesi zorunludur.", HttpStatus.BAD_REQUEST),
    PRODUCT_FEATURES_INVALID_PARAMETER_ERROR(1007, "Ürün ID'si ya da ürün bilgileri girilmesi zorunludur.", HttpStatus.BAD_REQUEST),
    MAIN_IMAGE_ALREADY_EXIST(1005, "Ana fotoğraf zaten seçilmiş durumdadır.", HttpStatus.BAD_REQUEST),
    INTERNAL_SERVER_ERROR_NOT_FOUND_DATA(1002, "Sunucu Hatası : Liste getirilemedi. Lütfen tekrar deneyin.", HttpStatus.INTERNAL_SERVER_ERROR),
    INTERNAL_SERVER_ERROR(9998, "Sunucuda beklenmeyen bir hata oluştu. Lütfen tekrar deneyiniz.", HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST_CAR_IS_NOT_AVAILABLE(1003,"Araç durumu uygun değildir. Lütfen başka bir araç deneyiniz." ,HttpStatus.BAD_REQUEST );

    private Integer code;
    private String message;
    private HttpStatus httpStatus;
}
