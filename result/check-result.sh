#!/bin/bash
#
actualFailed=$1
expectedFailed=$2

echo "Actual Failed: $actualFailed"
echo "Expected Failed: $expectedFailed"
echo "====="

float_cmp() {
    awk "BEGIN{exit(!( $* ))}" <&-
}

if float_cmp "$actualFailed < $expectedFailed"; then
  echo "Test Passed because actual failed less than expected failed"
  #exit 1
else
  echo "Test Failed because actual failed is greater or equal than expected failed"
  #write-error "Test Failed";
fi

