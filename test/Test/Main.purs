module Test.Main where

import Prelude

import Effect (Effect)
import Effect.Console (log)
import Partial.Unsafe (unsafeCrashWith)
import Test.Assert (assert, assert', assertEqual, assertEqual', assertFalse, assertFalse', assertThrows, assertThrows', assertTrue, assertTrue')

throwing :: forall a. Unit -> a
throwing _ = unsafeCrashWith "boom"

main :: Effect Unit
main = do
  log "assert: positive cases"

  assert true
  assert' "custom success" true
  assertTrue true
  assertTrue' "custom true" true
  assertFalse false
  assertFalse' "custom false" false

  assertEqual { actual: 42, expected: 42 }
  assertEqual { actual: "same", expected: "same" }
  assertEqual' "custom equality" { actual: true, expected: true }

  assertThrows throwing
  assertThrows' "custom throws" throwing

  log "assert: all positive cases passed"
