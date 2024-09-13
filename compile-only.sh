#!/bin/bash
export HFPATH=src/org/teutonic/herpfortress
javac -d bin --release 8 $HFPATH/*.java $HFPATH/ai/*.java $HFPATH/entity/*.java $HFPATH/entity/pickup/*.java $HFPATH/level/*.java $HFPATH/particle/*.java $HFPATH/unit/*.java $HFPATH/unit/order/*.java $HFPATH/weapon/*.java
