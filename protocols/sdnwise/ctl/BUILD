COMPILE_DEPS = CORE_DEPS + [
    "@openflowj//jar",
    '@sdnwise//jar',
    '//protocols/sdnwise/api:onos-protocols-sdnwise-api',
    '//protocols/sdnwise/driver:onos-protocols-sdnwise-driver',
    '//protocols/sdnwise/protocol:onos-protocols-sdnwise-protocol',
    '@io_netty_netty//jar'
]

TEST_DEPS = TEST + [
    "//core/api:onos-api-tests",
]

osgi_jar_with_tests (
    visibility = ["//visibility:public"],
    deps = COMPILE_DEPS,
    test_deps = TEST_DEPS,
)
