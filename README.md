Mu Test App
===========

This is a test application for the [Mu Http Server](https://github.com/mattjs/mu)

Building this project requires [Bazel](http://bazel.io/)

You can build and run the app locally with

```
  bazel build :mu-test-app

  bazel-bin/mu-test-app
```

And build a deployable jar using

```
  bazel build :mu-test-app_deploy.jar
```
