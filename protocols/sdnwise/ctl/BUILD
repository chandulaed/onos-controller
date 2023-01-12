COMPILE_DEPS = CORE_DEPS + KRYO+ [
    "@openflowj//jar",
    '@sdnwise//jar',
    '//protocols/sdnwise/api:onos-protocols-sdnwise-api',
    '//protocols/sdnwise/driver:onos-protocols-sdnwise-driver',
    '//protocols/sdnwise/protocol:onos-protocols-sdnwise-protocol',
    '@io_netty_netty//jar'
]


osgi_jar_with_tests (
    visibility = ["//visibility:public"],
    deps = COMPILE_DEPS,
)
