#!/usr/bin/env bash

function finish() { set +x ; }
trap finish EXIT

SCRIPTDIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
BASE=${SCRIPTDIR%/*}

# ./gradlew --no-daemon -t jsBrowserDevelopmentRun
./gradlew --no-daemon jsBrowserDevelopmentRun

