package com.doilux.util.javaslang;

import io.vavr.collection.HashMap;
import io.vavr.collection.Map;

import java.util.stream.Collectors;

public class J2VavrMapConverter {

    /**
     * java.util.Mapをio.vavr.collection.Mapに変換する
     *
     * @param src
     * @return
     */
    public static Map<Object, Object> convert(java.util.Map<Object, Object> src) {
        return HashMap.ofAll(src
                .entrySet()
                .stream()
                .collect(
                        Collectors.toMap(
                                e -> e.getKey(),
                                e -> {
                                    Object tmp = e.getValue();
                                    if (tmp instanceof java.util.Map)
                                        return convert((java.util.Map<Object, Object>) tmp);
                                    return tmp;
                                }
                        )
                ));
    }

}
