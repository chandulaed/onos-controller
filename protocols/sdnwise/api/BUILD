COMPILE_DEPS = CORE_DEPS + [
    "@sdnwise//jar",
    '//protocols/sdnwise/protocol:onos-protocols-sdnwise-protocol',
    '@io_netty_netty//jar'
]

osgi_jar_with_tests (
    visibility = ["//visibility:public"],
    deps = COMPILE_DEPS
)
