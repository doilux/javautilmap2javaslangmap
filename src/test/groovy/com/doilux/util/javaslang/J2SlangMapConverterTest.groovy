package com.doilux.util.javaslang

import javaslang.collection.HashMap
import javaslang.collection.Map
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class J2SlangMapConverterTest extends Specification {


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
        J2SlangMapConverter.convert(input) == output

        where:
        input || output
        INPUT || OUTPUT
    }
}
