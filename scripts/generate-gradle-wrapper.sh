#!/usr/bin/env bash
set -e

# Generate Gradle wrapper locally. Requires 'gradle' command to be installed.
if ! command -v gradle >/dev/null 2>&1; then
  echo "gradle is not installed. Install Gradle or run this on a machine with Gradle."
  exit 1
fi

cd android
gradle wrapper --gradle-version 8.3
echo "Gradle wrapper generated in android/ (run ./android/gradlew assembleDebug to build)"
