# purescript-assert

## JVM tests

`./bin/test` selects `assert` in the [common isolated runner](../javapurs/docs/testing.md#port-particulier), preserving this checkout and its outputs.
Use `./bin/test --help` for options and `./bin/test --clean` to rebuild the backend. The linked guide covers prerequisites, Java target/runtime settings and retained failure logs.

[![Latest release](http://img.shields.io/github/release/purescript/purescript-assert.svg)](https://github.com/purescript/purescript-assert/releases)
[![Build status](https://github.com/purescript/purescript-assert/workflows/CI/badge.svg?branch=master)](https://github.com/purescript/purescript-assert/actions?query=workflow%3ACI+branch%3Amaster)
[![Pursuit](https://pursuit.purescript.org/packages/purescript-assert/badge)](https://pursuit.purescript.org/packages/purescript-assert)

Basic assertions library for low level testing. This is primarily for testing the core libraries that cannot use [`purescript-quickcheck`](https://github.com/purescript/purescript-quickcheck) without resulting in circular dependencies.

## Installation

```
spago install assert
```

## Documentation

Module documentation is [published on Pursuit](http://pursuit.purescript.org/packages/purescript-assert).
