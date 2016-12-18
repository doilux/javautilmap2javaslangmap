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

## Contribution

1. Fork it ( https://github.com/doilux/javautilmap2javaslangmap )
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -am 'Add some feature')
4. Push to the branch (git push origin my-new-feature)
5. Create new Pull Request

## Licence

This project is licensed under the MIT License - see the LICENSE.txt file for details

## Author

[doilux](https://github.com/doilux)
