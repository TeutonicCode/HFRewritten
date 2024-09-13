HFPATH=org/teutonic/herpfortress
javac -d bin --release 8 src/$HFPATH/*.java src/$HFPATH/ai/*.java src/$HFPATH/entity/*.java src/$HFPATH/entity/pickup/*.java src/$HFPATH/level/*.java src/$HFPATH/particle/*.java src/$HFPATH/unit/*.java src/$HFPATH/unit/order/*.java src/$HFPATH/weapon/*.java
cd bin
jar cMvf HerpFortress.jar META-INF/MANIFEST.MF $HFPATH/*.class $HFPATH/*/*.class $HFPATH/*/*/*.class ../res/*
