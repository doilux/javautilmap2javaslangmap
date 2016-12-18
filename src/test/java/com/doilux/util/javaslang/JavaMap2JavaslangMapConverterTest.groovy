package com.doilux.util.javaslang

import javaslang.collection.Map
import javaslang.collection.HashMap
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class JavaMap2JavaslangMapConverterTest extends Specification {


    def static java.util.Map<Object, Object> INPUT = [
            "a": [
                    "b": [
                            "c": "d",
                            "e": 1
                    ]
            ],
            2 : 3
    ]

    def static Map<Object, Object> OUTPUT = HashMap.of(
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
        JavaMap2JavaslangMapConverter.convert(input) == output

        where:
        input || output
        INPUT || OUTPUT
    }
}
