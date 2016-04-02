Mu Test App
===========

This is a test application for the [Mu Http Server](https://github.com/mattjs/mu)

Building this project requires [Bazel](http://bazel.io/)

You can build and run the app locally with :

```
  cd mu-test-app
  bazel build :mu-test-app
  bazel-bin/mu-test-app
```

You must run this from the 'application' directory (mu-test-app/mu-test-app) for resources 
to load correctly.

A deployable jar can be built using :

```
  bazel build :mu-test-app_deploy.jar
```

The jar on the otherhand pulls in all the resources so will run from anywhere.
