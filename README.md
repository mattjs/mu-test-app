Mu Test App
===========

This is a test application for the [Mu Http Server](https://github.com/mattjs/mu)

Building this project requires [Bazel](http://bazel.io/)

You can build and run the app locally with

```
  bazel build :test-app

  bazel-bin/test-app
```

And build a deployable jar using

```
  bazel build :test-app_deploy.jar
```
