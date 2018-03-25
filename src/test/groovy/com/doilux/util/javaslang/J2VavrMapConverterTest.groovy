package com.doilux.util.javaslang

import io.vavr.collection.HashMap
import io.vavr.collection.Map
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class J2VavrMapConverterTest extends Specification {


    private static java.util.Map<Object, Object> INPUT = [
            "a": [
                    "b": [
                            "c": "d",
                            "e": 1
                    ]
            ],
            2  : 3
    ]

    private static Map<Object, Object> OUTPUT = HashMap.of(
            "a", HashMap.of(
            "b", HashMap.of(
            "c", "d",
            "e", 1
    )
    ),
            2, 3
    )


    def "convert #input to #output"() {
        expect:
        J2VavrMapConverter.convert(input) == output

        where:
        input || output
        INPUT || OUTPUT
    }
}
