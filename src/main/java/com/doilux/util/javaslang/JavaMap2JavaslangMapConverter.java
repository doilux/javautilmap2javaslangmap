package com.doilux.util.javaslang;

import javaslang.collection.HashMap;
import javaslang.collection.Map;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.stream.Collectors;

@EqualsAndHashCode(doNotUseGetters = true)
@ToString(includeFieldNames = false)
public class JavaMap2JavaslangMapConverter {

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
