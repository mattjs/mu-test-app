java_import(
    name = "jars",
    jars = glob(["lib/*.jar"]),
)

filegroup(
  name = "views",
  srcs = glob(["app/views/*"]),
)

filegroup(
  name = "conf",
  srcs = glob(["conf/*"]),
)

filegroup(
  name = "public",
  srcs = glob(["public/*/*"]),
)

java_binary(
    name = "mu-test-app",
    srcs = glob([ "**/*.java"]),
    main_class = "com.mu.MuApplication",
    deps = [":jars"],
    data = [":views", ":conf", ":public"],
)

