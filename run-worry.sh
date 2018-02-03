#!/bin/bash
echo "--------RUNNING WORRY HTN PLANNER----------"
java JSHOP2.InternalDomain worry
java JSHOP2.InternalDomain -r problem
javac gui.java
java -Xss4096K -Xmx1024M gui
rm worry.java; rm worry.txt; rm problem.java; rm *.class
echo "--------FINISHED RUNNING WORRY HTN PLANNER----------"
