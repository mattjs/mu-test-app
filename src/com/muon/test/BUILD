java_import(
    name = "jars",
    jars = glob(["lib/*.jar"]),
)

filegroup(
  name = "views",
  srcs = glob(["**/app/views/*"]),
)

java_binary(
    name = "test-app",
    srcs = glob([ "**/*.java"]),
    main_class = "models.Test",
    deps = [":jars"],
    data = [":views"],
)

