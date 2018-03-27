JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	run.java \
    Differentiator.java \
    Tables.java \
    AnomalyDetector.java \
    CSVParser.java \
    Student.java \
    Employer.java \
    FileIO.java \
    StringManipulator.java \
    RTO.java \
    Units.java \
	Sorts.java \
	Display.java \
	UserInput.java \
    

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
