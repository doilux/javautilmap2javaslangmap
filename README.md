javautilmap2javaslangmap
====

Convert java.util.Map to javaslang.collection.Map(Even if nested)

## Description

This is Convert Tool.

For Example(Groovy Code - see the JavaMap2JavaslangMapConverterTest.groovy file for details):

```
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

    JavaMap2JavaslangMapConverter.convert(input) == output // true
```

## Usage
edit build.gradle

### example
```$xslt
repositories {
    maven {
        url 'https://doilux.github.io/javautilmap2javaslangmap/'
    }
}

dependencies {
    compile "work.doilux:javautilmap2javaslangmap:1.0.0"
}
```

## Licence

This project is licensed under the MIT License - see the LICENSE.txt file for details

## Author

[doilux](https://github.com/doilux)
